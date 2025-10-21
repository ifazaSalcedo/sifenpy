
package com.py.sifenpy.client.ruc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDCondOpe.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tdDCondOpe"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Contado"/&gt;
 *     &lt;enumeration value="Crédito"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tdDCondOpe")
@XmlEnum
public enum TdDCondOpe {

    @XmlEnumValue("Contado")
    CONTADO("Contado"),
    @XmlEnumValue("Cr\u00e9dito")
    CRÉDITO("Cr\u00e9dito");
    private final String value;

    TdDCondOpe(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDCondOpe fromValue(String v) {
        for (TdDCondOpe c: TdDCondOpe.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
