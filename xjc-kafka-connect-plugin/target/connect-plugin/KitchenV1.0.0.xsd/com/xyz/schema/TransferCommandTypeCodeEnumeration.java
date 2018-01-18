
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferCommandTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferCommandTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="CopyFromHost"/&gt;
 *     &lt;enumeration value="CopyToHost"/&gt;
 *     &lt;enumeration value="EraseFile"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferCommandTypeCodeEnumeration")
@XmlEnum
public enum TransferCommandTypeCodeEnumeration {

    @XmlEnumValue("CopyFromHost")
    COPY_FROM_HOST("CopyFromHost"),
    @XmlEnumValue("CopyToHost")
    COPY_TO_HOST("CopyToHost"),
    @XmlEnumValue("EraseFile")
    ERASE_FILE("EraseFile");
    private final String value;

    TransferCommandTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferCommandTypeCodeEnumeration fromValue(String v) {
        for (TransferCommandTypeCodeEnumeration c: TransferCommandTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
