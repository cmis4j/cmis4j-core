package org.oasis_open.docs.ns.cmis.messaging._200908;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.oasis_open.docs.ns.cmis.core._200908.CmisTypeDefinitionType;

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
 *         &lt;element name="type" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisTypeDefinitionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "type" })
@XmlRootElement(name = "createTypeResponse")
public class CreateTypeResponse {

	@XmlElement(required = true)
	protected CmisTypeDefinitionType type;

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link CmisTypeDefinitionType }
	 * 
	 */
	public CmisTypeDefinitionType getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link CmisTypeDefinitionType }
	 * 
	 */
	public void setType(CmisTypeDefinitionType value) {
		this.type = value;
	}

}
