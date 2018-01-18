
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionCommonDataTypeCodesEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionCommonDataTypeCodesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Begin"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *     &lt;enumeration value="Complete"/&gt;
 *     &lt;enumeration value="Create"/&gt;
 *     &lt;enumeration value="Delete"/&gt;
 *     &lt;enumeration value="Dispatch"/&gt;
 *     &lt;enumeration value="Lookup"/&gt;
 *     &lt;enumeration value="Initiate"/&gt;
 *     &lt;enumeration value="Instruction"/&gt;
 *     &lt;enumeration value="Information"/&gt;
 *     &lt;enumeration value="PartialCancel"/&gt;
 *     &lt;enumeration value="PartialComplete"/&gt;
 *     &lt;enumeration value="Read"/&gt;
 *     &lt;enumeration value="Request"/&gt;
 *     &lt;enumeration value="Update"/&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="Subtract"/&gt;
 *     &lt;enumeration value="Replace"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionCommonDataTypeCodesEnumeration")
@XmlEnum
public enum ActionCommonDataTypeCodesEnumeration {

    @XmlEnumValue("Begin")
    BEGIN("Begin"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Dispatch")
    DISPATCH("Dispatch"),
    @XmlEnumValue("Lookup")
    LOOKUP("Lookup"),
    @XmlEnumValue("Initiate")
    INITIATE("Initiate"),
    @XmlEnumValue("Instruction")
    INSTRUCTION("Instruction"),
    @XmlEnumValue("Information")
    INFORMATION("Information"),
    @XmlEnumValue("PartialCancel")
    PARTIAL_CANCEL("PartialCancel"),
    @XmlEnumValue("PartialComplete")
    PARTIAL_COMPLETE("PartialComplete"),
    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Request")
    REQUEST("Request"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Subtract")
    SUBTRACT("Subtract"),
    @XmlEnumValue("Replace")
    REPLACE("Replace");
    private final String value;

    ActionCommonDataTypeCodesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionCommonDataTypeCodesEnumeration fromValue(String v) {
        for (ActionCommonDataTypeCodesEnumeration c: ActionCommonDataTypeCodesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
