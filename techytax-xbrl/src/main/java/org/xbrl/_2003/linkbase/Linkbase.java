//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.16 at 09:30:36 PM CEST 
//


package org.xbrl._2003.linkbase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.xbrl._2003.xlink.DocumentationType;
import org.xbrl._2003.xlink.ExtendedType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}documentation"/>
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}roleRef"/>
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}arcroleRef"/>
 *         &lt;element ref="{http://www.xbrl.org/2003/XLink}extended"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;anyAttribute processContents='lax' namespace='http://www.w3.org/XML/1998/namespace'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentationOrRoleRefOrArcroleRef"
})
@XmlRootElement(name = "linkbase")
public class Linkbase {

    @XmlElementRefs({
        @XmlElementRef(name = "arcroleRef", namespace = "http://www.xbrl.org/2003/linkbase", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "documentation", namespace = "http://www.xbrl.org/2003/linkbase", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "roleRef", namespace = "http://www.xbrl.org/2003/linkbase", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extended", namespace = "http://www.xbrl.org/2003/XLink", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> documentationOrRoleRefOrArcroleRef;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the documentationOrRoleRefOrArcroleRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentationOrRoleRefOrArcroleRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentationOrRoleRefOrArcroleRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ArcroleRef }{@code >}
     * {@link JAXBElement }{@code <}{@link LabelLink }{@code >}
     * {@link JAXBElement }{@code <}{@link CalculationLink }{@code >}
     * {@link JAXBElement }{@code <}{@link DocumentationType }{@code >}
     * {@link JAXBElement }{@code <}{@link RoleRef }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceLink }{@code >}
     * {@link JAXBElement }{@code <}{@link PresentationLink }{@code >}
     * {@link JAXBElement }{@code <}{@link FootnoteLink }{@code >}
     * {@link JAXBElement }{@code <}{@link DefinitionLink }{@code >}
     * {@link JAXBElement }{@code <}{@link ExtendedType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getDocumentationOrRoleRefOrArcroleRef() {
        if (documentationOrRoleRefOrArcroleRef == null) {
            documentationOrRoleRefOrArcroleRef = new ArrayList<JAXBElement<?>>();
        }
        return this.documentationOrRoleRefOrArcroleRef;
    }

    /**
     * Gets the value of the id property.
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
     * Sets the value of the id property.
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
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
