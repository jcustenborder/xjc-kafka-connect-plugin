
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdminAccessTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdminAccessTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Public"/&gt;
 *     &lt;enumeration value="Administration"/&gt;
 *     &lt;enumeration value="Private"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdminAccessTypeCodeEnumeration")
@XmlEnum
public enum AdminAccessTypeCodeEnumeration {

    @XmlEnumValue("Public")
    PUBLIC("Public"),
    @XmlEnumValue("Administration")
    ADMINISTRATION("Administration"),
    @XmlEnumValue("Private")
    PRIVATE("Private");
    private final String value;

    AdminAccessTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdminAccessTypeCodeEnumeration fromValue(String v) {
        for (AdminAccessTypeCodeEnumeration c: AdminAccessTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
