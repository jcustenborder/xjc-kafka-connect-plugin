
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityMonitorTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityMonitorTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="AC"/&gt;
 *     &lt;enumeration value="Expansion"/&gt;
 *     &lt;enumeration value="Phone"/&gt;
 *     &lt;enumeration value="TransmitterBattery"/&gt;
 *     &lt;enumeration value="LineCard"/&gt;
 *     &lt;enumeration value="PowerSupply"/&gt;
 *     &lt;enumeration value="SystemBattery"/&gt;
 *     &lt;enumeration value="Communications"/&gt;
 *     &lt;enumeration value="Untyped"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecurityMonitorTypeEnumeration")
@XmlEnum
public enum SecurityMonitorTypeEnumeration {

    AC("AC"),
    @XmlEnumValue("Expansion")
    EXPANSION("Expansion"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("TransmitterBattery")
    TRANSMITTER_BATTERY("TransmitterBattery"),
    @XmlEnumValue("LineCard")
    LINE_CARD("LineCard"),
    @XmlEnumValue("PowerSupply")
    POWER_SUPPLY("PowerSupply"),
    @XmlEnumValue("SystemBattery")
    SYSTEM_BATTERY("SystemBattery"),
    @XmlEnumValue("Communications")
    COMMUNICATIONS("Communications"),
    @XmlEnumValue("Untyped")
    UNTYPED("Untyped");
    private final String value;

    SecurityMonitorTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecurityMonitorTypeEnumeration fromValue(String v) {
        for (SecurityMonitorTypeEnumeration c: SecurityMonitorTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
