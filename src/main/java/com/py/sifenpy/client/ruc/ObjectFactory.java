
package com.py.sifenpy.client.ruc;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.py.sifenpy.client.ruc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.py.sifenpy.client.ruc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link REnviConsRUC }
     * 
     */
    public REnviConsRUC createREnviConsRUC() {
        return new REnviConsRUC();
    }

    /**
     * Create an instance of {@link RResEnviConsRUC }
     * 
     */
    public RResEnviConsRUC createRResEnviConsRUC() {
        return new RResEnviConsRUC();
    }

    /**
     * Create an instance of {@link TContenedorRuc }
     * 
     */
    public TContenedorRuc createTContenedorRuc() {
        return new TContenedorRuc();
    }

}
