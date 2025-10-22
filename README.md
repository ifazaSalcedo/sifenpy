# SifenPy - Cliente SOAP para SIFEN en Spring Boot

Este proyecto es una aplicación de ejemplo construida con Spring Boot que demuestra cómo consumir un servicio web SOAP protegido con autenticación mutua (mTLS). Específicamente, se conecta al endpoint de **Consulta de RUC** del Sistema Integrado de Facturación Electrónica Nacional (SIFEN) de Paraguay.

## Requisitos

- **Java 17** o superior.
- **Apache Maven** 3.6 o superior.
- Un **Certificado Digital** en formato `.p12` válido para el ambiente de pruebas de SIFEN.

## Configuración

Antes de ejecutar la aplicación, es necesario configurar el certificado digital y su contraseña.

### 1. Certificado Digital (.p12)

1.  Crea la siguiente estructura de directorios dentro del proyecto:
    ```
    src/main/resources/keystorefile/
    ```
2.  Copia tu archivo de certificado `.p12` dentro de esa carpeta.

3.  Abre el archivo `src/main/resources/application.properties` y asegúrate de que la propiedad `sifenpy.soap.keystore.path` apunte a tu archivo.

    ```properties
    # Ruta al archivo del certificado. 'classpath:' indica que está en 'src/main/resources'.
    sifenpy.soap.keystore.path=classpath:keystorefile/TU_CERTIFICADO.p12
    ```

> **Nota de Seguridad**: El archivo `.gitignore` está configurado para ignorar la carpeta `keystorefile/`, por lo que tu certificado no será subido al repositorio de Git.

### 2. Contraseña del Certificado (Variable de Entorno)

Para evitar exponer la contraseña del certificado en el código fuente, la aplicación está configurada para leerla desde una variable de entorno llamada `SIFEN_KEYSTORE_PASSWORD`.

Debes exportar esta variable en la terminal que usarás para ejecutar la aplicación.

**En Linux o macOS:**
```bash
export SIFEN_KEYSTORE_PASSWORD='tu_contraseña_secreta'
```

**En Windows (Command Prompt):**
```cmd
set SIFEN_KEYSTORE_PASSWORD=tu_contraseña_secreta
```

**En Windows (PowerShell):**
```powershell
$env:SIFEN_KEYSTORE_PASSWORD="tu_contraseña_secreta"
```

## Cómo Ejecutar la Aplicación

Una vez configurado el certificado y la variable de entorno, puedes iniciar la aplicación usando Maven:

```bash
mvn spring-boot:run
```

La aplicación se iniciará en el puerto `8080` por defecto.

## Endpoints de la API

### Consultar RUC

Realiza una consulta de los datos de un contribuyente a partir de su RUC.

- **URL**: `/api/sifen/consulta-ruc/{ruc}`
- **Método**: `GET`
- **Parámetros de URL**:
  - `{ruc}`: El número de RUC a consultar (sin el dígito verificador).

#### Ejemplo de uso con cURL:

```bash
curl -X GET http://localhost:8080/api/sifen/consulta-ruc/3489773
```

#### Respuesta Exitosa (Ejemplo):
```json
{
    "dCodRes": "0201",
    "dMsgRes": "RUC encontrado",
    "xContRUC": {
        "dRUCCons": "3489773",
        "dRazSoc": "NOMBRE DEL CONTRIBUYENTE",
        "dEst": "ACTIVO",
        "dTipCont": "PERSONA FISICA"
    }
}
```
