
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAFEMEquipmentTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NAFEMEquipmentTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Dispensing"/&gt;
 *     &lt;enumeration value="Refrigeration"/&gt;
 *     &lt;enumeration value="FoodPreparation"/&gt;
 *     &lt;enumeration value="SecuritySystem"/&gt;
 *     &lt;enumeration value="FrozenDessertsSteamers"/&gt;
 *     &lt;enumeration value="FrozenDessertsBeverages"/&gt;
 *     &lt;enumeration value="TemperatureFryer"/&gt;
 *     &lt;enumeration value="WareWashing"/&gt;
 *     &lt;enumeration value="IceEquipment"/&gt;
 *     &lt;enumeration value="Ovens"/&gt;
 *     &lt;enumeration value="Measurement"/&gt;
 *     &lt;enumeration value="GriddlesGrills"/&gt;
 *     &lt;enumeration value="Timers"/&gt;
 *     &lt;enumeration value="HoldingCabinets"/&gt;
 *     &lt;enumeration value="Toasters"/&gt;
 *     &lt;enumeration value="HotBeverages"/&gt;
 *     &lt;enumeration value="Ventilation"/&gt;
 *     &lt;enumeration value="HVAC"/&gt;
 *     &lt;enumeration value="WasteSystems"/&gt;
 *     &lt;enumeration value="Weighing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NAFEMEquipmentTypeCodeEnumeration")
@XmlEnum
public enum NAFEMEquipmentTypeCodeEnumeration {

    @XmlEnumValue("Dispensing")
    DISPENSING("Dispensing"),
    @XmlEnumValue("Refrigeration")
    REFRIGERATION("Refrigeration"),
    @XmlEnumValue("FoodPreparation")
    FOOD_PREPARATION("FoodPreparation"),
    @XmlEnumValue("SecuritySystem")
    SECURITY_SYSTEM("SecuritySystem"),
    @XmlEnumValue("FrozenDessertsSteamers")
    FROZEN_DESSERTS_STEAMERS("FrozenDessertsSteamers"),
    @XmlEnumValue("FrozenDessertsBeverages")
    FROZEN_DESSERTS_BEVERAGES("FrozenDessertsBeverages"),
    @XmlEnumValue("TemperatureFryer")
    TEMPERATURE_FRYER("TemperatureFryer"),
    @XmlEnumValue("WareWashing")
    WARE_WASHING("WareWashing"),
    @XmlEnumValue("IceEquipment")
    ICE_EQUIPMENT("IceEquipment"),
    @XmlEnumValue("Ovens")
    OVENS("Ovens"),
    @XmlEnumValue("Measurement")
    MEASUREMENT("Measurement"),
    @XmlEnumValue("GriddlesGrills")
    GRIDDLES_GRILLS("GriddlesGrills"),
    @XmlEnumValue("Timers")
    TIMERS("Timers"),
    @XmlEnumValue("HoldingCabinets")
    HOLDING_CABINETS("HoldingCabinets"),
    @XmlEnumValue("Toasters")
    TOASTERS("Toasters"),
    @XmlEnumValue("HotBeverages")
    HOT_BEVERAGES("HotBeverages"),
    @XmlEnumValue("Ventilation")
    VENTILATION("Ventilation"),
    HVAC("HVAC"),
    @XmlEnumValue("WasteSystems")
    WASTE_SYSTEMS("WasteSystems"),
    @XmlEnumValue("Weighing")
    WEIGHING("Weighing");
    private final String value;

    NAFEMEquipmentTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NAFEMEquipmentTypeCodeEnumeration fromValue(String v) {
        for (NAFEMEquipmentTypeCodeEnumeration c: NAFEMEquipmentTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
