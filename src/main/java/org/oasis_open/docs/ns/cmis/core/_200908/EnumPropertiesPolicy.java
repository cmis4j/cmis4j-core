
package org.oasis_open.docs.ns.cmis.core._200908;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumPropertiesPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumPropertiesPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cmis:policyText"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumPropertiesPolicy")
@XmlEnum
public enum EnumPropertiesPolicy {

    @XmlEnumValue("cmis:policyText")
    CMIS_POLICY_TEXT("cmis:policyText");
    private final String value;

    EnumPropertiesPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPropertiesPolicy fromValue(String v) {
        for (EnumPropertiesPolicy c: EnumPropertiesPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
