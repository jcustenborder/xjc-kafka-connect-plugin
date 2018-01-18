
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateTimeTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateTimeTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Message"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *     &lt;enumeration value="ActualStart"/&gt;
 *     &lt;enumeration value="Effective"/&gt;
 *     &lt;enumeration value="ExpectedDue"/&gt;
 *     &lt;enumeration value="ExpectedStart"/&gt;
 *     &lt;enumeration value="Dispatch"/&gt;
 *     &lt;enumeration value="Expiration"/&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Start"/&gt;
 *     &lt;enumeration value="End"/&gt;
 *     &lt;enumeration value="Receipt"/&gt;
 *     &lt;enumeration value="Transaction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateTimeTypeEnumeration")
@XmlEnum
public enum DateTimeTypeEnumeration {

    @XmlEnumValue("Message")
    MESSAGE("Message"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("ActualStart")
    ACTUAL_START("ActualStart"),
    @XmlEnumValue("Effective")
    EFFECTIVE("Effective"),
    @XmlEnumValue("ExpectedDue")
    EXPECTED_DUE("ExpectedDue"),
    @XmlEnumValue("ExpectedStart")
    EXPECTED_START("ExpectedStart"),
    @XmlEnumValue("Dispatch")
    DISPATCH("Dispatch"),
    @XmlEnumValue("Expiration")
    EXPIRATION("Expiration"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("End")
    END("End"),
    @XmlEnumValue("Receipt")
    RECEIPT("Receipt"),
    @XmlEnumValue("Transaction")
    TRANSACTION("Transaction");
    private final String value;

    DateTimeTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateTimeTypeEnumeration fromValue(String v) {
        for (DateTimeTypeEnumeration c: DateTimeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
