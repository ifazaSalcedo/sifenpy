
package com.py.sifenpy.client.ruc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDCondCred.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tdDCondCred"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Plazo"/&gt;
 *     &lt;enumeration value="Cuota"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tdDCondCred")
@XmlEnum
public enum TdDCondCred {

    @XmlEnumValue("Plazo")
    PLAZO("Plazo"),
    @XmlEnumValue("Cuota")
    CUOTA("Cuota");
    private final String value;

    TdDCondCred(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDCondCred fromValue(String v) {
        for (TdDCondCred c: TdDCondCred.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
