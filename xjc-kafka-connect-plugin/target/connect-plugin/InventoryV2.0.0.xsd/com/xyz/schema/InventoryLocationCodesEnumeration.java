
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryLocationCodesEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryLocationCodesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Bin"/&gt;
 *     &lt;enumeration value="Shelf"/&gt;
 *     &lt;enumeration value="EndCap"/&gt;
 *     &lt;enumeration value="Pickface"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InventoryLocationCodesEnumeration")
@XmlEnum
public enum InventoryLocationCodesEnumeration {

    @XmlEnumValue("Bin")
    BIN("Bin"),
    @XmlEnumValue("Shelf")
    SHELF("Shelf"),
    @XmlEnumValue("EndCap")
    END_CAP("EndCap"),
    @XmlEnumValue("Pickface")
    PICKFACE("Pickface");
    private final String value;

    InventoryLocationCodesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InventoryLocationCodesEnumeration fromValue(String v) {
        for (InventoryLocationCodesEnumeration c: InventoryLocationCodesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
