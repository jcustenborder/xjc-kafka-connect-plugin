
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAFEMTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NAFEMTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Dispensing"/&gt;
 *     &lt;enumeration value="FoodPreparation"/&gt;
 *     &lt;enumeration value="FrozenDessert-Beverage"/&gt;
 *     &lt;enumeration value="Fryer"/&gt;
 *     &lt;enumeration value="Griddle-Grill"/&gt;
 *     &lt;enumeration value="HoldingCabinet"/&gt;
 *     &lt;enumeration value="HotBeverage"/&gt;
 *     &lt;enumeration value="HVAC"/&gt;
 *     &lt;enumeration value="IceEquipment"/&gt;
 *     &lt;enumeration value="Oven"/&gt;
 *     &lt;enumeration value="Refrigeration"/&gt;
 *     &lt;enumeration value="SecuritySystem"/&gt;
 *     &lt;enumeration value="Steamer"/&gt;
 *     &lt;enumeration value="TemperatureMeasurement"/&gt;
 *     &lt;enumeration value="Timer"/&gt;
 *     &lt;enumeration value="Toaster"/&gt;
 *     &lt;enumeration value="Ventilation"/&gt;
 *     &lt;enumeration value="WareWashing"/&gt;
 *     &lt;enumeration value="WasteSystem"/&gt;
 *     &lt;enumeration value="Weighing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NAFEMTypeCodeEnumeration")
@XmlEnum
public enum NAFEMTypeCodeEnumeration {

    @XmlEnumValue("Dispensing")
    DISPENSING("Dispensing"),
    @XmlEnumValue("FoodPreparation")
    FOOD_PREPARATION("FoodPreparation"),
    @XmlEnumValue("FrozenDessert-Beverage")
    FROZEN_DESSERT_BEVERAGE("FrozenDessert-Beverage"),
    @XmlEnumValue("Fryer")
    FRYER("Fryer"),
    @XmlEnumValue("Griddle-Grill")
    GRIDDLE_GRILL("Griddle-Grill"),
    @XmlEnumValue("HoldingCabinet")
    HOLDING_CABINET("HoldingCabinet"),
    @XmlEnumValue("HotBeverage")
    HOT_BEVERAGE("HotBeverage"),
    HVAC("HVAC"),
    @XmlEnumValue("IceEquipment")
    ICE_EQUIPMENT("IceEquipment"),
    @XmlEnumValue("Oven")
    OVEN("Oven"),
    @XmlEnumValue("Refrigeration")
    REFRIGERATION("Refrigeration"),
    @XmlEnumValue("SecuritySystem")
    SECURITY_SYSTEM("SecuritySystem"),
    @XmlEnumValue("Steamer")
    STEAMER("Steamer"),
    @XmlEnumValue("TemperatureMeasurement")
    TEMPERATURE_MEASUREMENT("TemperatureMeasurement"),
    @XmlEnumValue("Timer")
    TIMER("Timer"),
    @XmlEnumValue("Toaster")
    TOASTER("Toaster"),
    @XmlEnumValue("Ventilation")
    VENTILATION("Ventilation"),
    @XmlEnumValue("WareWashing")
    WARE_WASHING("WareWashing"),
    @XmlEnumValue("WasteSystem")
    WASTE_SYSTEM("WasteSystem"),
    @XmlEnumValue("Weighing")
    WEIGHING("Weighing");
    private final String value;

    NAFEMTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NAFEMTypeCodeEnumeration fromValue(String v) {
        for (NAFEMTypeCodeEnumeration c: NAFEMTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
