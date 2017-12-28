
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
 *         &lt;element name="USUARIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLAVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TIPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GRABA_CONVERSACION" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GRABA_PANTALLA" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DETECTA_PALABRAS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TELEFONO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="APELLIDO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAMBIA_CLAVE_PROX_LOGIN" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SAL_CALLERID_PRESENTATION" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SAL_CALLERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SAL_RUTA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SAL_PRECIO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ENT_DNIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENT_TIMEOUT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ENT_LOCUCION" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FECHA_ALTA" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DOMICILIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOCALIDAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DNI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDPERFIL" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="VERIFICA_PERMISOS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "usuario",
    "clave",
    "tipo",
    "grabaconversacion",
    "grabapantalla",
    "detectapalabras",
    "email",
    "telefono",
    "nombre",
    "apellido",
    "cambiaclaveproxlogin",
    "salcalleridpresentation",
    "salcallerid",
    "salruta",
    "salprecio",
    "entdnis",
    "enttimeout",
    "entlocucion",
    "fechaalta",
    "domicilio",
    "localidad",
    "dni",
    "idperfil",
    "verificapermisos"
})
@XmlRootElement(name = "User_Update")
public class UserUpdate {

    @XmlElement(name = "CLIENTE")
    protected String cliente;
    @XmlElement(name = "USUARIO")
    protected String usuario;
    @XmlElement(name = "CLAVE")
    protected String clave;
    @XmlElement(name = "TIPO")
    protected String tipo;
    @XmlElement(name = "GRABA_CONVERSACION")
    protected boolean grabaconversacion;
    @XmlElement(name = "GRABA_PANTALLA")
    protected boolean grabapantalla;
    @XmlElement(name = "DETECTA_PALABRAS")
    protected boolean detectapalabras;
    @XmlElement(name = "EMAIL")
    protected String email;
    @XmlElement(name = "TELEFONO")
    protected String telefono;
    @XmlElement(name = "NOMBRE")
    protected String nombre;
    @XmlElement(name = "APELLIDO")
    protected String apellido;
    @XmlElement(name = "CAMBIA_CLAVE_PROX_LOGIN")
    protected boolean cambiaclaveproxlogin;
    @XmlElement(name = "SAL_CALLERID_PRESENTATION")
    protected int salcalleridpresentation;
    @XmlElement(name = "SAL_CALLERID")
    protected String salcallerid;
    @XmlElement(name = "SAL_RUTA")
    protected int salruta;
    @XmlElement(name = "SAL_PRECIO")
    protected int salprecio;
    @XmlElement(name = "ENT_DNIS")
    protected String entdnis;
    @XmlElement(name = "ENT_TIMEOUT")
    protected int enttimeout;
    @XmlElement(name = "ENT_LOCUCION")
    protected int entlocucion;
    @XmlElement(name = "FECHA_ALTA", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaalta;
    @XmlElement(name = "DOMICILIO")
    protected String domicilio;
    @XmlElement(name = "LOCALIDAD")
    protected String localidad;
    @XmlElement(name = "DNI")
    protected String dni;
    @XmlElement(name = "IDPERFIL")
    protected int idperfil;
    @XmlElement(name = "VERIFICA_PERMISOS")
    protected boolean verificapermisos;

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
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPO() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPO(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad grabaconversacion.
     * 
     */
    public boolean isGRABACONVERSACION() {
        return grabaconversacion;
    }

    /**
     * Define el valor de la propiedad grabaconversacion.
     * 
     */
    public void setGRABACONVERSACION(boolean value) {
        this.grabaconversacion = value;
    }

    /**
     * Obtiene el valor de la propiedad grabapantalla.
     * 
     */
    public boolean isGRABAPANTALLA() {
        return grabapantalla;
    }

    /**
     * Define el valor de la propiedad grabapantalla.
     * 
     */
    public void setGRABAPANTALLA(boolean value) {
        this.grabapantalla = value;
    }

    /**
     * Obtiene el valor de la propiedad detectapalabras.
     * 
     */
    public boolean isDETECTAPALABRAS() {
        return detectapalabras;
    }

    /**
     * Define el valor de la propiedad detectapalabras.
     * 
     */
    public void setDETECTAPALABRAS(boolean value) {
        this.detectapalabras = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
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
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRE() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRE(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPELLIDO() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPELLIDO(String value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad cambiaclaveproxlogin.
     * 
     */
    public boolean isCAMBIACLAVEPROXLOGIN() {
        return cambiaclaveproxlogin;
    }

    /**
     * Define el valor de la propiedad cambiaclaveproxlogin.
     * 
     */
    public void setCAMBIACLAVEPROXLOGIN(boolean value) {
        this.cambiaclaveproxlogin = value;
    }

    /**
     * Obtiene el valor de la propiedad salcalleridpresentation.
     * 
     */
    public int getSALCALLERIDPRESENTATION() {
        return salcalleridpresentation;
    }

    /**
     * Define el valor de la propiedad salcalleridpresentation.
     * 
     */
    public void setSALCALLERIDPRESENTATION(int value) {
        this.salcalleridpresentation = value;
    }

    /**
     * Obtiene el valor de la propiedad salcallerid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALCALLERID() {
        return salcallerid;
    }

    /**
     * Define el valor de la propiedad salcallerid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALCALLERID(String value) {
        this.salcallerid = value;
    }

    /**
     * Obtiene el valor de la propiedad salruta.
     * 
     */
    public int getSALRUTA() {
        return salruta;
    }

    /**
     * Define el valor de la propiedad salruta.
     * 
     */
    public void setSALRUTA(int value) {
        this.salruta = value;
    }

    /**
     * Obtiene el valor de la propiedad salprecio.
     * 
     */
    public int getSALPRECIO() {
        return salprecio;
    }

    /**
     * Define el valor de la propiedad salprecio.
     * 
     */
    public void setSALPRECIO(int value) {
        this.salprecio = value;
    }

    /**
     * Obtiene el valor de la propiedad entdnis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTDNIS() {
        return entdnis;
    }

    /**
     * Define el valor de la propiedad entdnis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTDNIS(String value) {
        this.entdnis = value;
    }

    /**
     * Obtiene el valor de la propiedad enttimeout.
     * 
     */
    public int getENTTIMEOUT() {
        return enttimeout;
    }

    /**
     * Define el valor de la propiedad enttimeout.
     * 
     */
    public void setENTTIMEOUT(int value) {
        this.enttimeout = value;
    }

    /**
     * Obtiene el valor de la propiedad entlocucion.
     * 
     */
    public int getENTLOCUCION() {
        return entlocucion;
    }

    /**
     * Define el valor de la propiedad entlocucion.
     * 
     */
    public void setENTLOCUCION(int value) {
        this.entlocucion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaalta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAALTA() {
        return fechaalta;
    }

    /**
     * Define el valor de la propiedad fechaalta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAALTA(XMLGregorianCalendar value) {
        this.fechaalta = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOMICILIO() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOMICILIO(String value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALIDAD() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALIDAD(String value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNI() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNI(String value) {
        this.dni = value;
    }

    /**
     * Obtiene el valor de la propiedad idperfil.
     * 
     */
    public int getIDPERFIL() {
        return idperfil;
    }

    /**
     * Define el valor de la propiedad idperfil.
     * 
     */
    public void setIDPERFIL(int value) {
        this.idperfil = value;
    }

    /**
     * Obtiene el valor de la propiedad verificapermisos.
     * 
     */
    public boolean isVERIFICAPERMISOS() {
        return verificapermisos;
    }

    /**
     * Define el valor de la propiedad verificapermisos.
     * 
     */
    public void setVERIFICAPERMISOS(boolean value) {
        this.verificapermisos = value;
    }

}
