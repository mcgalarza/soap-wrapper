
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
 *         &lt;element name="ExecuteTask01Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "executeTask01Result"
})
@XmlRootElement(name = "ExecuteTask01Response")
public class ExecuteTask01Response {

    @XmlElement(name = "ExecuteTask01Result")
    protected String executeTask01Result;

    /**
     * Obtiene el valor de la propiedad executeTask01Result.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecuteTask01Result() {
        return executeTask01Result;
    }

    /**
     * Define el valor de la propiedad executeTask01Result.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecuteTask01Result(String value) {
        this.executeTask01Result = value;
    }

}
