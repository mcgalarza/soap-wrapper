
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
 *         &lt;element name="CLIENTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEVICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternalCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "cliente",
    "device",
    "internalCall"
})
@XmlRootElement(name = "Eliminar_Dispositivo")
public class EliminarDispositivo {

    @XmlElement(name = "CLIENTE")
    protected String cliente;
    @XmlElement(name = "DEVICE")
    protected String device;
    @XmlElement(name = "InternalCall")
    protected boolean internalCall;

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIENTE() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIENTE(String value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad device.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEVICE() {
        return device;
    }

    /**
     * Define el valor de la propiedad device.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEVICE(String value) {
        this.device = value;
    }

    /**
     * Obtiene el valor de la propiedad internalCall.
     * 
     */
    public boolean isInternalCall() {
        return internalCall;
    }

    /**
     * Define el valor de la propiedad internalCall.
     * 
     */
    public void setInternalCall(boolean value) {
        this.internalCall = value;
    }

}
