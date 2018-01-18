
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchandiseHierarchyLevelEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MerchandiseHierarchyLevelEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Division"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *     &lt;enumeration value="SubGroup"/&gt;
 *     &lt;enumeration value="MajorDepartment"/&gt;
 *     &lt;enumeration value="Department"/&gt;
 *     &lt;enumeration value="SubDepartment"/&gt;
 *     &lt;enumeration value="MajorClass"/&gt;
 *     &lt;enumeration value="Class"/&gt;
 *     &lt;enumeration value="SubClass"/&gt;
 *     &lt;enumeration value="Category"/&gt;
 *     &lt;enumeration value="SubCategory"/&gt;
 *     &lt;enumeration value="Style"/&gt;
 *     &lt;enumeration value="SKU"/&gt;
 *     &lt;enumeration value="UPC"/&gt;
 *     &lt;enumeration value="EPC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MerchandiseHierarchyLevelEnumeration")
@XmlEnum
public enum MerchandiseHierarchyLevelEnumeration {

    @XmlEnumValue("Division")
    DIVISION("Division"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("SubGroup")
    SUB_GROUP("SubGroup"),
    @XmlEnumValue("MajorDepartment")
    MAJOR_DEPARTMENT("MajorDepartment"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department"),
    @XmlEnumValue("SubDepartment")
    SUB_DEPARTMENT("SubDepartment"),
    @XmlEnumValue("MajorClass")
    MAJOR_CLASS("MajorClass"),
    @XmlEnumValue("Class")
    CLASS("Class"),
    @XmlEnumValue("SubClass")
    SUB_CLASS("SubClass"),
    @XmlEnumValue("Category")
    CATEGORY("Category"),
    @XmlEnumValue("SubCategory")
    SUB_CATEGORY("SubCategory"),
    @XmlEnumValue("Style")
    STYLE("Style"),
    SKU("SKU"),
    UPC("UPC"),
    EPC("EPC");
    private final String value;

    MerchandiseHierarchyLevelEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MerchandiseHierarchyLevelEnumeration fromValue(String v) {
        for (MerchandiseHierarchyLevelEnumeration c: MerchandiseHierarchyLevelEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
