
package com.py.sifenpy.client.ruc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesTImp.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tdDesTImp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IVA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tdDesTImp")
@XmlEnum
public enum TdDesTImp {


    /**
     * 
     * 						Corresponde al codigo 1 del campo dDesTimp
     * 					
     * 
     */
    IVA;

    public String value() {
        return name();
    }

    public static TdDesTImp fromValue(String v) {
        return valueOf(v);
    }

}
