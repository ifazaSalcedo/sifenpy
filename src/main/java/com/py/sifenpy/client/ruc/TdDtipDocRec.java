
package com.py.sifenpy.client.ruc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDtipDocRec.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tdDtipDocRec"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cédula paraguaya"/&gt;
 *     &lt;enumeration value="Pasaporte"/&gt;
 *     &lt;enumeration value="Cédula extranjera"/&gt;
 *     &lt;enumeration value="Carnet de residencia"/&gt;
 *     &lt;enumeration value="Innominado"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tdDtipDocRec")
@XmlEnum
public enum TdDtipDocRec {

    @XmlEnumValue("C\u00e9dula paraguaya")
    CÉDULA_PARAGUAYA("C\u00e9dula paraguaya"),
    @XmlEnumValue("Pasaporte")
    PASAPORTE("Pasaporte"),
    @XmlEnumValue("C\u00e9dula extranjera")
    CÉDULA_EXTRANJERA("C\u00e9dula extranjera"),
    @XmlEnumValue("Carnet de residencia")
    CARNET_DE_RESIDENCIA("Carnet de residencia"),
    @XmlEnumValue("Innominado")
    INNOMINADO("Innominado");
    private final String value;

    TdDtipDocRec(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDtipDocRec fromValue(String v) {
        for (TdDtipDocRec c: TdDtipDocRec.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
