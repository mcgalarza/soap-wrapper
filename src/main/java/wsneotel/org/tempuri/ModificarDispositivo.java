
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="CLAVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_EXPIRACION" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CONFIGURACION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENABLED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CANALES_MAX" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TIPO_ASTERISK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_NEOTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROVEEDOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "clave",
    "fechaexpiracion",
    "configuracion",
    "enabled",
    "canalesmax",
    "tipoasterisk",
    "tiponeotel",
    "proveedor",
    "descripcion",
    "internalCall"
})
@XmlRootElement(name = "Modificar_Dispositivo")
public class ModificarDispositivo {

    @XmlElement(name = "CLIENTE")
    protected String cliente;
    @XmlElement(name = "DEVICE")
    protected String device;
    @XmlElement(name = "CLAVE")
    protected String clave;
    @XmlElement(name = "FECHA_EXPIRACION", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaexpiracion;
    @XmlElement(name = "CONFIGURACION")
    protected String configuracion;
    @XmlElement(name = "ENABLED")
    protected boolean enabled;
    @XmlElement(name = "CANALES_MAX")
    protected int canalesmax;
    @XmlElement(name = "TIPO_ASTERISK")
    protected String tipoasterisk;
    @XmlElement(name = "TIPO_NEOTEL")
    protected String tiponeotel;
    @XmlElement(name = "PROVEEDOR")
    protected String proveedor;
    @XmlElement(name = "DESCRIPCION")
    protected String descripcion;
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
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLAVE() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLAVE(String value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaexpiracion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAEXPIRACION() {
        return fechaexpiracion;
    }

    /**
     * Define el valor de la propiedad fechaexpiracion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAEXPIRACION(XMLGregorianCalendar value) {
        this.fechaexpiracion = value;
    }

    /**
     * Obtiene el valor de la propiedad configuracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIGURACION() {
        return configuracion;
    }

    /**
     * Define el valor de la propiedad configuracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIGURACION(String value) {
        this.configuracion = value;
    }

    /**
     * Obtiene el valor de la propiedad enabled.
     * 
     */
    public boolean isENABLED() {
        return enabled;
    }

    /**
     * Define el valor de la propiedad enabled.
     * 
     */
    public void setENABLED(boolean value) {
        this.enabled = value;
    }

    /**
     * Obtiene el valor de la propiedad canalesmax.
     * 
     */
    public int getCANALESMAX() {
        return canalesmax;
    }

    /**
     * Define el valor de la propiedad canalesmax.
     * 
     */
    public void setCANALESMAX(int value) {
        this.canalesmax = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoasterisk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOASTERISK() {
        return tipoasterisk;
    }

    /**
     * Define el valor de la propiedad tipoasterisk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOASTERISK(String value) {
        this.tipoasterisk = value;
    }

    /**
     * Obtiene el valor de la propiedad tiponeotel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPONEOTEL() {
        return tiponeotel;
    }

    /**
     * Define el valor de la propiedad tiponeotel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPONEOTEL(String value) {
        this.tiponeotel = value;
    }

    /**
     * Obtiene el valor de la propiedad proveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVEEDOR() {
        return proveedor;
    }

    /**
     * Define el valor de la propiedad proveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVEEDOR(String value) {
        this.proveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCION() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCION(String value) {
        this.descripcion = value;
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
