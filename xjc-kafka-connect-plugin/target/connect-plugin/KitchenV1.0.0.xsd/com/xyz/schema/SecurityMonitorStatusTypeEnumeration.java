
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityMonitorStatusTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityMonitorStatusTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecurityMonitorStatusTypeEnumeration")
@XmlEnum
public enum SecurityMonitorStatusTypeEnumeration {

    OK("OK"),
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    SecurityMonitorStatusTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecurityMonitorStatusTypeEnumeration fromValue(String v) {
        for (SecurityMonitorStatusTypeEnumeration c: SecurityMonitorStatusTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
