package com.py.config;

import java.io.InputStream;
import java.security.KeyStore;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.py.sifenpy.client.ruc.DeWsConsultasConsultaRuc;

import jakarta.xml.ws.soap.SOAPBinding;

@Configuration
@EnableConfigurationProperties(SifenProperties.class)
public class SoapClientConfig {

    private final SifenProperties sifenProperties;

    public SoapClientConfig(SifenProperties sifenProperties) {
        this.sifenProperties = sifenProperties;
    }

    /**
     * Crea y configura un bean para el cliente SOAP del servicio de Consulta de RUC.
     * Este método puede ser replicado para los otros servicios de SIFEN.
     *
     * @return Una instancia del proxy del cliente SOAP lista para ser usada.
     * @throws Exception si ocurre un error al cargar el keystore o configurar el cliente.
     */
    @Bean
    public DeWsConsultasConsultaRuc consultaRucPort() throws Exception {
        // Usamos JaxWsProxyFactoryBean para tener control total sobre la creación del cliente.
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        // 1. Especificamos la interfaz del servicio que queremos implementar.
        factory.setServiceClass(DeWsConsultasConsultaRuc.class);

        // 2. Forzamos el uso de SOAP 1.2, como lo especifica el WSDL de SIFEN.
        factory.setBindingId(SOAPBinding.SOAP12HTTP_BINDING);

        // 3. Establecemos la URL del endpoint desde nuestro archivo de propiedades.
        factory.setAddress(sifenProperties.getEndpoint().getConsultaRuc());

        // 4. (DEBUG) Añadimos un interceptor para ver el mensaje SOAP saliente en la consola.
        // Esto es vital para diagnosticar problemas de formato.
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        // 5. Creamos la instancia del cliente.
        DeWsConsultasConsultaRuc client = (DeWsConsultasConsultaRuc) factory.create();

        // 6. Obtenemos el cliente subyacente para configurar propiedades avanzadas.
        Client proxy = ClientProxy.getClient(client);

        // 7. (COMPATIBILIDAD) Forzamos la cabecera SOAPAction a estar vacía.
        // Algunos servidores son muy estrictos con esto y puede resolver errores 400.
        proxy.getRequestContext().put("SOAPAction", "");

        // 8. Configuramos la seguridad TLS para la autenticación con certificado.
        configureTLS(client);

        return client;
    }

    /**
     * Configura el conducto HTTP del cliente SOAP para usar TLS con el certificado del cliente.
     * Esto es requerido por SIFEN para la autenticación.
     *
     * @param port El puerto/cliente SOAP a configurar.
     * @throws Exception si hay un problema al cargar el keystore o configurar los parámetros TLS.
     */
    private void configureTLS(Object port) throws Exception {
        HTTPConduit httpConduit = (HTTPConduit) ClientProxy.getClient(port).getConduit();

        // Cargar el KeyStore desde la ruta especificada en las propiedades
        KeyStore keyStore = KeyStore.getInstance(sifenProperties.getKeystore().getType());

        try (InputStream is = sifenProperties.getKeystore().getPath().getInputStream()) {
            keyStore.load(is, sifenProperties.getKeystore().getPassword().toCharArray());
        }

        // Crear KeyManager
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStore, sifenProperties.getKeystore().getPassword().toCharArray());
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();

        // Configurar parámetros TLS
        TLSClientParameters tlsClientParameters = new TLSClientParameters();
        tlsClientParameters.setKeyManagers(keyManagers);
        tlsClientParameters.setDisableCNCheck(true); // Necesario para los endpoints de SIFEN

        httpConduit.setTlsClientParameters(tlsClientParameters);
    }
}
