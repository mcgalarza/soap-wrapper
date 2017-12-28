
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
 *         &lt;element name="CRM_Mostrando_Contacto_CRM_InternoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "crmMostrandoContactoCRMInternoResult"
})
@XmlRootElement(name = "CRM_Mostrando_Contacto_CRM_InternoResponse")
public class CRMMostrandoContactoCRMInternoResponse {

    @XmlElement(name = "CRM_Mostrando_Contacto_CRM_InternoResult")
    protected String crmMostrandoContactoCRMInternoResult;

    /**
     * Obtiene el valor de la propiedad crmMostrandoContactoCRMInternoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRMMostrandoContactoCRMInternoResult() {
        return crmMostrandoContactoCRMInternoResult;
    }

    /**
     * Define el valor de la propiedad crmMostrandoContactoCRMInternoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRMMostrandoContactoCRMInternoResult(String value) {
        this.crmMostrandoContactoCRMInternoResult = value;
    }

}
