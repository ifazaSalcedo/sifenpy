
package com.py.sifenpy.client.ruc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesTiPag.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tdDesTiPag"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Efectivo"/&gt;
 *     &lt;enumeration value="Cheque"/&gt;
 *     &lt;enumeration value="Tarjeta de crédito"/&gt;
 *     &lt;enumeration value="Tarjeta de débito"/&gt;
 *     &lt;enumeration value="Transferencia"/&gt;
 *     &lt;enumeration value="Giro"/&gt;
 *     &lt;enumeration value="Billetera electrónica"/&gt;
 *     &lt;enumeration value="Tarjeta empresarial"/&gt;
 *     &lt;enumeration value="Vale"/&gt;
 *     &lt;enumeration value="Retención"/&gt;
 *     &lt;enumeration value="Anticipo"/&gt;
 *     &lt;enumeration value="Valor fiscal"/&gt;
 *     &lt;enumeration value="Valor comercial"/&gt;
 *     &lt;enumeration value="Compensación"/&gt;
 *     &lt;enumeration value="Permuta"/&gt;
 *     &lt;enumeration value="Pago bancario"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tdDesTiPag")
@XmlEnum
public enum TdDesTiPag {

    @XmlEnumValue("Efectivo")
    EFECTIVO("Efectivo"),
    @XmlEnumValue("Cheque")
    CHEQUE("Cheque"),
    @XmlEnumValue("Tarjeta de cr\u00e9dito")
    TARJETA_DE_CRÉDITO("Tarjeta de cr\u00e9dito"),
    @XmlEnumValue("Tarjeta de d\u00e9bito")
    TARJETA_DE_DÉBITO("Tarjeta de d\u00e9bito"),
    @XmlEnumValue("Transferencia")
    TRANSFERENCIA("Transferencia"),
    @XmlEnumValue("Giro")
    GIRO("Giro"),
    @XmlEnumValue("Billetera electr\u00f3nica")
    BILLETERA_ELECTRÓNICA("Billetera electr\u00f3nica"),
    @XmlEnumValue("Tarjeta empresarial")
    TARJETA_EMPRESARIAL("Tarjeta empresarial"),
    @XmlEnumValue("Vale")
    VALE("Vale"),
    @XmlEnumValue("Retenci\u00f3n")
    RETENCIÓN("Retenci\u00f3n"),
    @XmlEnumValue("Anticipo")
    ANTICIPO("Anticipo"),
    @XmlEnumValue("Valor fiscal")
    VALOR_FISCAL("Valor fiscal"),
    @XmlEnumValue("Valor comercial")
    VALOR_COMERCIAL("Valor comercial"),
    @XmlEnumValue("Compensaci\u00f3n")
    COMPENSACIÓN("Compensaci\u00f3n"),
    @XmlEnumValue("Permuta")
    PERMUTA("Permuta"),
    @XmlEnumValue("Pago bancario")
    PAGO_BANCARIO("Pago bancario");
    private final String value;

    TdDesTiPag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesTiPag fromValue(String v) {
        for (TdDesTiPag c: TdDesTiPag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
