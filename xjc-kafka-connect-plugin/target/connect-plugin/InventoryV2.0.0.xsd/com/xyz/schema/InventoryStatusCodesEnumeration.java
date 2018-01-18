
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryStatusCodesEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryStatusCodesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="AvailableOnHand"/&gt;
 *     &lt;enumeration value="AvailableToSell"/&gt;
 *     &lt;enumeration value="OnOrder"/&gt;
 *     &lt;enumeration value="InTransitInBound"/&gt;
 *     &lt;enumeration value="ReservedOnHand"/&gt;
 *     &lt;enumeration value="Sold"/&gt;
 *     &lt;enumeration value="DefectiveOnHand"/&gt;
 *     &lt;enumeration value="ReturnToVendor"/&gt;
 *     &lt;enumeration value="Shrinkage"/&gt;
 *     &lt;enumeration value="PreSellOrders"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InventoryStatusCodesEnumeration")
@XmlEnum
public enum InventoryStatusCodesEnumeration {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("AvailableOnHand")
    AVAILABLE_ON_HAND("AvailableOnHand"),
    @XmlEnumValue("AvailableToSell")
    AVAILABLE_TO_SELL("AvailableToSell"),
    @XmlEnumValue("OnOrder")
    ON_ORDER("OnOrder"),
    @XmlEnumValue("InTransitInBound")
    IN_TRANSIT_IN_BOUND("InTransitInBound"),
    @XmlEnumValue("ReservedOnHand")
    RESERVED_ON_HAND("ReservedOnHand"),
    @XmlEnumValue("Sold")
    SOLD("Sold"),
    @XmlEnumValue("DefectiveOnHand")
    DEFECTIVE_ON_HAND("DefectiveOnHand"),
    @XmlEnumValue("ReturnToVendor")
    RETURN_TO_VENDOR("ReturnToVendor"),
    @XmlEnumValue("Shrinkage")
    SHRINKAGE("Shrinkage"),
    @XmlEnumValue("PreSellOrders")
    PRE_SELL_ORDERS("PreSellOrders");
    private final String value;

    InventoryStatusCodesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InventoryStatusCodesEnumeration fromValue(String v) {
        for (InventoryStatusCodesEnumeration c: InventoryStatusCodesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
