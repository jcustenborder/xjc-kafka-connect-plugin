
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAFEMAlarmStatusEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NAFEMAlarmStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Deviation"/&gt;
 *     &lt;enumeration value="Critical"/&gt;
 *     &lt;enumeration value="Fault"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NAFEMAlarmStatusEnumeration")
@XmlEnum
public enum NAFEMAlarmStatusEnumeration {

    OK("OK"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Deviation")
    DEVIATION("Deviation"),
    @XmlEnumValue("Critical")
    CRITICAL("Critical"),
    @XmlEnumValue("Fault")
    FAULT("Fault");
    private final String value;

    NAFEMAlarmStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NAFEMAlarmStatusEnumeration fromValue(String v) {
        for (NAFEMAlarmStatusEnumeration c: NAFEMAlarmStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
