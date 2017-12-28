
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
 *         &lt;element name="User_HasLicenseResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "userHasLicenseResult"
})
@XmlRootElement(name = "User_HasLicenseResponse")
public class UserHasLicenseResponse {

    @XmlElement(name = "User_HasLicenseResult")
    protected boolean userHasLicenseResult;

    /**
     * Obtiene el valor de la propiedad userHasLicenseResult.
     * 
     */
    public boolean isUserHasLicenseResult() {
        return userHasLicenseResult;
    }

    /**
     * Define el valor de la propiedad userHasLicenseResult.
     * 
     */
    public void setUserHasLicenseResult(boolean value) {
        this.userHasLicenseResult = value;
    }

}
