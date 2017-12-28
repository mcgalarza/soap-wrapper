
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="idTask" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="param1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="param2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="param3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="param4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="param5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="param6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "idTask",
    "param1",
    "param2",
    "param3",
    "param4",
    "param5",
    "param6"
})
@XmlRootElement(name = "ExecuteTask06")
public class ExecuteTask06 {

    protected int idTask;
    protected String param1;
    protected String param2;
    protected String param3;
    protected String param4;
    protected String param5;
    protected String param6;

    /**
     * Obtiene el valor de la propiedad idTask.
     * 
     */
    public int getIdTask() {
        return idTask;
    }

    /**
     * Define el valor de la propiedad idTask.
     * 
     */
    public void setIdTask(int value) {
        this.idTask = value;
    }

    /**
     * Obtiene el valor de la propiedad param1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam1() {
        return param1;
    }

    /**
     * Define el valor de la propiedad param1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam1(String value) {
        this.param1 = value;
    }

    /**
     * Obtiene el valor de la propiedad param2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam2() {
        return param2;
    }

    /**
     * Define el valor de la propiedad param2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam2(String value) {
        this.param2 = value;
    }

    /**
     * Obtiene el valor de la propiedad param3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam3() {
        return param3;
    }

    /**
     * Define el valor de la propiedad param3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam3(String value) {
        this.param3 = value;
    }

    /**
     * Obtiene el valor de la propiedad param4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam4() {
        return param4;
    }

    /**
     * Define el valor de la propiedad param4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam4(String value) {
        this.param4 = value;
    }

    /**
     * Obtiene el valor de la propiedad param5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam5() {
        return param5;
    }

    /**
     * Define el valor de la propiedad param5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam5(String value) {
        this.param5 = value;
    }

    /**
     * Obtiene el valor de la propiedad param6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam6() {
        return param6;
    }

    /**
     * Define el valor de la propiedad param6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam6(String value) {
        this.param6 = value;
    }

}
