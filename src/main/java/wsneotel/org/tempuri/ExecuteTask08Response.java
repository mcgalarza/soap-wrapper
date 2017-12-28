
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
 *         &lt;element name="ExecuteTask08Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "executeTask08Result"
})
@XmlRootElement(name = "ExecuteTask08Response")
public class ExecuteTask08Response {

    @XmlElement(name = "ExecuteTask08Result")
    protected String executeTask08Result;

    /**
     * Obtiene el valor de la propiedad executeTask08Result.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecuteTask08Result() {
        return executeTask08Result;
    }

    /**
     * Define el valor de la propiedad executeTask08Result.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecuteTask08Result(String value) {
        this.executeTask08Result = value;
    }

}
