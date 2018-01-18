
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntryMethodEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntryMethodEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="SmartCard"/&gt;
 *     &lt;enumeration value="MICR"/&gt;
 *     &lt;enumeration value="MSR"/&gt;
 *     &lt;enumeration value="Keyed"/&gt;
 *     &lt;enumeration value="Scanned"/&gt;
 *     &lt;enumeration value="Weighed"/&gt;
 *     &lt;enumeration value="Measured"/&gt;
 *     &lt;enumeration value="RFID"/&gt;
 *     &lt;enumeration value="Automatic"/&gt;
 *     &lt;enumeration value="IntegratedChipCard"/&gt;
 *     &lt;enumeration value="Tapped"/&gt;
 *     &lt;enumeration value="Waved"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntryMethodEnumeration")
@XmlEnum
public enum EntryMethodEnumeration {

    @XmlEnumValue("SmartCard")
    SMART_CARD("SmartCard"),
    MICR("MICR"),
    MSR("MSR"),
    @XmlEnumValue("Keyed")
    KEYED("Keyed"),
    @XmlEnumValue("Scanned")
    SCANNED("Scanned"),
    @XmlEnumValue("Weighed")
    WEIGHED("Weighed"),
    @XmlEnumValue("Measured")
    MEASURED("Measured"),
    RFID("RFID"),
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),
    @XmlEnumValue("IntegratedChipCard")
    INTEGRATED_CHIP_CARD("IntegratedChipCard"),
    @XmlEnumValue("Tapped")
    TAPPED("Tapped"),
    @XmlEnumValue("Waved")
    WAVED("Waved");
    private final String value;

    EntryMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntryMethodEnumeration fromValue(String v) {
        for (EntryMethodEnumeration c: EntryMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
