
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryAdjustmentActionEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryAdjustmentActionEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="Subtract"/&gt;
 *     &lt;enumeration value="Set"/&gt;
 *     &lt;enumeration value="InformationOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InventoryAdjustmentActionEnumeration")
@XmlEnum
public enum InventoryAdjustmentActionEnumeration {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Subtract")
    SUBTRACT("Subtract"),
    @XmlEnumValue("Set")
    SET("Set"),
    @XmlEnumValue("InformationOnly")
    INFORMATION_ONLY("InformationOnly");
    private final String value;

    InventoryAdjustmentActionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InventoryAdjustmentActionEnumeration fromValue(String v) {
        for (InventoryAdjustmentActionEnumeration c: InventoryAdjustmentActionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
