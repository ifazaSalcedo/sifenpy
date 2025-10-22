package com.py.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

/**
 * Mapea las propiedades de configuración de SIFEN definidas en application.properties.
 * Permite un acceso tipado y centralizado a la configuración del cliente SOAP.
 */
@ConfigurationProperties(prefix = "sifenpy.soap")
public class SifenProperties {

    private Keystore keystore = new Keystore();
    private Endpoint endpoint = new Endpoint();

    public Keystore getKeystore() {
        return keystore;
    }

    public void setKeystore(Keystore keystore) {
        this.keystore = keystore;
    }

    public Endpoint getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    public static class Keystore {
        private Resource path;
        private String password;
        private String type;

        // Getters y Setters
        public Resource getPath() { return path; }
        public void setPath(Resource path) { this.path = path; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }
    }

    public static class Endpoint {
        private String consultaRuc;

        // Getters y Setters
        public String getConsultaRuc() {
            return consultaRuc;
        }

        public void setConsultaRuc(String consultaRuc) {
            this.consultaRuc = consultaRuc;
        }
    }
}
