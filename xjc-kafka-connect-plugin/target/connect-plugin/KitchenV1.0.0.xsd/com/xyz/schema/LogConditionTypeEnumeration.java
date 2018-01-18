
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogConditionTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogConditionTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="System"/&gt;
 *     &lt;enumeration value="User"/&gt;
 *     &lt;enumeration value="Access"/&gt;
 *     &lt;enumeration value="Monitor"/&gt;
 *     &lt;enumeration value="Alarm"/&gt;
 *     &lt;enumeration value="Fault"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LogConditionTypeEnumeration")
@XmlEnum
public enum LogConditionTypeEnumeration {

    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Access")
    ACCESS("Access"),
    @XmlEnumValue("Monitor")
    MONITOR("Monitor"),
    @XmlEnumValue("Alarm")
    ALARM("Alarm"),
    @XmlEnumValue("Fault")
    FAULT("Fault");
    private final String value;

    LogConditionTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogConditionTypeEnumeration fromValue(String v) {
        for (LogConditionTypeEnumeration c: LogConditionTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
