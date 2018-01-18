
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessStateTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessStateTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Open"/&gt;
 *     &lt;enumeration value="Closed"/&gt;
 *     &lt;enumeration value="Armed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessStateTypeEnumeration")
@XmlEnum
public enum AccessStateTypeEnumeration {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Armed")
    ARMED("Armed");
    private final String value;

    AccessStateTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessStateTypeEnumeration fromValue(String v) {
        for (AccessStateTypeEnumeration c: AccessStateTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
