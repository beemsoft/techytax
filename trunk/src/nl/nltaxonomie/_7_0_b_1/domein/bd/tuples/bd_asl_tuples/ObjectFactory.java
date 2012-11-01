//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 09:06:01 PM CET 
//


package nl.nltaxonomie._7_0_b_1.domein.bd.tuples.bd_asl_tuples;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.nltaxonomie._7_0_b_1.domein.bd.tuples.bd_asl_tuples package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NameAddressSenderSpecification_QNAME = new QName("http://www.nltaxonomie.nl/7.0.b.1/domein/bd/tuples/bd-asl-tuples", "NameAddressSenderSpecification");
    private final static QName _IncomePresentEmploymentSpecification_QNAME = new QName("http://www.nltaxonomie.nl/7.0.b.1/domein/bd/tuples/bd-asl-tuples", "IncomePresentEmploymentSpecification");
    private final static QName _TaxData_QNAME = new QName("http://www.nltaxonomie.nl/7.0.b.1/domein/bd/tuples/bd-asl-tuples", "TaxData");
    private final static QName _NameAddressTaxpayerSpecification_QNAME = new QName("http://www.nltaxonomie.nl/7.0.b.1/domein/bd/tuples/bd-asl-tuples", "NameAddressTaxpayerSpecification");
    private final static QName _IncomePreviousEmploymentSpecification_QNAME = new QName("http://www.nltaxonomie.nl/7.0.b.1/domein/bd/tuples/bd-asl-tuples", "IncomePreviousEmploymentSpecification");
    private final static QName _NameAddressTaxconsultantSpecification_QNAME = new QName("http://www.nltaxonomie.nl/7.0.b.1/domein/bd/tuples/bd-asl-tuples", "NameAddressTaxconsultantSpecification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.nltaxonomie._7_0_b_1.domein.bd.tuples.bd_asl_tuples
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NameAddressTaxpayerSpecification }
     * 
     */
    public NameAddressTaxpayerSpecification createNameAddressTaxpayerSpecification() {
        return new NameAddressTaxpayerSpecification();
    }

    /**
     * Create an instance of {@link TaxData }
     * 
     */
    public TaxData createTaxData() {
        return new TaxData();
    }

    /**
     * Create an instance of {@link NameAddressSenderSpecification }
     * 
     */
    public NameAddressSenderSpecification createNameAddressSenderSpecification() {
        return new NameAddressSenderSpecification();
    }

    /**
     * Create an instance of {@link IncomePreviousEmploymentSpecification }
     * 
     */
    public IncomePreviousEmploymentSpecification createIncomePreviousEmploymentSpecification() {
        return new IncomePreviousEmploymentSpecification();
    }

    /**
     * Create an instance of {@link IncomePresentEmploymentSpecification }
     * 
     */
    public IncomePresentEmploymentSpecification createIncomePresentEmploymentSpecification() {
        return new IncomePresentEmploymentSpecification();
    }

    /**
     * Create an instance of {@link NameAddressTaxconsultantSpecification }
     * 
     */
    public NameAddressTaxconsultantSpecification createNameAddressTaxconsultantSpecification() {
        return new NameAddressTaxconsultantSpecification();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameAddressSenderSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/7.0.b.1/domein/bd/tuples/bd-asl-tuples", name = "NameAddressSenderSpecification", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "presentationTuple")
    public JAXBElement<NameAddressSenderSpecification> createNameAddressSenderSpecification(NameAddressSenderSpecification value) {
        return new JAXBElement<NameAddressSenderSpecification>(_NameAddressSenderSpecification_QNAME, NameAddressSenderSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncomePresentEmploymentSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/7.0.b.1/domein/bd/tuples/bd-asl-tuples", name = "IncomePresentEmploymentSpecification", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "specificationTuple")
    public JAXBElement<IncomePresentEmploymentSpecification> createIncomePresentEmploymentSpecification(IncomePresentEmploymentSpecification value) {
        return new JAXBElement<IncomePresentEmploymentSpecification>(_IncomePresentEmploymentSpecification_QNAME, IncomePresentEmploymentSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/7.0.b.1/domein/bd/tuples/bd-asl-tuples", name = "TaxData", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "tuple")
    public JAXBElement<TaxData> createTaxData(TaxData value) {
        return new JAXBElement<TaxData>(_TaxData_QNAME, TaxData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameAddressTaxpayerSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/7.0.b.1/domein/bd/tuples/bd-asl-tuples", name = "NameAddressTaxpayerSpecification", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "presentationTuple")
    public JAXBElement<NameAddressTaxpayerSpecification> createNameAddressTaxpayerSpecification(NameAddressTaxpayerSpecification value) {
        return new JAXBElement<NameAddressTaxpayerSpecification>(_NameAddressTaxpayerSpecification_QNAME, NameAddressTaxpayerSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncomePreviousEmploymentSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/7.0.b.1/domein/bd/tuples/bd-asl-tuples", name = "IncomePreviousEmploymentSpecification", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "specificationTuple")
    public JAXBElement<IncomePreviousEmploymentSpecification> createIncomePreviousEmploymentSpecification(IncomePreviousEmploymentSpecification value) {
        return new JAXBElement<IncomePreviousEmploymentSpecification>(_IncomePreviousEmploymentSpecification_QNAME, IncomePreviousEmploymentSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameAddressTaxconsultantSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/7.0.b.1/domein/bd/tuples/bd-asl-tuples", name = "NameAddressTaxconsultantSpecification", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "presentationTuple")
    public JAXBElement<NameAddressTaxconsultantSpecification> createNameAddressTaxconsultantSpecification(NameAddressTaxconsultantSpecification value) {
        return new JAXBElement<NameAddressTaxconsultantSpecification>(_NameAddressTaxconsultantSpecification_QNAME, NameAddressTaxconsultantSpecification.class, null, value);
    }

}
