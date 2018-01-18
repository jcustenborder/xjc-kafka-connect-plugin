
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CycleCountTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CycleCountTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Physical"/&gt;
 *     &lt;enumeration value="Cycle"/&gt;
 *     &lt;enumeration value="Adhoc"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CycleCountTypeCodeEnumeration")
@XmlEnum
public enum CycleCountTypeCodeEnumeration {

    @XmlEnumValue("Physical")
    PHYSICAL("Physical"),
    @XmlEnumValue("Cycle")
    CYCLE("Cycle"),
    @XmlEnumValue("Adhoc")
    ADHOC("Adhoc");
    private final String value;

    CycleCountTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CycleCountTypeCodeEnumeration fromValue(String v) {
        for (CycleCountTypeCodeEnumeration c: CycleCountTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
