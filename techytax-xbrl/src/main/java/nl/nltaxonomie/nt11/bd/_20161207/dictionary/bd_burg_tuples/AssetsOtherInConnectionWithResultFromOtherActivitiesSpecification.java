//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.16 at 09:30:36 PM CEST 
//


package nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_burg_tuples;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt11.sbr._20160610.dictionary.nl_types.MonetaryNoDecimalsItemType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension}placeholder">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}AssetsOtherInConnectionWithResultFromActivitiesDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}AssetsOtherInConnectionWithResultFromActivitiesValue" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "assetsOtherInConnectionWithResultFromActivitiesDescription",
    "assetsOtherInConnectionWithResultFromActivitiesValue"
})
public class AssetsOtherInConnectionWithResultFromOtherActivitiesSpecification
    extends Placeholder
{

    @XmlElement(name = "AssetsOtherInConnectionWithResultFromActivitiesDescription", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Anstring70VItemType assetsOtherInConnectionWithResultFromActivitiesDescription;
    @XmlElement(name = "AssetsOtherInConnectionWithResultFromActivitiesValue", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected List<MonetaryNoDecimalsItemType> assetsOtherInConnectionWithResultFromActivitiesValue;

    /**
     * Gets the value of the assetsOtherInConnectionWithResultFromActivitiesDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getAssetsOtherInConnectionWithResultFromActivitiesDescription() {
        return assetsOtherInConnectionWithResultFromActivitiesDescription;
    }

    /**
     * Sets the value of the assetsOtherInConnectionWithResultFromActivitiesDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setAssetsOtherInConnectionWithResultFromActivitiesDescription(Anstring70VItemType value) {
        this.assetsOtherInConnectionWithResultFromActivitiesDescription = value;
    }

    /**
     * Gets the value of the assetsOtherInConnectionWithResultFromActivitiesValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetsOtherInConnectionWithResultFromActivitiesValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetsOtherInConnectionWithResultFromActivitiesValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryNoDecimalsItemType }
     * 
     * 
     */
    public List<MonetaryNoDecimalsItemType> getAssetsOtherInConnectionWithResultFromActivitiesValue() {
        if (assetsOtherInConnectionWithResultFromActivitiesValue == null) {
            assetsOtherInConnectionWithResultFromActivitiesValue = new ArrayList<MonetaryNoDecimalsItemType>();
        }
        return this.assetsOtherInConnectionWithResultFromActivitiesValue;
    }

}