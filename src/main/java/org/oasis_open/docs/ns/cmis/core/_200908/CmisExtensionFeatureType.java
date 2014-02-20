
package org.oasis_open.docs.ns.cmis.core._200908;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for cmisExtensionFeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cmisExtensionFeatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="commonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featureData" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisExtensionFeatureKeyValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmisExtensionFeatureType", propOrder = {
    "id",
    "url",
    "commonName",
    "versionLabel",
    "description",
    "featureData",
    "any"
})
public class CmisExtensionFeatureType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlSchemaType(name = "anyURI")
    protected String url;
    protected String commonName;
    protected String versionLabel;
    protected String description;
    protected List<CmisExtensionFeatureKeyValuePair> featureData;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the commonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * Sets the value of the commonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonName(String value) {
        this.commonName = value;
    }

    /**
     * Gets the value of the versionLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionLabel() {
        return versionLabel;
    }

    /**
     * Sets the value of the versionLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionLabel(String value) {
        this.versionLabel = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the featureData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmisExtensionFeatureKeyValuePair }
     * 
     * 
     */
    public List<CmisExtensionFeatureKeyValuePair> getFeatureData() {
        if (featureData == null) {
            featureData = new ArrayList<CmisExtensionFeatureKeyValuePair>();
        }
        return this.featureData;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
