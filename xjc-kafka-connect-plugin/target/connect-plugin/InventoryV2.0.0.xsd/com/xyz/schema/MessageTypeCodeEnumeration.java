
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Request"/&gt;
 *     &lt;enumeration value="Response"/&gt;
 *     &lt;enumeration value="Publish"/&gt;
 *     &lt;enumeration value="Acknowledge"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageTypeCodeEnumeration")
@XmlEnum
public enum MessageTypeCodeEnumeration {

    @XmlEnumValue("Request")
    REQUEST("Request"),
    @XmlEnumValue("Response")
    RESPONSE("Response"),
    @XmlEnumValue("Publish")
    PUBLISH("Publish"),
    @XmlEnumValue("Acknowledge")
    ACKNOWLEDGE("Acknowledge");
    private final String value;

    MessageTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageTypeCodeEnumeration fromValue(String v) {
        for (MessageTypeCodeEnumeration c: MessageTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
