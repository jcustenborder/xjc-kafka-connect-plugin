
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckHealthLevelTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckHealthLevelTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="CH_INTERNAL"/&gt;
 *     &lt;enumeration value="CH_EXTERNAL"/&gt;
 *     &lt;enumeration value="CH_INTERACTIVE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CheckHealthLevelTypeCodeEnumeration")
@XmlEnum
public enum CheckHealthLevelTypeCodeEnumeration {

    CH_INTERNAL,
    CH_EXTERNAL,
    CH_INTERACTIVE;

    public String value() {
        return name();
    }

    public static CheckHealthLevelTypeCodeEnumeration fromValue(String v) {
        return valueOf(v);
    }

}
