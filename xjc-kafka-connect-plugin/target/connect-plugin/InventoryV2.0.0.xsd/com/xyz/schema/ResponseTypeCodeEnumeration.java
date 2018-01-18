
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseTypeCodeEnumeration")
@XmlEnum
public enum ResponseTypeCodeEnumeration {

    OK("OK"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    ResponseTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseTypeCodeEnumeration fromValue(String v) {
        for (ResponseTypeCodeEnumeration c: ResponseTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
