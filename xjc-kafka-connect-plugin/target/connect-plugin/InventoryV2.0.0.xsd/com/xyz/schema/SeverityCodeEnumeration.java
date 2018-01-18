
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeverityCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeverityCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Information"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SeverityCodeEnumeration")
@XmlEnum
public enum SeverityCodeEnumeration {

    @XmlEnumValue("Information")
    INFORMATION("Information"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    SeverityCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeverityCodeEnumeration fromValue(String v) {
        for (SeverityCodeEnumeration c: SeverityCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
