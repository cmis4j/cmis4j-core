
package org.oasis_open.docs.ns.cmis.core._200908;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cmisNewTypeSettableAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cmisNewTypeSettableAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="localName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="localNamespace" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="queryName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="creatable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fileable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="queryable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fulltextIndexed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includedInSupertypeQuery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="controllablePolicy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="controllableACL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmisNewTypeSettableAttributes", propOrder = {
    "id",
    "localName",
    "localNamespace",
    "displayName",
    "queryName",
    "description",
    "creatable",
    "fileable",
    "queryable",
    "fulltextIndexed",
    "includedInSupertypeQuery",
    "controllablePolicy",
    "controllableACL"
})
public class CmisNewTypeSettableAttributes {

    protected boolean id;
    protected boolean localName;
    protected boolean localNamespace;
    protected boolean displayName;
    protected boolean queryName;
    protected boolean description;
    protected boolean creatable;
    protected boolean fileable;
    protected boolean queryable;
    protected boolean fulltextIndexed;
    protected boolean includedInSupertypeQuery;
    protected boolean controllablePolicy;
    protected boolean controllableACL;

    /**
     * Gets the value of the id property.
     * 
     */
    public boolean isId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(boolean value) {
        this.id = value;
    }

    /**
     * Gets the value of the localName property.
     * 
     */
    public boolean isLocalName() {
        return localName;
    }

    /**
     * Sets the value of the localName property.
     * 
     */
    public void setLocalName(boolean value) {
        this.localName = value;
    }

    /**
     * Gets the value of the localNamespace property.
     * 
     */
    public boolean isLocalNamespace() {
        return localNamespace;
    }

    /**
     * Sets the value of the localNamespace property.
     * 
     */
    public void setLocalNamespace(boolean value) {
        this.localNamespace = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     */
    public boolean isDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     */
    public void setDisplayName(boolean value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the queryName property.
     * 
     */
    public boolean isQueryName() {
        return queryName;
    }

    /**
     * Sets the value of the queryName property.
     * 
     */
    public void setQueryName(boolean value) {
        this.queryName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     */
    public boolean isDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     */
    public void setDescription(boolean value) {
        this.description = value;
    }

    /**
     * Gets the value of the creatable property.
     * 
     */
    public boolean isCreatable() {
        return creatable;
    }

    /**
     * Sets the value of the creatable property.
     * 
     */
    public void setCreatable(boolean value) {
        this.creatable = value;
    }

    /**
     * Gets the value of the fileable property.
     * 
     */
    public boolean isFileable() {
        return fileable;
    }

    /**
     * Sets the value of the fileable property.
     * 
     */
    public void setFileable(boolean value) {
        this.fileable = value;
    }

    /**
     * Gets the value of the queryable property.
     * 
     */
    public boolean isQueryable() {
        return queryable;
    }

    /**
     * Sets the value of the queryable property.
     * 
     */
    public void setQueryable(boolean value) {
        this.queryable = value;
    }

    /**
     * Gets the value of the fulltextIndexed property.
     * 
     */
    public boolean isFulltextIndexed() {
        return fulltextIndexed;
    }

    /**
     * Sets the value of the fulltextIndexed property.
     * 
     */
    public void setFulltextIndexed(boolean value) {
        this.fulltextIndexed = value;
    }

    /**
     * Gets the value of the includedInSupertypeQuery property.
     * 
     */
    public boolean isIncludedInSupertypeQuery() {
        return includedInSupertypeQuery;
    }

    /**
     * Sets the value of the includedInSupertypeQuery property.
     * 
     */
    public void setIncludedInSupertypeQuery(boolean value) {
        this.includedInSupertypeQuery = value;
    }

    /**
     * Gets the value of the controllablePolicy property.
     * 
     */
    public boolean isControllablePolicy() {
        return controllablePolicy;
    }

    /**
     * Sets the value of the controllablePolicy property.
     * 
     */
    public void setControllablePolicy(boolean value) {
        this.controllablePolicy = value;
    }

    /**
     * Gets the value of the controllableACL property.
     * 
     */
    public boolean isControllableACL() {
        return controllableACL;
    }

    /**
     * Sets the value of the controllableACL property.
     * 
     */
    public void setControllableACL(boolean value) {
        this.controllableACL = value;
    }

}
