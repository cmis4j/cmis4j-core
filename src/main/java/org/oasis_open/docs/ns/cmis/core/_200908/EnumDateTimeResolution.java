package org.oasis_open.docs.ns.cmis.core._200908;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for enumDateTimeResolution.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="enumDateTimeResolution">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="year"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="time"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumDateTimeResolution")
@XmlEnum
public enum EnumDateTimeResolution {

	@XmlEnumValue("year")
	YEAR("year"), @XmlEnumValue("date")
	DATE("date"), @XmlEnumValue("time")
	TIME("time");
	private final String value;

	EnumDateTimeResolution(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static EnumDateTimeResolution fromValue(String v) {
		for (EnumDateTimeResolution c : EnumDateTimeResolution.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
