
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LonMarkTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LonMarkTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Industrial"/&gt;
 *     &lt;enumeration value="EnergyManagement"/&gt;
 *     &lt;enumeration value="HVAC"/&gt;
 *     &lt;enumeration value="Lighting"/&gt;
 *     &lt;enumeration value="Refrigeration"/&gt;
 *     &lt;enumeration value="Sensors"/&gt;
 *     &lt;enumeration value="MotorControls"/&gt;
 *     &lt;enumeration value="InputOutput"/&gt;
 *     &lt;enumeration value="AccessIntrusionMonitoring"/&gt;
 *     &lt;enumeration value="FireAndSmoke"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LonMarkTypeCodeEnumeration")
@XmlEnum
public enum LonMarkTypeCodeEnumeration {

    @XmlEnumValue("Industrial")
    INDUSTRIAL("Industrial"),
    @XmlEnumValue("EnergyManagement")
    ENERGY_MANAGEMENT("EnergyManagement"),
    HVAC("HVAC"),
    @XmlEnumValue("Lighting")
    LIGHTING("Lighting"),
    @XmlEnumValue("Refrigeration")
    REFRIGERATION("Refrigeration"),
    @XmlEnumValue("Sensors")
    SENSORS("Sensors"),
    @XmlEnumValue("MotorControls")
    MOTOR_CONTROLS("MotorControls"),
    @XmlEnumValue("InputOutput")
    INPUT_OUTPUT("InputOutput"),
    @XmlEnumValue("AccessIntrusionMonitoring")
    ACCESS_INTRUSION_MONITORING("AccessIntrusionMonitoring"),
    @XmlEnumValue("FireAndSmoke")
    FIRE_AND_SMOKE("FireAndSmoke");
    private final String value;

    LonMarkTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LonMarkTypeCodeEnumeration fromValue(String v) {
        for (LonMarkTypeCodeEnumeration c: LonMarkTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
