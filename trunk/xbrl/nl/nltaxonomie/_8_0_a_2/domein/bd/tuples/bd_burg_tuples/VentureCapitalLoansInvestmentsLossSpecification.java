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
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
import nl.nltaxonomie._8_0_a_2.basis.bd.types.bd_types.Anstring35VItemType;
import nl.nltaxonomie._8_0_a_2.basis.bd.types.bd_types.Anstring70VItemType;
import nl.nltaxonomie._8_0_a_2.basis.bd.types.bd_types.Anstring9VItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}CityTownEntrepreneurParticipatingInterestFunds" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}EntrepreneurParticipatingInterestFundsStreetHouseNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}NameEntrepreneurParticipatingInterestFunds" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}PostalCodeEntrepreneurParticipatingInterestFunds" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}VentureCapitalLoansInvestmentsLossAmount" minOccurs="0"/>
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
    "cityTownEntrepreneurParticipatingInterestFunds",
    "entrepreneurParticipatingInterestFundsStreetHouseNumber",
    "nameEntrepreneurParticipatingInterestFunds",
    "postalCodeEntrepreneurParticipatingInterestFunds",
    "ventureCapitalLoansInvestmentsLossAmount"
})
public class VentureCapitalLoansInvestmentsLossSpecification
    extends Placeholder
{

    @XmlElement(name = "CityTownEntrepreneurParticipatingInterestFunds", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected Anstring35VItemType cityTownEntrepreneurParticipatingInterestFunds;
    @XmlElement(name = "EntrepreneurParticipatingInterestFundsStreetHouseNumber", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected Anstring35VItemType entrepreneurParticipatingInterestFundsStreetHouseNumber;
    @XmlElement(name = "NameEntrepreneurParticipatingInterestFunds", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected Anstring70VItemType nameEntrepreneurParticipatingInterestFunds;
    @XmlElement(name = "PostalCodeEntrepreneurParticipatingInterestFunds", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected Anstring9VItemType postalCodeEntrepreneurParticipatingInterestFunds;
    @XmlElement(name = "VentureCapitalLoansInvestmentsLossAmount", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType ventureCapitalLoansInvestmentsLossAmount;

    /**
     * Gets the value of the cityTownEntrepreneurParticipatingInterestFunds property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring35VItemType }
     *     
     */
    public Anstring35VItemType getCityTownEntrepreneurParticipatingInterestFunds() {
        return cityTownEntrepreneurParticipatingInterestFunds;
    }

    /**
     * Sets the value of the cityTownEntrepreneurParticipatingInterestFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring35VItemType }
     *     
     */
    public void setCityTownEntrepreneurParticipatingInterestFunds(Anstring35VItemType value) {
        this.cityTownEntrepreneurParticipatingInterestFunds = value;
    }

    /**
     * Gets the value of the entrepreneurParticipatingInterestFundsStreetHouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring35VItemType }
     *     
     */
    public Anstring35VItemType getEntrepreneurParticipatingInterestFundsStreetHouseNumber() {
        return entrepreneurParticipatingInterestFundsStreetHouseNumber;
    }

    /**
     * Sets the value of the entrepreneurParticipatingInterestFundsStreetHouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring35VItemType }
     *     
     */
    public void setEntrepreneurParticipatingInterestFundsStreetHouseNumber(Anstring35VItemType value) {
        this.entrepreneurParticipatingInterestFundsStreetHouseNumber = value;
    }

    /**
     * Gets the value of the nameEntrepreneurParticipatingInterestFunds property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getNameEntrepreneurParticipatingInterestFunds() {
        return nameEntrepreneurParticipatingInterestFunds;
    }

    /**
     * Sets the value of the nameEntrepreneurParticipatingInterestFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setNameEntrepreneurParticipatingInterestFunds(Anstring70VItemType value) {
        this.nameEntrepreneurParticipatingInterestFunds = value;
    }

    /**
     * Gets the value of the postalCodeEntrepreneurParticipatingInterestFunds property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring9VItemType }
     *     
     */
    public Anstring9VItemType getPostalCodeEntrepreneurParticipatingInterestFunds() {
        return postalCodeEntrepreneurParticipatingInterestFunds;
    }

    /**
     * Sets the value of the postalCodeEntrepreneurParticipatingInterestFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring9VItemType }
     *     
     */
    public void setPostalCodeEntrepreneurParticipatingInterestFunds(Anstring9VItemType value) {
        this.postalCodeEntrepreneurParticipatingInterestFunds = value;
    }

    /**
     * Gets the value of the ventureCapitalLoansInvestmentsLossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getVentureCapitalLoansInvestmentsLossAmount() {
        return ventureCapitalLoansInvestmentsLossAmount;
    }

    /**
     * Sets the value of the ventureCapitalLoansInvestmentsLossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setVentureCapitalLoansInvestmentsLossAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.ventureCapitalLoansInvestmentsLossAmount = value;
    }

}
