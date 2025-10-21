
package com.py.sifenpy.client.ruc;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dId" type="{http://ekuatia.set.gov.py/sifen/xsd}dIdType"/&gt;
 *         &lt;element name="dRUCCons" type="{http://ekuatia.set.gov.py/sifen/xsd}tRuc"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dId",
    "drucCons"
})
@XmlRootElement(name = "rEnviConsRUC")
public class REnviConsRUC {

    @XmlElement(required = true)
    protected BigInteger dId;
    @XmlElement(name = "dRUCCons", required = true)
    protected String drucCons;

    /**
     * Obtiene el valor de la propiedad dId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDId() {
        return dId;
    }

    /**
     * Define el valor de la propiedad dId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDId(BigInteger value) {
        this.dId = value;
    }

    /**
     * Obtiene el valor de la propiedad drucCons.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRUCCons() {
        return drucCons;
    }

    /**
     * Define el valor de la propiedad drucCons.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRUCCons(String value) {
        this.drucCons = value;
    }

}
