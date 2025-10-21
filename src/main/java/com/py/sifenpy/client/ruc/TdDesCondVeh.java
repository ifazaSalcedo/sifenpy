
package com.py.sifenpy.client.ruc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesCondVeh.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tdDesCondVeh"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Acabado"/&gt;
 *     &lt;enumeration value="Semi-acabado"/&gt;
 *     &lt;enumeration value="Inacabado"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tdDesCondVeh")
@XmlEnum
public enum TdDesCondVeh {

    @XmlEnumValue("Acabado")
    ACABADO("Acabado"),
    @XmlEnumValue("Semi-acabado")
    SEMI_ACABADO("Semi-acabado"),
    @XmlEnumValue("Inacabado")
    INACABADO("Inacabado");
    private final String value;

    TdDesCondVeh(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesCondVeh fromValue(String v) {
        for (TdDesCondVeh c: TdDesCondVeh.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
