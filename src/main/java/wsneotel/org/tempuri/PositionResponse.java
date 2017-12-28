
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
 *         &lt;element name="PositionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "positionResult"
})
@XmlRootElement(name = "PositionResponse")
public class PositionResponse {

    @XmlElement(name = "PositionResult")
    protected String positionResult;

    /**
     * Obtiene el valor de la propiedad positionResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionResult() {
        return positionResult;
    }

    /**
     * Define el valor de la propiedad positionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionResult(String value) {
        this.positionResult = value;
    }

}
