
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="BASE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IDCONTACTO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "base",
    "idcontacto"
})
@XmlRootElement(name = "CloseContact")
public class CloseContact {

    @XmlElement(name = "BASE")
    protected int base;
    @XmlElement(name = "IDCONTACTO")
    protected int idcontacto;

    /**
     * Obtiene el valor de la propiedad base.
     * 
     */
    public int getBASE() {
        return base;
    }

    /**
     * Define el valor de la propiedad base.
     * 
     */
    public void setBASE(int value) {
        this.base = value;
    }

    /**
     * Obtiene el valor de la propiedad idcontacto.
     * 
     */
    public int getIDCONTACTO() {
        return idcontacto;
    }

    /**
     * Define el valor de la propiedad idcontacto.
     * 
     */
    public void setIDCONTACTO(int value) {
        this.idcontacto = value;
    }

}
