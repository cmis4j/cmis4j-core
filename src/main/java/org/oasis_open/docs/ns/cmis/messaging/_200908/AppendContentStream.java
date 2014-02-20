
package org.oasis_open.docs.ns.cmis.messaging._200908;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="repositoryId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isLastChunk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="changeToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentStream" type="{http://docs.oasis-open.org/ns/cmis/messaging/200908/}cmisContentStreamType"/>
 *         &lt;element name="extension" type="{http://docs.oasis-open.org/ns/cmis/messaging/200908/}cmisExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "repositoryId",
    "objectId",
    "isLastChunk",
    "changeToken",
    "contentStream",
    "extension"
})
@XmlRootElement(name = "appendContentStream")
public class AppendContentStream {

    @XmlElement(required = true)
    protected String repositoryId;
    @XmlElement(required = true)
    protected String objectId;
    @XmlElementRef(name = "isLastChunk", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isLastChunk;
    @XmlElementRef(name = "changeToken", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> changeToken;
    @XmlElement(required = true)
    protected CmisContentStreamType contentStream;
    @XmlElementRef(name = "extension", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<CmisExtensionType> extension;

    /**
     * Gets the value of the repositoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    /**
     * Sets the value of the repositoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryId(String value) {
        this.repositoryId = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the isLastChunk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsLastChunk() {
        return isLastChunk;
    }

    /**
     * Sets the value of the isLastChunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsLastChunk(JAXBElement<Boolean> value) {
        this.isLastChunk = value;
    }

    /**
     * Gets the value of the changeToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChangeToken() {
        return changeToken;
    }

    /**
     * Sets the value of the changeToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChangeToken(JAXBElement<String> value) {
        this.changeToken = value;
    }

    /**
     * Gets the value of the contentStream property.
     * 
     * @return
     *     possible object is
     *     {@link CmisContentStreamType }
     *     
     */
    public CmisContentStreamType getContentStream() {
        return contentStream;
    }

    /**
     * Sets the value of the contentStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisContentStreamType }
     *     
     */
    public void setContentStream(CmisContentStreamType value) {
        this.contentStream = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CmisExtensionType }{@code >}
     *     
     */
    public JAXBElement<CmisExtensionType> getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CmisExtensionType }{@code >}
     *     
     */
    public void setExtension(JAXBElement<CmisExtensionType> value) {
        this.extension = value;
    }

}
