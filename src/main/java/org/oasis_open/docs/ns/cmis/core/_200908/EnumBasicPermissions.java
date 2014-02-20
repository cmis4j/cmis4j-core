
package org.oasis_open.docs.ns.cmis.core._200908;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumBasicPermissions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumBasicPermissions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cmis:read"/>
 *     &lt;enumeration value="cmis:write"/>
 *     &lt;enumeration value="cmis:all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumBasicPermissions")
@XmlEnum
public enum EnumBasicPermissions {

    @XmlEnumValue("cmis:read")
    CMIS_READ("cmis:read"),
    @XmlEnumValue("cmis:write")
    CMIS_WRITE("cmis:write"),
    @XmlEnumValue("cmis:all")
    CMIS_ALL("cmis:all");
    private final String value;

    EnumBasicPermissions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumBasicPermissions fromValue(String v) {
        for (EnumBasicPermissions c: EnumBasicPermissions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
