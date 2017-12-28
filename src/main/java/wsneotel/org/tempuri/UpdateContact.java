
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
 *         &lt;element name="CRM" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="USUARIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BASE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IDCONTACTO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SUBCATEGORIA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="XML_UPDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AGENDA" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FECHA_AGENDA" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="USUARIO_AGENDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TEL_AGENDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "crm",
    "usuario",
    "base",
    "idcontacto",
    "data",
    "subcategoria",
    "xmlupdate",
    "agenda",
    "fechaagenda",
    "usuarioagenda",
    "telagenda"
})
@XmlRootElement(name = "UpdateContact")
public class UpdateContact {

    @XmlElement(name = "CRM")
    protected int crm;
    @XmlElement(name = "USUARIO")
    protected String usuario;
    @XmlElement(name = "BASE")
    protected int base;
    @XmlElement(name = "IDCONTACTO")
    protected int idcontacto;
    @XmlElement(name = "DATA")
    protected String data;
    @XmlElement(name = "SUBCATEGORIA")
    protected int subcategoria;
    @XmlElement(name = "XML_UPDATE")
    protected String xmlupdate;
    @XmlElement(name = "AGENDA")
    protected boolean agenda;
    @XmlElement(name = "FECHA_AGENDA", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaagenda;
    @XmlElement(name = "USUARIO_AGENDA")
    protected String usuarioagenda;
    @XmlElement(name = "TEL_AGENDA")
    protected String telagenda;

    /**
     * Obtiene el valor de la propiedad crm.
     * 
     */
    public int getCRM() {
        return crm;
    }

    /**
     * Define el valor de la propiedad crm.
     * 
     */
    public void setCRM(int value) {
        this.crm = value;
    }

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
     * Obtiene el valor de la propiedad subcategoria.
     * 
     */
    public int getSUBCATEGORIA() {
        return subcategoria;
    }

    /**
     * Define el valor de la propiedad subcategoria.
     * 
     */
    public void setSUBCATEGORIA(int value) {
        this.subcategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlupdate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLUPDATE() {
        return xmlupdate;
    }

    /**
     * Define el valor de la propiedad xmlupdate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLUPDATE(String value) {
        this.xmlupdate = value;
    }

    /**
     * Obtiene el valor de la propiedad agenda.
     * 
     */
    public boolean isAGENDA() {
        return agenda;
    }

    /**
     * Define el valor de la propiedad agenda.
     * 
     */
    public void setAGENDA(boolean value) {
        this.agenda = value;
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

    /**
     * Obtiene el valor de la propiedad usuarioagenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSUARIOAGENDA() {
        return usuarioagenda;
    }

    /**
     * Define el valor de la propiedad usuarioagenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSUARIOAGENDA(String value) {
        this.usuarioagenda = value;
    }

    /**
     * Obtiene el valor de la propiedad telagenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELAGENDA() {
        return telagenda;
    }

    /**
     * Define el valor de la propiedad telagenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELAGENDA(String value) {
        this.telagenda = value;
    }

}
