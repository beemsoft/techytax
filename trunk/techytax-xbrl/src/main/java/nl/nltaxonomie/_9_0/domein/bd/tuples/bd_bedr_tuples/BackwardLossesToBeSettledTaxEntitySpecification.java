//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.25 at 08:13:42 PM CEST 
//


package nl.nltaxonomie._9_0.domein.bd.tuples.bd_bedr_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Test11ItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}BackwardLossesToBeSettledTaxEntityCompanyIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}BackwardLossesToBeSettledTaxEntityLossToBeSettledPreviousFinancialYear" minOccurs="0"/>
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
    "backwardLossesToBeSettledTaxEntityCompanyIdentificationNumber",
    "backwardLossesToBeSettledTaxEntityLossToBeSettledPreviousFinancialYear"
})
public class BackwardLossesToBeSettledTaxEntitySpecification
    extends Placeholder
{

    @XmlElement(name = "BackwardLossesToBeSettledTaxEntityCompanyIdentificationNumber", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected Test11ItemType backwardLossesToBeSettledTaxEntityCompanyIdentificationNumber;
    @XmlElement(name = "BackwardLossesToBeSettledTaxEntityLossToBeSettledPreviousFinancialYear", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected NonNegativeMonetaryNoDecimalsItemType backwardLossesToBeSettledTaxEntityLossToBeSettledPreviousFinancialYear;

    /**
     * Gets the value of the backwardLossesToBeSettledTaxEntityCompanyIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getBackwardLossesToBeSettledTaxEntityCompanyIdentificationNumber() {
        return backwardLossesToBeSettledTaxEntityCompanyIdentificationNumber;
    }

    /**
     * Sets the value of the backwardLossesToBeSettledTaxEntityCompanyIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setBackwardLossesToBeSettledTaxEntityCompanyIdentificationNumber(Test11ItemType value) {
        this.backwardLossesToBeSettledTaxEntityCompanyIdentificationNumber = value;
    }

    /**
     * Gets the value of the backwardLossesToBeSettledTaxEntityLossToBeSettledPreviousFinancialYear property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getBackwardLossesToBeSettledTaxEntityLossToBeSettledPreviousFinancialYear() {
        return backwardLossesToBeSettledTaxEntityLossToBeSettledPreviousFinancialYear;
    }

    /**
     * Sets the value of the backwardLossesToBeSettledTaxEntityLossToBeSettledPreviousFinancialYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setBackwardLossesToBeSettledTaxEntityLossToBeSettledPreviousFinancialYear(NonNegativeMonetaryNoDecimalsItemType value) {
        this.backwardLossesToBeSettledTaxEntityLossToBeSettledPreviousFinancialYear = value;
    }

}