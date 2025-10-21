# Cliente SOAP para SIFEN (Paraguay) con Spring Boot y Apache CXF

Este es un proyecto de demostración que muestra cómo consumir un servicio web SOAP, específicamente el servicio de **Consulta de RUC** del Sistema Integrado de Facturación Electrónica Nacional (SIFEN) de Paraguay, utilizando Spring Boot y el framework Apache CXF.

## Funcionalidades Principales

1.  **Generación de Cliente SOAP desde WSDL**: El proyecto está configurado para generar automáticamente las clases Java necesarias para consumir el servicio SOAP a partir de un archivo WSDL local.
2.  **Manejo de Dependencias de Esquemas (XSD)**: Utiliza un catálogo JAX-WS (`jax-ws-catalog.xml`) para resolver las ubicaciones de los archivos XSD importados por el WSDL, permitiendo una estructura de proyecto organizada y un proceso de build más robusto.
3.  **Integración con Spring Boot**: Muestra la configuración necesaria para integrar un cliente Apache CXF en una aplicación Spring Boot.

## Tecnologías Utilizadas

- **Java 17**
- **Spring Boot 3.3.1**
- **Apache CXF 4.0.4**: Framework para la creación y consumo de servicios web (SOAP y REST).
- **Maven**: Herramienta para la gestión de dependencias y construcción del proyecto.
- **Lombok**: Para reducir el código repetitivo (boilerplate).

---

## ¿Cómo funciona la generación del cliente?

La magia ocurre gracias al plugin `cxf-codegen-plugin` configurado en el `pom.xml`.

```xml
<plugin>
    <groupId>org.apache.cxf</groupId>
    <artifactId>cxf-codegen-plugin</artifactId>
    <version>4.0.4</version>
    <executions>
        <execution>
            <id>generate-sources</id>
            <phase>generate-sources</phase>
            <configuration>
                <!-- 1. Las clases se generan en src/main/java -->
                <sourceRoot>${project.basedir}/src/main/java</sourceRoot>
                
                <!-- 2. Se procesa este archivo WSDL -->
                <wsdl>${project.basedir}/src/main/resources/wsdl/consulta-ruc.wsdl</wsdl>
                
                <!-- 3. Se usa un catálogo para encontrar los XSD en otras carpetas -->
                <catalog>${project.basedir}/src/main/resources/META-INF/ax-ws-catalog.xml</catalog>
                
                <!-- 4. Las clases generadas se colocan en este paquete -->
                <extraargs>
                    <extraarg>-p</extraarg>
                    <extraarg>com.py.sifenpy.client.ruc</extraarg>
                </extraargs>
            </configuration>
            <goals>
                <goal>wsdl2java</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

Este plugin se ejecuta durante la fase `generate-sources` de Maven, antes de la compilación, asegurando que las clases del cliente estén disponibles para el resto de la aplicación.

### Estructura de Archivos Relevante

```
/
├── src/main/java/com/py/sifenpy/client/ruc/  -> (Directorio para las clases generadas)
│
├── src/main/resources/
│   ├── wsdl/
│   │   └── consulta-ruc.wsdl                 -> Contrato del servicio web.
│   ├── xsd/
│   │   └── consulta-ruc.wsdl.xsd1.xsd        -> Esquema de datos importado por el WSDL.
│   └── META-INF/
│       └── ax-ws-catalog.xml                 -> Mapea el XSD a su ubicación local.
│
└── pom.xml                                     -> Configuración del proyecto y del plugin.
```

---

## Cómo Construir y Ejecutar el Proyecto

### Prerrequisitos
- JDK 17 o superior.
- Apache Maven.

### 1. Construir el Proyecto

Abre una terminal en la raíz del proyecto y ejecuta el siguiente comando. Este comando generará las clases del cliente SOAP y compilará el proyecto.

```bash
mvn clean install
```

### 2. Ejecutar la Aplicación

Una vez construido, puedes ejecutar la aplicación Spring Boot con:

```bash
mvn spring-boot:run
```

