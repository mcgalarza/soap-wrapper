
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
 *         &lt;element name="USUARIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONFERENCIA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PARTICIPANTE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "conferencia",
    "participante"
})
@XmlRootElement(name = "Expulsar_Participante")
public class ExpulsarParticipante {

    @XmlElement(name = "USUARIO")
    protected String usuario;
    @XmlElement(name = "CONFERENCIA")
    protected int conferencia;
    @XmlElement(name = "PARTICIPANTE")
    protected int participante;

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
     * Obtiene el valor de la propiedad conferencia.
     * 
     */
    public int getCONFERENCIA() {
        return conferencia;
    }

    /**
     * Define el valor de la propiedad conferencia.
     * 
     */
    public void setCONFERENCIA(int value) {
        this.conferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad participante.
     * 
     */
    public int getPARTICIPANTE() {
        return participante;
    }

    /**
     * Define el valor de la propiedad participante.
     * 
     */
    public void setPARTICIPANTE(int value) {
        this.participante = value;
    }

}
