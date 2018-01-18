
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonitorObjectNameTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MonitorObjectNameTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="AirflowTemperature"/&gt;
 *     &lt;enumeration value="CabinetSetTemperature"/&gt;
 *     &lt;enumeration value="CabinetTemperature"/&gt;
 *     &lt;enumeration value="CleaningState"/&gt;
 *     &lt;enumeration value="CondensorInletTemperature"/&gt;
 *     &lt;enumeration value="CondensorOutletTemperature"/&gt;
 *     &lt;enumeration value="ConvectionState"/&gt;
 *     &lt;enumeration value="CoolingState"/&gt;
 *     &lt;enumeration value="DefrostDuration"/&gt;
 *     &lt;enumeration value="DefrostIntervalTime"/&gt;
 *     &lt;enumeration value="DefrostState"/&gt;
 *     &lt;enumeration value="DetergentAgentConcentration"/&gt;
 *     &lt;enumeration value="DoorOpen"/&gt;
 *     &lt;enumeration value="DoorOpenCounter"/&gt;
 *     &lt;enumeration value="EvaporatorTemperature"/&gt;
 *     &lt;enumeration value="EvaporatorPressure"/&gt;
 *     &lt;enumeration value="FinalRinseSetTemperature"/&gt;
 *     &lt;enumeration value="FinalRinseTemperature"/&gt;
 *     &lt;enumeration value="FoodProductTemperature"/&gt;
 *     &lt;enumeration value="HarvestState"/&gt;
 *     &lt;enumeration value="HoldingState"/&gt;
 *     &lt;enumeration value="IdlingState"/&gt;
 *     &lt;enumeration value="MeltState"/&gt;
 *     &lt;enumeration value="MicrowaveState"/&gt;
 *     &lt;enumeration value="RecoveryInterval"/&gt;
 *     &lt;enumeration value="RinseAgentConcentration"/&gt;
 *     &lt;enumeration value="SanitizerAgentConcentration"/&gt;
 *     &lt;enumeration value="SteamingState"/&gt;
 *     &lt;enumeration value="SurfaceSetTemperature"/&gt;
 *     &lt;enumeration value="SurfaceTemperature"/&gt;
 *     &lt;enumeration value="TankSetTemperature"/&gt;
 *     &lt;enumeration value="TankTemperature"/&gt;
 *     &lt;enumeration value="VatSetTemperature"/&gt;
 *     &lt;enumeration value="VatTemperature"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MonitorObjectNameTypeEnumeration")
@XmlEnum
public enum MonitorObjectNameTypeEnumeration {

    @XmlEnumValue("AirflowTemperature")
    AIRFLOW_TEMPERATURE("AirflowTemperature"),
    @XmlEnumValue("CabinetSetTemperature")
    CABINET_SET_TEMPERATURE("CabinetSetTemperature"),
    @XmlEnumValue("CabinetTemperature")
    CABINET_TEMPERATURE("CabinetTemperature"),
    @XmlEnumValue("CleaningState")
    CLEANING_STATE("CleaningState"),
    @XmlEnumValue("CondensorInletTemperature")
    CONDENSOR_INLET_TEMPERATURE("CondensorInletTemperature"),
    @XmlEnumValue("CondensorOutletTemperature")
    CONDENSOR_OUTLET_TEMPERATURE("CondensorOutletTemperature"),
    @XmlEnumValue("ConvectionState")
    CONVECTION_STATE("ConvectionState"),
    @XmlEnumValue("CoolingState")
    COOLING_STATE("CoolingState"),
    @XmlEnumValue("DefrostDuration")
    DEFROST_DURATION("DefrostDuration"),
    @XmlEnumValue("DefrostIntervalTime")
    DEFROST_INTERVAL_TIME("DefrostIntervalTime"),
    @XmlEnumValue("DefrostState")
    DEFROST_STATE("DefrostState"),
    @XmlEnumValue("DetergentAgentConcentration")
    DETERGENT_AGENT_CONCENTRATION("DetergentAgentConcentration"),
    @XmlEnumValue("DoorOpen")
    DOOR_OPEN("DoorOpen"),
    @XmlEnumValue("DoorOpenCounter")
    DOOR_OPEN_COUNTER("DoorOpenCounter"),
    @XmlEnumValue("EvaporatorTemperature")
    EVAPORATOR_TEMPERATURE("EvaporatorTemperature"),
    @XmlEnumValue("EvaporatorPressure")
    EVAPORATOR_PRESSURE("EvaporatorPressure"),
    @XmlEnumValue("FinalRinseSetTemperature")
    FINAL_RINSE_SET_TEMPERATURE("FinalRinseSetTemperature"),
    @XmlEnumValue("FinalRinseTemperature")
    FINAL_RINSE_TEMPERATURE("FinalRinseTemperature"),
    @XmlEnumValue("FoodProductTemperature")
    FOOD_PRODUCT_TEMPERATURE("FoodProductTemperature"),
    @XmlEnumValue("HarvestState")
    HARVEST_STATE("HarvestState"),
    @XmlEnumValue("HoldingState")
    HOLDING_STATE("HoldingState"),
    @XmlEnumValue("IdlingState")
    IDLING_STATE("IdlingState"),
    @XmlEnumValue("MeltState")
    MELT_STATE("MeltState"),
    @XmlEnumValue("MicrowaveState")
    MICROWAVE_STATE("MicrowaveState"),
    @XmlEnumValue("RecoveryInterval")
    RECOVERY_INTERVAL("RecoveryInterval"),
    @XmlEnumValue("RinseAgentConcentration")
    RINSE_AGENT_CONCENTRATION("RinseAgentConcentration"),
    @XmlEnumValue("SanitizerAgentConcentration")
    SANITIZER_AGENT_CONCENTRATION("SanitizerAgentConcentration"),
    @XmlEnumValue("SteamingState")
    STEAMING_STATE("SteamingState"),
    @XmlEnumValue("SurfaceSetTemperature")
    SURFACE_SET_TEMPERATURE("SurfaceSetTemperature"),
    @XmlEnumValue("SurfaceTemperature")
    SURFACE_TEMPERATURE("SurfaceTemperature"),
    @XmlEnumValue("TankSetTemperature")
    TANK_SET_TEMPERATURE("TankSetTemperature"),
    @XmlEnumValue("TankTemperature")
    TANK_TEMPERATURE("TankTemperature"),
    @XmlEnumValue("VatSetTemperature")
    VAT_SET_TEMPERATURE("VatSetTemperature"),
    @XmlEnumValue("VatTemperature")
    VAT_TEMPERATURE("VatTemperature");
    private final String value;

    MonitorObjectNameTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonitorObjectNameTypeEnumeration fromValue(String v) {
        for (MonitorObjectNameTypeEnumeration c: MonitorObjectNameTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
