package org.oasis_open.docs.ns.cmis.messaging._200908;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="changeToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "objectId", "changeToken", "extension" })
@XmlRootElement(name = "deleteContentStreamResponse")
public class DeleteContentStreamResponse {

	@XmlElement(required = true)
	protected String objectId;
	protected String changeToken;
	@XmlElementRef(name = "extension", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
	protected JAXBElement<CmisExtensionType> extension;

	/**
	 * Gets the value of the objectId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getObjectId() {
		return objectId;
	}

	/**
	 * Sets the value of the objectId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setObjectId(String value) {
		this.objectId = value;
	}

	/**
	 * Gets the value of the changeToken property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getChangeToken() {
		return changeToken;
	}

	/**
	 * Sets the value of the changeToken property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setChangeToken(String value) {
		this.changeToken = value;
	}

	/**
	 * Gets the value of the extension property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link CmisExtensionType }{@code >}
	 * 
	 */
	public JAXBElement<CmisExtensionType> getExtension() {
		return extension;
	}

	/**
	 * Sets the value of the extension property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link CmisExtensionType }{@code >}
	 * 
	 */
	public void setExtension(JAXBElement<CmisExtensionType> value) {
		this.extension = value;
	}

}
