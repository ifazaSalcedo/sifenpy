
package com.py.sifenpy.client.ruc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesMotEmi.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tdDesMotEmi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Anulación"/&gt;
 *     &lt;enumeration value="Devolución"/&gt;
 *     &lt;enumeration value="Descuento"/&gt;
 *     &lt;enumeration value="Bonificación"/&gt;
 *     &lt;enumeration value="Crédito incobrable"/&gt;
 *     &lt;enumeration value="Recupero de costo"/&gt;
 *     &lt;enumeration value="Recupero de gasto"/&gt;
 *     &lt;enumeration value="Ajuste de precio"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tdDesMotEmi")
@XmlEnum
public enum TdDesMotEmi {

    @XmlEnumValue("Anulaci\u00f3n")
    ANULACIÓN("Anulaci\u00f3n"),
    @XmlEnumValue("Devoluci\u00f3n")
    DEVOLUCIÓN("Devoluci\u00f3n"),
    @XmlEnumValue("Descuento")
    DESCUENTO("Descuento"),
    @XmlEnumValue("Bonificaci\u00f3n")
    BONIFICACIÓN("Bonificaci\u00f3n"),
    @XmlEnumValue("Cr\u00e9dito incobrable")
    CRÉDITO_INCOBRABLE("Cr\u00e9dito incobrable"),
    @XmlEnumValue("Recupero de costo")
    RECUPERO_DE_COSTO("Recupero de costo"),
    @XmlEnumValue("Recupero de gasto")
    RECUPERO_DE_GASTO("Recupero de gasto"),
    @XmlEnumValue("Ajuste de precio")
    AJUSTE_DE_PRECIO("Ajuste de precio");
    private final String value;

    TdDesMotEmi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesMotEmi fromValue(String v) {
        for (TdDesMotEmi c: TdDesMotEmi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
