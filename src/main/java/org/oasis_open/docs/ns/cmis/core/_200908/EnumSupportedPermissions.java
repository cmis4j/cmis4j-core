package org.oasis_open.docs.ns.cmis.core._200908;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for enumSupportedPermissions.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="enumSupportedPermissions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="basic"/>
 *     &lt;enumeration value="repository"/>
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumSupportedPermissions")
@XmlEnum
public enum EnumSupportedPermissions {

	@XmlEnumValue("basic")
	BASIC("basic"), @XmlEnumValue("repository")
	REPOSITORY("repository"), @XmlEnumValue("both")
	BOTH("both");
	private final String value;

	EnumSupportedPermissions(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static EnumSupportedPermissions fromValue(String v) {
		for (EnumSupportedPermissions c : EnumSupportedPermissions.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
