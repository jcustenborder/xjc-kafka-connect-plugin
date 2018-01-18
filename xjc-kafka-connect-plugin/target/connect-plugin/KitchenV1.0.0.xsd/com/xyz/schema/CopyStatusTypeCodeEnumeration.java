
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CopyStatusTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CopyStatusTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="InProgress"/&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="InvalidOperation"/&gt;
 *     &lt;enumeration value="InvalidSourceName"/&gt;
 *     &lt;enumeration value="InvalidDestName"/&gt;
 *     &lt;enumeration value="InvalidServerAddress"/&gt;
 *     &lt;enumeration value="DeviceBusy"/&gt;
 *     &lt;enumeration value="DeviceOpenError"/&gt;
 *     &lt;enumeration value="DeviceError"/&gt;
 *     &lt;enumeration value="DeviceNotProgrammable"/&gt;
 *     &lt;enumeration value="DeviceFull"/&gt;
 *     &lt;enumeration value="FileOpenError"/&gt;
 *     &lt;enumeration value="FileTransferError"/&gt;
 *     &lt;enumeration value="FileChecksumError"/&gt;
 *     &lt;enumeration value="NoMemory"/&gt;
 *     &lt;enumeration value="UnknownFailure"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CopyStatusTypeCodeEnumeration")
@XmlEnum
public enum CopyStatusTypeCodeEnumeration {

    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("InvalidOperation")
    INVALID_OPERATION("InvalidOperation"),
    @XmlEnumValue("InvalidSourceName")
    INVALID_SOURCE_NAME("InvalidSourceName"),
    @XmlEnumValue("InvalidDestName")
    INVALID_DEST_NAME("InvalidDestName"),
    @XmlEnumValue("InvalidServerAddress")
    INVALID_SERVER_ADDRESS("InvalidServerAddress"),
    @XmlEnumValue("DeviceBusy")
    DEVICE_BUSY("DeviceBusy"),
    @XmlEnumValue("DeviceOpenError")
    DEVICE_OPEN_ERROR("DeviceOpenError"),
    @XmlEnumValue("DeviceError")
    DEVICE_ERROR("DeviceError"),
    @XmlEnumValue("DeviceNotProgrammable")
    DEVICE_NOT_PROGRAMMABLE("DeviceNotProgrammable"),
    @XmlEnumValue("DeviceFull")
    DEVICE_FULL("DeviceFull"),
    @XmlEnumValue("FileOpenError")
    FILE_OPEN_ERROR("FileOpenError"),
    @XmlEnumValue("FileTransferError")
    FILE_TRANSFER_ERROR("FileTransferError"),
    @XmlEnumValue("FileChecksumError")
    FILE_CHECKSUM_ERROR("FileChecksumError"),
    @XmlEnumValue("NoMemory")
    NO_MEMORY("NoMemory"),
    @XmlEnumValue("UnknownFailure")
    UNKNOWN_FAILURE("UnknownFailure");
    private final String value;

    CopyStatusTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CopyStatusTypeCodeEnumeration fromValue(String v) {
        for (CopyStatusTypeCodeEnumeration c: CopyStatusTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
