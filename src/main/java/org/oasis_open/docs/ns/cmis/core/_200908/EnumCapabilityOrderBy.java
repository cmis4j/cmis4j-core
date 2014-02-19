package org.oasis_open.docs.ns.cmis.core._200908;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for enumCapabilityOrderBy.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="enumCapabilityOrderBy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="common"/>
 *     &lt;enumeration value="custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumCapabilityOrderBy")
@XmlEnum
public enum EnumCapabilityOrderBy {

	@XmlEnumValue("none")
	NONE("none"), @XmlEnumValue("common")
	COMMON("common"), @XmlEnumValue("custom")
	CUSTOM("custom");
	private final String value;

	EnumCapabilityOrderBy(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static EnumCapabilityOrderBy fromValue(String v) {
		for (EnumCapabilityOrderBy c : EnumCapabilityOrderBy.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
