
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintenanceStatusTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaintenanceStatusTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Ok"/&gt;
 *     &lt;enumeration value="Alarm"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MaintenanceStatusTypeCodeEnumeration")
@XmlEnum
public enum MaintenanceStatusTypeCodeEnumeration {

    @XmlEnumValue("Ok")
    OK("Ok"),
    @XmlEnumValue("Alarm")
    ALARM("Alarm");
    private final String value;

    MaintenanceStatusTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaintenanceStatusTypeCodeEnumeration fromValue(String v) {
        for (MaintenanceStatusTypeCodeEnumeration c: MaintenanceStatusTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
