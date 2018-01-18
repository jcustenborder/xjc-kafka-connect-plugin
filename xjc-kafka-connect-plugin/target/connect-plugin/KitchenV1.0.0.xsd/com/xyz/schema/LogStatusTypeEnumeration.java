
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogStatusTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogStatusTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="SystemService"/&gt;
 *     &lt;enumeration value="Tamper"/&gt;
 *     &lt;enumeration value="Reset"/&gt;
 *     &lt;enumeration value="User"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LogStatusTypeEnumeration")
@XmlEnum
public enum LogStatusTypeEnumeration {

    @XmlEnumValue("SystemService")
    SYSTEM_SERVICE("SystemService"),
    @XmlEnumValue("Tamper")
    TAMPER("Tamper"),
    @XmlEnumValue("Reset")
    RESET("Reset"),
    @XmlEnumValue("User")
    USER("User");
    private final String value;

    LogStatusTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogStatusTypeEnumeration fromValue(String v) {
        for (LogStatusTypeEnumeration c: LogStatusTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
