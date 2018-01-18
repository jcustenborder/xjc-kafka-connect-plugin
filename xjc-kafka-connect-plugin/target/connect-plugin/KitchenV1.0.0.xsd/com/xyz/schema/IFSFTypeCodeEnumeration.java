
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IFSFTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IFSFTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Autosafe"/&gt;
 *     &lt;enumeration value="BankNoteAcceptor"/&gt;
 *     &lt;enumeration value="CarWash"/&gt;
 *     &lt;enumeration value="CardHandling"/&gt;
 *     &lt;enumeration value="CodeGeneratingDevice"/&gt;
 *     &lt;enumeration value="COPT"/&gt;
 *     &lt;enumeration value="DeliveryControl"/&gt;
 *     &lt;enumeration value="Dispenser"/&gt;
 *     &lt;enumeration value="EnvironmentalMonitor"/&gt;
 *     &lt;enumeration value="ForecourtPinPad"/&gt;
 *     &lt;enumeration value="ForecourtPrinter"/&gt;
 *     &lt;enumeration value="ForecourtPricePole"/&gt;
 *     &lt;enumeration value="HumanInterfaceDevice"/&gt;
 *     &lt;enumeration value="LineLeakDetector"/&gt;
 *     &lt;enumeration value="MagCardReader"/&gt;
 *     &lt;enumeration value="TankLevelGauge"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IFSFTypeCodeEnumeration")
@XmlEnum
public enum IFSFTypeCodeEnumeration {

    @XmlEnumValue("Autosafe")
    AUTOSAFE("Autosafe"),
    @XmlEnumValue("BankNoteAcceptor")
    BANK_NOTE_ACCEPTOR("BankNoteAcceptor"),
    @XmlEnumValue("CarWash")
    CAR_WASH("CarWash"),
    @XmlEnumValue("CardHandling")
    CARD_HANDLING("CardHandling"),
    @XmlEnumValue("CodeGeneratingDevice")
    CODE_GENERATING_DEVICE("CodeGeneratingDevice"),
    COPT("COPT"),
    @XmlEnumValue("DeliveryControl")
    DELIVERY_CONTROL("DeliveryControl"),
    @XmlEnumValue("Dispenser")
    DISPENSER("Dispenser"),
    @XmlEnumValue("EnvironmentalMonitor")
    ENVIRONMENTAL_MONITOR("EnvironmentalMonitor"),
    @XmlEnumValue("ForecourtPinPad")
    FORECOURT_PIN_PAD("ForecourtPinPad"),
    @XmlEnumValue("ForecourtPrinter")
    FORECOURT_PRINTER("ForecourtPrinter"),
    @XmlEnumValue("ForecourtPricePole")
    FORECOURT_PRICE_POLE("ForecourtPricePole"),
    @XmlEnumValue("HumanInterfaceDevice")
    HUMAN_INTERFACE_DEVICE("HumanInterfaceDevice"),
    @XmlEnumValue("LineLeakDetector")
    LINE_LEAK_DETECTOR("LineLeakDetector"),
    @XmlEnumValue("MagCardReader")
    MAG_CARD_READER("MagCardReader"),
    @XmlEnumValue("TankLevelGauge")
    TANK_LEVEL_GAUGE("TankLevelGauge");
    private final String value;

    IFSFTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IFSFTypeCodeEnumeration fromValue(String v) {
        for (IFSFTypeCodeEnumeration c: IFSFTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
