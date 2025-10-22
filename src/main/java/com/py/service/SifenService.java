package com.py.service;

import java.math.BigInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.py.sifenpy.client.ruc.DeWsConsultasConsultaRuc;
import com.py.sifenpy.client.ruc.RResEnviConsRUC;
import com.py.sifenpy.client.ruc.TContenedorRuc;

import jakarta.xml.ws.Holder;
import jakarta.xml.ws.WebServiceException;

@Service
public class SifenService {
    
    private static final Logger log = LoggerFactory.getLogger(SifenService.class);

    private final DeWsConsultasConsultaRuc consultaRucPort;

    /**
     * Inyecta el cliente SOAP para la consulta de RUC a través del constructor.
     * Spring se encarga de proporcionar la instancia del bean configurado en SoapClientConfig.
     *
     * @param consultaRucPort El bean del cliente SOAP.
     */
    public SifenService(DeWsConsultasConsultaRuc consultaRucPort) {
        this.consultaRucPort = consultaRucPort;
    }

    /**
     * Realiza una consulta de RUC al servicio de SIFEN.
     *
     * @param ruc El número de RUC a consultar (sin el dígito verificador).
     * @return El objeto RResEnviConsRUC con la respuesta completa de SIFEN.
     * @throws RuntimeException si la consulta no es exitosa o si ocurre un error.
     */
    public RResEnviConsRUC consultarRuc(String ruc) {
        try {
            log.info("Iniciando consulta de RUC para: {}", ruc);

            // 1. Preparar los parámetros de entrada
            BigInteger dId = BigInteger.valueOf(System.currentTimeMillis());

            // 2. Preparar los Holders para los parámetros de salida (OUT)
            Holder<String> dCodRes = new Holder<>();
            Holder<String> dMsgRes = new Holder<>();
            Holder<TContenedorRuc> xContRUC = new Holder<>();

            // 3. Invocar el método del cliente SOAP. No devuelve nada (void).
            // Los resultados se poblarán en los objetos Holder.
            consultaRucPort.rEnviConsRUC(dId, ruc, dCodRes, dMsgRes, xContRUC);

            log.info("Respuesta de SIFEN: Código={}, Mensaje='{}'", dCodRes.value, dMsgRes.value);

            // 4. Construir el objeto de respuesta con los valores obtenidos de los Holders.
            RResEnviConsRUC response = new RResEnviConsRUC();
            response.setDCodRes(dCodRes.value);
            response.setDMsgRes(dMsgRes.value);
            response.setXContRUC(xContRUC.value);

            // Si el contenedor del RUC no es nulo, la consulta fue exitosa.
            if (response.getXContRUC() != null) {
                return response;
            } else {
                throw new RuntimeException("Consulta a SIFEN fallida: " + dMsgRes.value);
            }
        } catch (WebServiceException e) {
            log.error("Fallo la comunicación con el servicio de consulta de RUC para {}", ruc, e);
            throw new RuntimeException("Error al comunicarse con el servicio de SIFEN: " + e.getMessage(), e);
        }
    }
}
