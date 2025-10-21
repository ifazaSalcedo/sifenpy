
package com.py.sifenpy.client.ruc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesAfecIVA.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tdDesAfecIVA"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Gravado IVA"/&gt;
 *     &lt;enumeration value="Exonerado (Art. 83- Ley 125/91)"/&gt;
 *     &lt;enumeration value="Exento"/&gt;
 *     &lt;enumeration value="Gravado parcial (Grav- Exento)"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tdDesAfecIVA")
@XmlEnum
public enum TdDesAfecIVA {

    @XmlEnumValue("Gravado IVA")
    GRAVADO_IVA("Gravado IVA"),
    @XmlEnumValue("Exonerado (Art. 83- Ley 125/91)")
    EXONERADO_ART_83_LEY_125_91("Exonerado (Art. 83- Ley 125/91)"),
    @XmlEnumValue("Exento")
    EXENTO("Exento"),
    @XmlEnumValue("Gravado parcial (Grav- Exento)")
    GRAVADO_PARCIAL_GRAV_EXENTO("Gravado parcial (Grav- Exento)");
    private final String value;

    TdDesAfecIVA(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesAfecIVA fromValue(String v) {
        for (TdDesAfecIVA c: TdDesAfecIVA.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
