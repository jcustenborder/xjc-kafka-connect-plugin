
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAFEMUnitsEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NAFEMUnitsEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Meter"/&gt;
 *     &lt;enumeration value="Millimeter"/&gt;
 *     &lt;enumeration value="Gram"/&gt;
 *     &lt;enumeration value="Kilogram"/&gt;
 *     &lt;enumeration value="Second"/&gt;
 *     &lt;enumeration value="Ampere"/&gt;
 *     &lt;enumeration value="Millampere"/&gt;
 *     &lt;enumeration value="Kelvin"/&gt;
 *     &lt;enumeration value="Celcius"/&gt;
 *     &lt;enumeration value="Candela"/&gt;
 *     &lt;enumeration value="Lumen"/&gt;
 *     &lt;enumeration value="Lux"/&gt;
 *     &lt;enumeration value="Hertz"/&gt;
 *     &lt;enumeration value="Newton"/&gt;
 *     &lt;enumeration value="Pascal"/&gt;
 *     &lt;enumeration value="Joule"/&gt;
 *     &lt;enumeration value="Watt"/&gt;
 *     &lt;enumeration value="Volt"/&gt;
 *     &lt;enumeration value="Ohm"/&gt;
 *     &lt;enumeration value="Radian"/&gt;
 *     &lt;enumeration value="Degree"/&gt;
 *     &lt;enumeration value="Gay"/&gt;
 *     &lt;enumeration value="Sievert"/&gt;
 *     &lt;enumeration value="Katal"/&gt;
 *     &lt;enumeration value="Poiseuille"/&gt;
 *     &lt;enumeration value="Rayl"/&gt;
 *     &lt;enumeration value="dB"/&gt;
 *     &lt;enumeration value="Inch"/&gt;
 *     &lt;enumeration value="Foot"/&gt;
 *     &lt;enumeration value="Pound"/&gt;
 *     &lt;enumeration value="Fahrenheit"/&gt;
 *     &lt;enumeration value="PSI"/&gt;
 *     &lt;enumeration value="BTU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NAFEMUnitsEnumeration")
@XmlEnum
public enum NAFEMUnitsEnumeration {

    @XmlEnumValue("Meter")
    METER("Meter"),
    @XmlEnumValue("Millimeter")
    MILLIMETER("Millimeter"),
    @XmlEnumValue("Gram")
    GRAM("Gram"),
    @XmlEnumValue("Kilogram")
    KILOGRAM("Kilogram"),
    @XmlEnumValue("Second")
    SECOND("Second"),
    @XmlEnumValue("Ampere")
    AMPERE("Ampere"),
    @XmlEnumValue("Millampere")
    MILLAMPERE("Millampere"),
    @XmlEnumValue("Kelvin")
    KELVIN("Kelvin"),
    @XmlEnumValue("Celcius")
    CELCIUS("Celcius"),
    @XmlEnumValue("Candela")
    CANDELA("Candela"),
    @XmlEnumValue("Lumen")
    LUMEN("Lumen"),
    @XmlEnumValue("Lux")
    LUX("Lux"),
    @XmlEnumValue("Hertz")
    HERTZ("Hertz"),
    @XmlEnumValue("Newton")
    NEWTON("Newton"),
    @XmlEnumValue("Pascal")
    PASCAL("Pascal"),
    @XmlEnumValue("Joule")
    JOULE("Joule"),
    @XmlEnumValue("Watt")
    WATT("Watt"),
    @XmlEnumValue("Volt")
    VOLT("Volt"),
    @XmlEnumValue("Ohm")
    OHM("Ohm"),
    @XmlEnumValue("Radian")
    RADIAN("Radian"),
    @XmlEnumValue("Degree")
    DEGREE("Degree"),
    @XmlEnumValue("Gay")
    GAY("Gay"),
    @XmlEnumValue("Sievert")
    SIEVERT("Sievert"),
    @XmlEnumValue("Katal")
    KATAL("Katal"),
    @XmlEnumValue("Poiseuille")
    POISEUILLE("Poiseuille"),
    @XmlEnumValue("Rayl")
    RAYL("Rayl"),
    @XmlEnumValue("dB")
    D_B("dB"),
    @XmlEnumValue("Inch")
    INCH("Inch"),
    @XmlEnumValue("Foot")
    FOOT("Foot"),
    @XmlEnumValue("Pound")
    POUND("Pound"),
    @XmlEnumValue("Fahrenheit")
    FAHRENHEIT("Fahrenheit"),
    PSI("PSI"),
    BTU("BTU");
    private final String value;

    NAFEMUnitsEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NAFEMUnitsEnumeration fromValue(String v) {
        for (NAFEMUnitsEnumeration c: NAFEMUnitsEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
