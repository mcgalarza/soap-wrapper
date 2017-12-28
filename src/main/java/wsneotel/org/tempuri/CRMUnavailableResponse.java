
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
 *         &lt;element name="CRM_UnavailableResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "crmUnavailableResult"
})
@XmlRootElement(name = "CRM_UnavailableResponse")
public class CRMUnavailableResponse {

    @XmlElement(name = "CRM_UnavailableResult")
    protected boolean crmUnavailableResult;

    /**
     * Obtiene el valor de la propiedad crmUnavailableResult.
     * 
     */
    public boolean isCRMUnavailableResult() {
        return crmUnavailableResult;
    }

    /**
     * Define el valor de la propiedad crmUnavailableResult.
     * 
     */
    public void setCRMUnavailableResult(boolean value) {
        this.crmUnavailableResult = value;
    }

}
