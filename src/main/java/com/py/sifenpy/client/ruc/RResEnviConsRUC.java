
package com.py.sifenpy.client.ruc;

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
 *         &lt;element name="dCodRes"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dMsgRes"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="xContRUC" type="{http://ekuatia.set.gov.py/sifen/xsd}tContenedorRuc" minOccurs="0"/&gt;
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
    "dCodRes",
    "dMsgRes",
    "xContRUC"
})
@XmlRootElement(name = "rResEnviConsRUC")
public class RResEnviConsRUC {

    @XmlElement(required = true)
    protected String dCodRes;
    @XmlElement(required = true)
    protected String dMsgRes;
    protected TContenedorRuc xContRUC;

    /**
     * Obtiene el valor de la propiedad dCodRes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCodRes() {
        return dCodRes;
    }

    /**
     * Define el valor de la propiedad dCodRes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCodRes(String value) {
        this.dCodRes = value;
    }

    /**
     * Obtiene el valor de la propiedad dMsgRes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMsgRes() {
        return dMsgRes;
    }

    /**
     * Define el valor de la propiedad dMsgRes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMsgRes(String value) {
        this.dMsgRes = value;
    }

    /**
     * Obtiene el valor de la propiedad xContRUC.
     * 
     * @return
     *     possible object is
     *     {@link TContenedorRuc }
     *     
     */
    public TContenedorRuc getXContRUC() {
        return xContRUC;
    }

    /**
     * Define el valor de la propiedad xContRUC.
     * 
     * @param value
     *     allowed object is
     *     {@link TContenedorRuc }
     *     
     */
    public void setXContRUC(TContenedorRuc value) {
        this.xContRUC = value;
    }

}
