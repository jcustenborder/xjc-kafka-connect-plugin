
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessUnitTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessUnitTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="RetailStore"/&gt;
 *     &lt;enumeration value="DistributionCenter"/&gt;
 *     &lt;enumeration value="AdministrationCenter"/&gt;
 *     &lt;enumeration value="CallCenter"/&gt;
 *     &lt;enumeration value="WebSite"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessUnitTypeCodeEnumeration")
@XmlEnum
public enum BusinessUnitTypeCodeEnumeration {

    @XmlEnumValue("RetailStore")
    RETAIL_STORE("RetailStore"),
    @XmlEnumValue("DistributionCenter")
    DISTRIBUTION_CENTER("DistributionCenter"),
    @XmlEnumValue("AdministrationCenter")
    ADMINISTRATION_CENTER("AdministrationCenter"),
    @XmlEnumValue("CallCenter")
    CALL_CENTER("CallCenter"),
    @XmlEnumValue("WebSite")
    WEB_SITE("WebSite");
    private final String value;

    BusinessUnitTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessUnitTypeCodeEnumeration fromValue(String v) {
        for (BusinessUnitTypeCodeEnumeration c: BusinessUnitTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
