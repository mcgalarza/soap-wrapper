
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
 *         &lt;element name="ExecuteTask04Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "executeTask04Result"
})
@XmlRootElement(name = "ExecuteTask04Response")
public class ExecuteTask04Response {

    @XmlElement(name = "ExecuteTask04Result")
    protected String executeTask04Result;

    /**
     * Obtiene el valor de la propiedad executeTask04Result.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecuteTask04Result() {
        return executeTask04Result;
    }

    /**
     * Define el valor de la propiedad executeTask04Result.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecuteTask04Result(String value) {
        this.executeTask04Result = value;
    }

}
