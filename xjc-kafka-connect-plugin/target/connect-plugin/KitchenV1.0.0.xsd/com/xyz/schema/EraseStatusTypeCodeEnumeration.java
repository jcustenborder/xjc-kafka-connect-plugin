
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EraseStatusTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EraseStatusTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="InProgress"/&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="Failure"/&gt;
 *     &lt;enumeration value="ReadOnlyType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EraseStatusTypeCodeEnumeration")
@XmlEnum
public enum EraseStatusTypeCodeEnumeration {

    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Failure")
    FAILURE("Failure"),
    @XmlEnumValue("ReadOnlyType")
    READ_ONLY_TYPE("ReadOnlyType");
    private final String value;

    EraseStatusTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EraseStatusTypeCodeEnumeration fromValue(String v) {
        for (EraseStatusTypeCodeEnumeration c: EraseStatusTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
