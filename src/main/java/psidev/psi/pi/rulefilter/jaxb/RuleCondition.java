//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1-b171012.0423 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.21 um 11:21:11 AM CEST 
//


package psidev.psi.pi.rulefilter.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{<a href="http://www.w3.org/2001/XMLSchema">...</a>}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}ruleToSkip" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{<a href="http://www.w3.org/2001/XMLSchema">...</a>}string" /&gt;
 *       &lt;attribute name="valid" use="required" type="{<a href="http://www.w3.org/2001/XMLSchema">...</a>}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ruleToSkip"
})
@XmlRootElement(name = "ruleCondition")
public class RuleCondition {

    protected List<RuleToSkip> ruleToSkip;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "valid", required = true)
    protected boolean valid;

    /**
     * Gets the value of the ruleToSkip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleToSkip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleToSkip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleToSkip }
     * 
     * 
     */
    public List<RuleToSkip> getRuleToSkip() {
        if (ruleToSkip == null) {
            ruleToSkip = new ArrayList<>();
        }
        return this.ruleToSkip;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der valid-Eigenschaft ab.
     * 
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * Legt den Wert der valid-Eigenschaft fest.
     * 
     */
    public void setValid(boolean value) {
        this.valid = value;
    }

}
