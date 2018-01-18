
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRCTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CRCTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Bits16"/&gt;
 *     &lt;enumeration value="Bits8"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CRCTypeCodeEnumeration")
@XmlEnum
public enum CRCTypeCodeEnumeration {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Bits16")
    BITS_16("Bits16"),
    @XmlEnumValue("Bits8")
    BITS_8("Bits8");
    private final String value;

    CRCTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CRCTypeCodeEnumeration fromValue(String v) {
        for (CRCTypeCodeEnumeration c: CRCTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
