
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectionTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProtectionTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Burglary"/&gt;
 *     &lt;enumeration value="Fire"/&gt;
 *     &lt;enumeration value="Freeze"/&gt;
 *     &lt;enumeration value="Panic"/&gt;
 *     &lt;enumeration value="Medical"/&gt;
 *     &lt;enumeration value="Emergency"/&gt;
 *     &lt;enumeration value="Sprinkler"/&gt;
 *     &lt;enumeration value="Water"/&gt;
 *     &lt;enumeration value="Gas"/&gt;
 *     &lt;enumeration value="Heat"/&gt;
 *     &lt;enumeration value="Holdup"/&gt;
 *     &lt;enumeration value="UntypedZone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProtectionTypeCodeEnumeration")
@XmlEnum
public enum ProtectionTypeCodeEnumeration {

    @XmlEnumValue("Burglary")
    BURGLARY("Burglary"),
    @XmlEnumValue("Fire")
    FIRE("Fire"),
    @XmlEnumValue("Freeze")
    FREEZE("Freeze"),
    @XmlEnumValue("Panic")
    PANIC("Panic"),
    @XmlEnumValue("Medical")
    MEDICAL("Medical"),
    @XmlEnumValue("Emergency")
    EMERGENCY("Emergency"),
    @XmlEnumValue("Sprinkler")
    SPRINKLER("Sprinkler"),
    @XmlEnumValue("Water")
    WATER("Water"),
    @XmlEnumValue("Gas")
    GAS("Gas"),
    @XmlEnumValue("Heat")
    HEAT("Heat"),
    @XmlEnumValue("Holdup")
    HOLDUP("Holdup"),
    @XmlEnumValue("UntypedZone")
    UNTYPED_ZONE("UntypedZone");
    private final String value;

    ProtectionTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtectionTypeCodeEnumeration fromValue(String v) {
        for (ProtectionTypeCodeEnumeration c: ProtectionTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
