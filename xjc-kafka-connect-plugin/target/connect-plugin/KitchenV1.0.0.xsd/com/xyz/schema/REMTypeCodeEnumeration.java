
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REMTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="REMTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Heartbeat"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "REMTypeCodeEnumeration")
@XmlEnum
public enum REMTypeCodeEnumeration {

    @XmlEnumValue("Heartbeat")
    HEARTBEAT("Heartbeat");
    private final String value;

    REMTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static REMTypeCodeEnumeration fromValue(String v) {
        for (REMTypeCodeEnumeration c: REMTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
