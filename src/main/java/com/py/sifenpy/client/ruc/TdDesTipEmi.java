
package com.py.sifenpy.client.ruc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesTipEmi.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tdDesTipEmi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;minLength value="6"/&gt;
 *     &lt;maxLength value="12"/&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Contingencia"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tdDesTipEmi")
@XmlEnum
public enum TdDesTipEmi {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Contingencia")
    CONTINGENCIA("Contingencia");
    private final String value;

    TdDesTipEmi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesTipEmi fromValue(String v) {
        for (TdDesTipEmi c: TdDesTipEmi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
