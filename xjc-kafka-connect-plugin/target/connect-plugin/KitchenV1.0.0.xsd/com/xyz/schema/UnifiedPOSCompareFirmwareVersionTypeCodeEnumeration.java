
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnifiedPOSCompareFirmwareVersionTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnifiedPOSCompareFirmwareVersionTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="CFV_FIRMWARE_OLDER"/&gt;
 *     &lt;enumeration value="CFV_FIRMWARE_SAME"/&gt;
 *     &lt;enumeration value="CFV_FIRMWARE_NEWER"/&gt;
 *     &lt;enumeration value="CFV_FIRMWARE_DIFFERENT"/&gt;
 *     &lt;enumeration value="CFV_FIRMWARE_UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnifiedPOSCompareFirmwareVersionTypeCodeEnumeration")
@XmlEnum
public enum UnifiedPOSCompareFirmwareVersionTypeCodeEnumeration {

    CFV_FIRMWARE_OLDER,
    CFV_FIRMWARE_SAME,
    CFV_FIRMWARE_NEWER,
    CFV_FIRMWARE_DIFFERENT,
    CFV_FIRMWARE_UNKNOWN;

    public String value() {
        return name();
    }

    public static UnifiedPOSCompareFirmwareVersionTypeCodeEnumeration fromValue(String v) {
        return valueOf(v);
    }

}
