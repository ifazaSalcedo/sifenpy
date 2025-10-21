
package com.py.sifenpy.client.ruc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 *  Respuesta del protocolo de procesamiento del DE 
 * 
 * <p>Clase Java para tContenedorRuc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tContenedorRuc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dRUCCons" type="{http://ekuatia.set.gov.py/sifen/xsd}tRuc"/&gt;
 *         &lt;element name="dRazCons"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;whiteSpace value="preserve"/&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dCodEstCons"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dDesEstCons"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dRUCFactElec"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tContenedorRuc", propOrder = {
    "drucCons",
    "dRazCons",
    "dCodEstCons",
    "dDesEstCons",
    "drucFactElec"
})
public class TContenedorRuc {

    @XmlElement(name = "dRUCCons", required = true)
    protected String drucCons;
    @XmlElement(required = true)
    protected String dRazCons;
    @XmlElement(required = true)
    protected String dCodEstCons;
    @XmlElement(required = true)
    protected String dDesEstCons;
    @XmlElement(name = "dRUCFactElec", required = true)
    protected String drucFactElec;

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

    /**
     * Obtiene el valor de la propiedad dRazCons.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRazCons() {
        return dRazCons;
    }

    /**
     * Define el valor de la propiedad dRazCons.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRazCons(String value) {
        this.dRazCons = value;
    }

    /**
     * Obtiene el valor de la propiedad dCodEstCons.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCodEstCons() {
        return dCodEstCons;
    }

    /**
     * Define el valor de la propiedad dCodEstCons.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCodEstCons(String value) {
        this.dCodEstCons = value;
    }

    /**
     * Obtiene el valor de la propiedad dDesEstCons.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDesEstCons() {
        return dDesEstCons;
    }

    /**
     * Define el valor de la propiedad dDesEstCons.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDesEstCons(String value) {
        this.dDesEstCons = value;
    }

    /**
     * Obtiene el valor de la propiedad drucFactElec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRUCFactElec() {
        return drucFactElec;
    }

    /**
     * Define el valor de la propiedad drucFactElec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRUCFactElec(String value) {
        this.drucFactElec = value;
    }

}
