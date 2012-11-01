//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 09:06:01 PM CET 
//


package org.xbrl._2003.linkbase;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.xbrl._2003.xlink.ArcType;
import org.xbrl._2003.xlink.DocumentationType;
import org.xbrl._2003.xlink.LocatorType;
import org.xbrl._2003.xlink.SimpleType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.xbrl._2003.linkbase package. 
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

    private final static QName _RoleRef_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "roleRef");
    private final static QName _Part_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "part");
    private final static QName _LabelLink_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "labelLink");
    private final static QName _ArcroleRef_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "arcroleRef");
    private final static QName _CalculationLink_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "calculationLink");
    private final static QName _ReferenceArc_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "referenceArc");
    private final static QName _Reference_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "reference");
    private final static QName _FootnoteLink_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "footnoteLink");
    private final static QName _SchemaRef_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "schemaRef");
    private final static QName _PresentationLink_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "presentationLink");
    private final static QName _Documentation_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "documentation");
    private final static QName _ReferenceLink_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "referenceLink");
    private final static QName _CalculationArc_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "calculationArc");
    private final static QName _UsedOn_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "usedOn");
    private final static QName _Loc_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "loc");
    private final static QName _LabelArc_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "labelArc");
    private final static QName _DefinitionArc_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "definitionArc");
    private final static QName _Definition_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "definition");
    private final static QName _LinkbaseRef_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "linkbaseRef");
    private final static QName _PresentationArc_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "presentationArc");
    private final static QName _FootnoteArc_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "footnoteArc");
    private final static QName _Label_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "label");
    private final static QName _DefinitionLink_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "definitionLink");
    private final static QName _Footnote_QNAME = new QName("http://www.xbrl.org/2003/linkbase", "footnote");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.xbrl._2003.linkbase
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArcroleRef }
     * 
     */
    public ArcroleRef createArcroleRef() {
        return new ArcroleRef();
    }

    /**
     * Create an instance of {@link LinkbaseRef }
     * 
     */
    public LinkbaseRef createLinkbaseRef() {
        return new LinkbaseRef();
    }

    /**
     * Create an instance of {@link ArcroleType }
     * 
     */
    public ArcroleType createArcroleType() {
        return new ArcroleType();
    }

    /**
     * Create an instance of {@link PresentationArc }
     * 
     */
    public PresentationArc createPresentationArc() {
        return new PresentationArc();
    }

    /**
     * Create an instance of {@link FootnoteLink }
     * 
     */
    public FootnoteLink createFootnoteLink() {
        return new FootnoteLink();
    }

    /**
     * Create an instance of {@link RoleType }
     * 
     */
    public RoleType createRoleType() {
        return new RoleType();
    }

    /**
     * Create an instance of {@link Label }
     * 
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link PresentationLink }
     * 
     */
    public PresentationLink createPresentationLink() {
        return new PresentationLink();
    }

    /**
     * Create an instance of {@link RoleRef }
     * 
     */
    public RoleRef createRoleRef() {
        return new RoleRef();
    }

    /**
     * Create an instance of {@link ReferenceLink }
     * 
     */
    public ReferenceLink createReferenceLink() {
        return new ReferenceLink();
    }

    /**
     * Create an instance of {@link Reference }
     * 
     */
    public Reference createReference() {
        return new Reference();
    }

    /**
     * Create an instance of {@link Footnote }
     * 
     */
    public Footnote createFootnote() {
        return new Footnote();
    }

    /**
     * Create an instance of {@link LabelLink }
     * 
     */
    public LabelLink createLabelLink() {
        return new LabelLink();
    }

    /**
     * Create an instance of {@link DefinitionLink }
     * 
     */
    public DefinitionLink createDefinitionLink() {
        return new DefinitionLink();
    }

    /**
     * Create an instance of {@link CalculationLink }
     * 
     */
    public CalculationLink createCalculationLink() {
        return new CalculationLink();
    }

    /**
     * Create an instance of {@link Linkbase }
     * 
     */
    public Linkbase createLinkbase() {
        return new Linkbase();
    }

    /**
     * Create an instance of {@link CalculationArc }
     * 
     */
    public CalculationArc createCalculationArc() {
        return new CalculationArc();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "roleRef", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "simple")
    public JAXBElement<RoleRef> createRoleRef(RoleRef value) {
        return new JAXBElement<RoleRef>(_RoleRef_QNAME, RoleRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "part")
    public JAXBElement<Object> createPart(Object value) {
        return new JAXBElement<Object>(_Part_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "labelLink", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "extended")
    public JAXBElement<LabelLink> createLabelLink(LabelLink value) {
        return new JAXBElement<LabelLink>(_LabelLink_QNAME, LabelLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArcroleRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "arcroleRef", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "simple")
    public JAXBElement<ArcroleRef> createArcroleRef(ArcroleRef value) {
        return new JAXBElement<ArcroleRef>(_ArcroleRef_QNAME, ArcroleRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculationLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "calculationLink", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "extended")
    public JAXBElement<CalculationLink> createCalculationLink(CalculationLink value) {
        return new JAXBElement<CalculationLink>(_CalculationLink_QNAME, CalculationLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArcType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "referenceArc", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "arc")
    public JAXBElement<ArcType> createReferenceArc(ArcType value) {
        return new JAXBElement<ArcType>(_ReferenceArc_QNAME, ArcType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "reference", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "resource")
    public JAXBElement<Reference> createReference(Reference value) {
        return new JAXBElement<Reference>(_Reference_QNAME, Reference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FootnoteLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "footnoteLink", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "extended")
    public JAXBElement<FootnoteLink> createFootnoteLink(FootnoteLink value) {
        return new JAXBElement<FootnoteLink>(_FootnoteLink_QNAME, FootnoteLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "schemaRef", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "simple")
    public JAXBElement<SimpleType> createSchemaRef(SimpleType value) {
        return new JAXBElement<SimpleType>(_SchemaRef_QNAME, SimpleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PresentationLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "presentationLink", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "extended")
    public JAXBElement<PresentationLink> createPresentationLink(PresentationLink value) {
        return new JAXBElement<PresentationLink>(_PresentationLink_QNAME, PresentationLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "documentation", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "documentation")
    public JAXBElement<DocumentationType> createDocumentation(DocumentationType value) {
        return new JAXBElement<DocumentationType>(_Documentation_QNAME, DocumentationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "referenceLink", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "extended")
    public JAXBElement<ReferenceLink> createReferenceLink(ReferenceLink value) {
        return new JAXBElement<ReferenceLink>(_ReferenceLink_QNAME, ReferenceLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculationArc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "calculationArc", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "arc")
    public JAXBElement<CalculationArc> createCalculationArc(CalculationArc value) {
        return new JAXBElement<CalculationArc>(_CalculationArc_QNAME, CalculationArc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "usedOn")
    public JAXBElement<QName> createUsedOn(QName value) {
        return new JAXBElement<QName>(_UsedOn_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "loc", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "locator")
    public JAXBElement<LocatorType> createLoc(LocatorType value) {
        return new JAXBElement<LocatorType>(_Loc_QNAME, LocatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArcType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "labelArc", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "arc")
    public JAXBElement<ArcType> createLabelArc(ArcType value) {
        return new JAXBElement<ArcType>(_LabelArc_QNAME, ArcType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArcType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "definitionArc", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "arc")
    public JAXBElement<ArcType> createDefinitionArc(ArcType value) {
        return new JAXBElement<ArcType>(_DefinitionArc_QNAME, ArcType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "definition")
    public JAXBElement<String> createDefinition(String value) {
        return new JAXBElement<String>(_Definition_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkbaseRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "linkbaseRef", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "simple")
    public JAXBElement<LinkbaseRef> createLinkbaseRef(LinkbaseRef value) {
        return new JAXBElement<LinkbaseRef>(_LinkbaseRef_QNAME, LinkbaseRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PresentationArc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "presentationArc", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "arc")
    public JAXBElement<PresentationArc> createPresentationArc(PresentationArc value) {
        return new JAXBElement<PresentationArc>(_PresentationArc_QNAME, PresentationArc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArcType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "footnoteArc", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "arc")
    public JAXBElement<ArcType> createFootnoteArc(ArcType value) {
        return new JAXBElement<ArcType>(_FootnoteArc_QNAME, ArcType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Label }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "label", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "resource")
    public JAXBElement<Label> createLabel(Label value) {
        return new JAXBElement<Label>(_Label_QNAME, Label.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefinitionLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "definitionLink", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "extended")
    public JAXBElement<DefinitionLink> createDefinitionLink(DefinitionLink value) {
        return new JAXBElement<DefinitionLink>(_DefinitionLink_QNAME, DefinitionLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Footnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/linkbase", name = "footnote", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "resource")
    public JAXBElement<Footnote> createFootnote(Footnote value) {
        return new JAXBElement<Footnote>(_Footnote_QNAME, Footnote.class, null, value);
    }

}
