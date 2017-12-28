
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
 *         &lt;element name="USUARIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BASE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IDCONTACTO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TELEFONO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_AGENDA" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
    "usuario",
    "base",
    "idcontacto",
    "data",
    "telefono",
    "fechaagenda"
})
@XmlRootElement(name = "AddScheduleCall")
public class AddScheduleCall {

    @XmlElement(name = "USUARIO")
    protected String usuario;
    @XmlElement(name = "BASE")
    protected int base;
    @XmlElement(name = "IDCONTACTO")
    protected int idcontacto;
    @XmlElement(name = "DATA")
    protected String data;
    @XmlElement(name = "TELEFONO")
    protected String telefono;
    @XmlElement(name = "FECHA_AGENDA", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaagenda;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSUARIO() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSUARIO(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad base.
     * 
     */
    public int getBASE() {
        return base;
    }

    /**
     * Define el valor de la propiedad base.
     * 
     */
    public void setBASE(int value) {
        this.base = value;
    }

    /**
     * Obtiene el valor de la propiedad idcontacto.
     * 
     */
    public int getIDCONTACTO() {
        return idcontacto;
    }

    /**
     * Define el valor de la propiedad idcontacto.
     * 
     */
    public void setIDCONTACTO(int value) {
        this.idcontacto = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATA() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATA(String value) {
        this.data = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFONO() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFONO(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaagenda.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAAGENDA() {
        return fechaagenda;
    }

    /**
     * Define el valor de la propiedad fechaagenda.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAAGENDA(XMLGregorianCalendar value) {
        this.fechaagenda = value;
    }

}
