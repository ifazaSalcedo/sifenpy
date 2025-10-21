
package com.py.sifenpy.client.ruc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesTTrans.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tdDesTTrans"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Propio"/&gt;
 *     &lt;enumeration value="Tercero"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tdDesTTrans")
@XmlEnum
public enum TdDesTTrans {

    @XmlEnumValue("Propio")
    PROPIO("Propio"),
    @XmlEnumValue("Tercero")
    TERCERO("Tercero");
    private final String value;

    TdDesTTrans(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesTTrans fromValue(String v) {
        for (TdDesTTrans c: TdDesTTrans.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
