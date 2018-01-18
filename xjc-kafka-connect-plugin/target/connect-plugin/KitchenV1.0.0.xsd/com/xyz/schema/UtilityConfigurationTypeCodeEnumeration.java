
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtilityConfigurationTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UtilityConfigurationTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="NotAvailable"/&gt;
 *     &lt;enumeration value="Gas"/&gt;
 *     &lt;enumeration value="Electric"/&gt;
 *     &lt;enumeration value="Water"/&gt;
 *     &lt;enumeration value="Steam"/&gt;
 *     &lt;enumeration value="CompressedGas"/&gt;
 *     &lt;enumeration value="Refrigerant"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UtilityConfigurationTypeCodeEnumeration")
@XmlEnum
public enum UtilityConfigurationTypeCodeEnumeration {

    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable"),
    @XmlEnumValue("Gas")
    GAS("Gas"),
    @XmlEnumValue("Electric")
    ELECTRIC("Electric"),
    @XmlEnumValue("Water")
    WATER("Water"),
    @XmlEnumValue("Steam")
    STEAM("Steam"),
    @XmlEnumValue("CompressedGas")
    COMPRESSED_GAS("CompressedGas"),
    @XmlEnumValue("Refrigerant")
    REFRIGERANT("Refrigerant"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    UtilityConfigurationTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UtilityConfigurationTypeCodeEnumeration fromValue(String v) {
        for (UtilityConfigurationTypeCodeEnumeration c: UtilityConfigurationTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
