
package com.py.sifenpy.client.ruc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesTipDocAso.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tdDesTipDocAso"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Electrónico"/&gt;
 *     &lt;enumeration value="Impreso"/&gt;
 *     &lt;minLength value="1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tdDesTipDocAso")
@XmlEnum
public enum TdDesTipDocAso {

    @XmlEnumValue("Electr\u00f3nico")
    ELECTRÓNICO("Electr\u00f3nico"),
    @XmlEnumValue("Impreso")
    IMPRESO("Impreso");
    private final String value;

    TdDesTipDocAso(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesTipDocAso fromValue(String v) {
        for (TdDesTipDocAso c: TdDesTipDocAso.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
