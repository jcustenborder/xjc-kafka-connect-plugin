
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryTypeCodesEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryTypeCodesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Inventory"/&gt;
 *     &lt;enumeration value="Reservation"/&gt;
 *     &lt;enumeration value="StockCount"/&gt;
 *     &lt;enumeration value="StockTransfer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InventoryTypeCodesEnumeration")
@XmlEnum
public enum InventoryTypeCodesEnumeration {

    @XmlEnumValue("Inventory")
    INVENTORY("Inventory"),
    @XmlEnumValue("Reservation")
    RESERVATION("Reservation"),
    @XmlEnumValue("StockCount")
    STOCK_COUNT("StockCount"),
    @XmlEnumValue("StockTransfer")
    STOCK_TRANSFER("StockTransfer");
    private final String value;

    InventoryTypeCodesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InventoryTypeCodesEnumeration fromValue(String v) {
        for (InventoryTypeCodesEnumeration c: InventoryTypeCodesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
