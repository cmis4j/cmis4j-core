package org.oasis_open.docs.ns.cmis.messaging._200908;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisAccessControlListType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisPropertiesType;

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
 *         &lt;element name="repositoryId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="properties" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertiesType"/>
 *         &lt;element name="folderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addACEs" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisAccessControlListType" minOccurs="0"/>
 *         &lt;element name="removeACEs" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisAccessControlListType" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "repositoryId", "properties", "folderId",
		"addACEs", "removeACEs", "extension" })
@XmlRootElement(name = "createItem")
public class CreateItem {

	@XmlElement(required = true)
	protected String repositoryId;
	@XmlElement(required = true)
	protected CmisPropertiesType properties;
	@XmlElementRef(name = "folderId", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
	protected JAXBElement<String> folderId;
	@XmlElementRef(name = "addACEs", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
	protected JAXBElement<CmisAccessControlListType> addACEs;
	@XmlElementRef(name = "removeACEs", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
	protected JAXBElement<CmisAccessControlListType> removeACEs;
	@XmlElementRef(name = "extension", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
	protected JAXBElement<CmisExtensionType> extension;

	/**
	 * Gets the value of the repositoryId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRepositoryId() {
		return repositoryId;
	}

	/**
	 * Sets the value of the repositoryId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRepositoryId(String value) {
		this.repositoryId = value;
	}

	/**
	 * Gets the value of the properties property.
	 * 
	 * @return possible object is {@link CmisPropertiesType }
	 * 
	 */
	public CmisPropertiesType getProperties() {
		return properties;
	}

	/**
	 * Sets the value of the properties property.
	 * 
	 * @param value
	 *            allowed object is {@link CmisPropertiesType }
	 * 
	 */
	public void setProperties(CmisPropertiesType value) {
		this.properties = value;
	}

	/**
	 * Gets the value of the folderId property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getFolderId() {
		return folderId;
	}

	/**
	 * Sets the value of the folderId property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setFolderId(JAXBElement<String> value) {
		this.folderId = value;
	}

	/**
	 * Gets the value of the addACEs property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link CmisAccessControlListType }{@code >}
	 * 
	 */
	public JAXBElement<CmisAccessControlListType> getAddACEs() {
		return addACEs;
	}

	/**
	 * Sets the value of the addACEs property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link CmisAccessControlListType }{@code >}
	 * 
	 */
	public void setAddACEs(JAXBElement<CmisAccessControlListType> value) {
		this.addACEs = value;
	}

	/**
	 * Gets the value of the removeACEs property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link CmisAccessControlListType }{@code >}
	 * 
	 */
	public JAXBElement<CmisAccessControlListType> getRemoveACEs() {
		return removeACEs;
	}

	/**
	 * Sets the value of the removeACEs property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link CmisAccessControlListType }{@code >}
	 * 
	 */
	public void setRemoveACEs(JAXBElement<CmisAccessControlListType> value) {
		this.removeACEs = value;
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
