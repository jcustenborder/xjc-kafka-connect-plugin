
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessStatusTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessStatusTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="Forced"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *     &lt;enumeration value="Late"/&gt;
 *     &lt;enumeration value="Early"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessStatusTypeEnumeration")
@XmlEnum
public enum AccessStatusTypeEnumeration {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Forced")
    FORCED("Forced"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Late")
    LATE("Late"),
    @XmlEnumValue("Early")
    EARLY("Early");
    private final String value;

    AccessStatusTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessStatusTypeEnumeration fromValue(String v) {
        for (AccessStatusTypeEnumeration c: AccessStatusTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
