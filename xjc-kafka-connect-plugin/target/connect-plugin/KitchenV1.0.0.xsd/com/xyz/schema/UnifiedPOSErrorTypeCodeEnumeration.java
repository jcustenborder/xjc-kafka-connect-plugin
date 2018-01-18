
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnifiedPOSErrorTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnifiedPOSErrorTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="E_CLOSED"/&gt;
 *     &lt;enumeration value="E_CLAIMED"/&gt;
 *     &lt;enumeration value="E_NOTCLAIMED"/&gt;
 *     &lt;enumeration value="E_NOSERVICE"/&gt;
 *     &lt;enumeration value="E_DISABLED"/&gt;
 *     &lt;enumeration value="E_ILLEGAL"/&gt;
 *     &lt;enumeration value="E_NOHARDWARE"/&gt;
 *     &lt;enumeration value="E_OFFLINE"/&gt;
 *     &lt;enumeration value="E_NOEXIST"/&gt;
 *     &lt;enumeration value="E_EXISTS"/&gt;
 *     &lt;enumeration value="E_FAILURE"/&gt;
 *     &lt;enumeration value="E_TIMEOUT"/&gt;
 *     &lt;enumeration value="E_BUSY"/&gt;
 *     &lt;enumeration value="E_EXTENDED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnifiedPOSErrorTypeCodeEnumeration")
@XmlEnum
public enum UnifiedPOSErrorTypeCodeEnumeration {

    E_CLOSED,
    E_CLAIMED,
    E_NOTCLAIMED,
    E_NOSERVICE,
    E_DISABLED,
    E_ILLEGAL,
    E_NOHARDWARE,
    E_OFFLINE,
    E_NOEXIST,
    E_EXISTS,
    E_FAILURE,
    E_TIMEOUT,
    E_BUSY,
    E_EXTENDED;

    public String value() {
        return name();
    }

    public static UnifiedPOSErrorTypeCodeEnumeration fromValue(String v) {
        return valueOf(v);
    }

}
