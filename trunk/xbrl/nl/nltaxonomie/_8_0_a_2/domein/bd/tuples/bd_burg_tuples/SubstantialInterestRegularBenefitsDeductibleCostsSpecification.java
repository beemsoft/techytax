//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.17 at 01:15:21 PM CEST 
//


package nl.nltaxonomie._8_0_a_2.domein.bd.tuples.bd_burg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie._8_0_a_2.basis.bd.types.bd_types.Anstring60VItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}SubstantialInterestRegularBenefitsDeductibleCostsAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}SubstantialInterestRegularBenefitsDeductibleCostsDescription" minOccurs="0"/>
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
    "substantialInterestRegularBenefitsDeductibleCostsAmount",
    "substantialInterestRegularBenefitsDeductibleCostsDescription"
})
public class SubstantialInterestRegularBenefitsDeductibleCostsSpecification
    extends Placeholder
{

    @XmlElement(name = "SubstantialInterestRegularBenefitsDeductibleCostsAmount", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType substantialInterestRegularBenefitsDeductibleCostsAmount;
    @XmlElement(name = "SubstantialInterestRegularBenefitsDeductibleCostsDescription", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected Anstring60VItemType substantialInterestRegularBenefitsDeductibleCostsDescription;

    /**
     * Gets the value of the substantialInterestRegularBenefitsDeductibleCostsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getSubstantialInterestRegularBenefitsDeductibleCostsAmount() {
        return substantialInterestRegularBenefitsDeductibleCostsAmount;
    }

    /**
     * Sets the value of the substantialInterestRegularBenefitsDeductibleCostsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setSubstantialInterestRegularBenefitsDeductibleCostsAmount(MonetaryNoDecimalsItemType value) {
        this.substantialInterestRegularBenefitsDeductibleCostsAmount = value;
    }

    /**
     * Gets the value of the substantialInterestRegularBenefitsDeductibleCostsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring60VItemType }
     *     
     */
    public Anstring60VItemType getSubstantialInterestRegularBenefitsDeductibleCostsDescription() {
        return substantialInterestRegularBenefitsDeductibleCostsDescription;
    }

    /**
     * Sets the value of the substantialInterestRegularBenefitsDeductibleCostsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring60VItemType }
     *     
     */
    public void setSubstantialInterestRegularBenefitsDeductibleCostsDescription(Anstring60VItemType value) {
        this.substantialInterestRegularBenefitsDeductibleCostsDescription = value;
    }

}
