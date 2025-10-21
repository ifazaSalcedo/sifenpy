
package com.py.sifenpy.client.ruc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesTiDE.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tdDesTiDE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Factura electrónica"/&gt;
 *     &lt;enumeration value="Nota de crédito electrónica"/&gt;
 *     &lt;enumeration value="Nota de débito electrónica"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tdDesTiDE")
@XmlEnum
public enum TdDesTiDE {

    @XmlEnumValue("Factura electr\u00f3nica")
    FACTURA_ELECTRÓNICA("Factura electr\u00f3nica"),
    @XmlEnumValue("Nota de cr\u00e9dito electr\u00f3nica")
    NOTA_DE_CRÉDITO_ELECTRÓNICA("Nota de cr\u00e9dito electr\u00f3nica"),
    @XmlEnumValue("Nota de d\u00e9bito electr\u00f3nica")
    NOTA_DE_DÉBITO_ELECTRÓNICA("Nota de d\u00e9bito electr\u00f3nica");
    private final String value;

    TdDesTiDE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesTiDE fromValue(String v) {
        for (TdDesTiDE c: TdDesTiDE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
