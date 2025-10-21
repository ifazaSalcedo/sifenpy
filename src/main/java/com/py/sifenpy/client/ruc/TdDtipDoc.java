
package com.py.sifenpy.client.ruc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDtipDoc.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tdDtipDoc"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cédula paraguaya"/&gt;
 *     &lt;enumeration value="Pasaporte"/&gt;
 *     &lt;enumeration value="Cédula extranjera"/&gt;
 *     &lt;enumeration value="Carnet de residencia"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tdDtipDoc")
@XmlEnum
public enum TdDtipDoc {

    @XmlEnumValue("C\u00e9dula paraguaya")
    CÉDULA_PARAGUAYA("C\u00e9dula paraguaya"),
    @XmlEnumValue("Pasaporte")
    PASAPORTE("Pasaporte"),
    @XmlEnumValue("C\u00e9dula extranjera")
    CÉDULA_EXTRANJERA("C\u00e9dula extranjera"),
    @XmlEnumValue("Carnet de residencia")
    CARNET_DE_RESIDENCIA("Carnet de residencia");
    private final String value;

    TdDtipDoc(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDtipDoc fromValue(String v) {
        for (TdDtipDoc c: TdDtipDoc.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
