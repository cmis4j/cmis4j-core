
package org.oasis_open.docs.ns.cmis.core._200908;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumUpdatability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumUpdatability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="readonly"/>
 *     &lt;enumeration value="readwrite"/>
 *     &lt;enumeration value="whencheckedout"/>
 *     &lt;enumeration value="oncreate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumUpdatability")
@XmlEnum
public enum EnumUpdatability {

    @XmlEnumValue("readonly")
    READONLY("readonly"),
    @XmlEnumValue("readwrite")
    READWRITE("readwrite"),
    @XmlEnumValue("whencheckedout")
    WHENCHECKEDOUT("whencheckedout"),
    @XmlEnumValue("oncreate")
    ONCREATE("oncreate");
    private final String value;

    EnumUpdatability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumUpdatability fromValue(String v) {
        for (EnumUpdatability c: EnumUpdatability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
