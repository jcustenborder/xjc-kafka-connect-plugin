
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Cashier"/&gt;
 *     &lt;enumeration value="Checker"/&gt;
 *     &lt;enumeration value="OrderTaker"/&gt;
 *     &lt;enumeration value="Server"/&gt;
 *     &lt;enumeration value="Expediter"/&gt;
 *     &lt;enumeration value="BarTender"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperatorTypeCodeEnumeration")
@XmlEnum
public enum OperatorTypeCodeEnumeration {

    @XmlEnumValue("Cashier")
    CASHIER("Cashier"),
    @XmlEnumValue("Checker")
    CHECKER("Checker"),
    @XmlEnumValue("OrderTaker")
    ORDER_TAKER("OrderTaker"),
    @XmlEnumValue("Server")
    SERVER("Server"),
    @XmlEnumValue("Expediter")
    EXPEDITER("Expediter"),
    @XmlEnumValue("BarTender")
    BAR_TENDER("BarTender");
    private final String value;

    OperatorTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatorTypeCodeEnumeration fromValue(String v) {
        for (OperatorTypeCodeEnumeration c: OperatorTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
