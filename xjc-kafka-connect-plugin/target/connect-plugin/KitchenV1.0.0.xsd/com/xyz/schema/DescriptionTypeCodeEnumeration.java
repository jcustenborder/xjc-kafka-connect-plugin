
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescriptionTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DescriptionTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Long"/&gt;
 *     &lt;enumeration value="Short"/&gt;
 *     &lt;enumeration value="Web"/&gt;
 *     &lt;enumeration value="Supplier"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DescriptionTypeCodeEnumeration")
@XmlEnum
public enum DescriptionTypeCodeEnumeration {

    @XmlEnumValue("Long")
    LONG("Long"),
    @XmlEnumValue("Short")
    SHORT("Short"),
    @XmlEnumValue("Web")
    WEB("Web"),
    @XmlEnumValue("Supplier")
    SUPPLIER("Supplier");
    private final String value;

    DescriptionTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DescriptionTypeCodeEnumeration fromValue(String v) {
        for (DescriptionTypeCodeEnumeration c: DescriptionTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
