
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnifiedPOSTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnifiedPOSTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Biometrics"/&gt;
 *     &lt;enumeration value="BumpBar"/&gt;
 *     &lt;enumeration value="CashChanger"/&gt;
 *     &lt;enumeration value="CashDrawer"/&gt;
 *     &lt;enumeration value="CheckScanner"/&gt;
 *     &lt;enumeration value="CoinDispenser"/&gt;
 *     &lt;enumeration value="CreditAuthorizationTerminal"/&gt;
 *     &lt;enumeration value="ElectronicJournal"/&gt;
 *     &lt;enumeration value="FiscalPrinter"/&gt;
 *     &lt;enumeration value="HardTotals"/&gt;
 *     &lt;enumeration value="Keylock"/&gt;
 *     &lt;enumeration value="LineDisplay"/&gt;
 *     &lt;enumeration value="MagneticStripeReader"/&gt;
 *     &lt;enumeration value="MICRR"/&gt;
 *     &lt;enumeration value="MotionSensor"/&gt;
 *     &lt;enumeration value="PinPad"/&gt;
 *     &lt;enumeration value="PointcardReaderWriter"/&gt;
 *     &lt;enumeration value="POSKeyboard"/&gt;
 *     &lt;enumeration value="POSPower"/&gt;
 *     &lt;enumeration value="POSPrinter"/&gt;
 *     &lt;enumeration value="RemoteOrderDisplay"/&gt;
 *     &lt;enumeration value="Scale"/&gt;
 *     &lt;enumeration value="Scanner"/&gt;
 *     &lt;enumeration value="SignatureCapture"/&gt;
 *     &lt;enumeration value="SmartCardReader"/&gt;
 *     &lt;enumeration value="ToneIndicator"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnifiedPOSTypeCodeEnumeration")
@XmlEnum
public enum UnifiedPOSTypeCodeEnumeration {

    @XmlEnumValue("Biometrics")
    BIOMETRICS("Biometrics"),
    @XmlEnumValue("BumpBar")
    BUMP_BAR("BumpBar"),
    @XmlEnumValue("CashChanger")
    CASH_CHANGER("CashChanger"),
    @XmlEnumValue("CashDrawer")
    CASH_DRAWER("CashDrawer"),
    @XmlEnumValue("CheckScanner")
    CHECK_SCANNER("CheckScanner"),
    @XmlEnumValue("CoinDispenser")
    COIN_DISPENSER("CoinDispenser"),
    @XmlEnumValue("CreditAuthorizationTerminal")
    CREDIT_AUTHORIZATION_TERMINAL("CreditAuthorizationTerminal"),
    @XmlEnumValue("ElectronicJournal")
    ELECTRONIC_JOURNAL("ElectronicJournal"),
    @XmlEnumValue("FiscalPrinter")
    FISCAL_PRINTER("FiscalPrinter"),
    @XmlEnumValue("HardTotals")
    HARD_TOTALS("HardTotals"),
    @XmlEnumValue("Keylock")
    KEYLOCK("Keylock"),
    @XmlEnumValue("LineDisplay")
    LINE_DISPLAY("LineDisplay"),
    @XmlEnumValue("MagneticStripeReader")
    MAGNETIC_STRIPE_READER("MagneticStripeReader"),
    MICRR("MICRR"),
    @XmlEnumValue("MotionSensor")
    MOTION_SENSOR("MotionSensor"),
    @XmlEnumValue("PinPad")
    PIN_PAD("PinPad"),
    @XmlEnumValue("PointcardReaderWriter")
    POINTCARD_READER_WRITER("PointcardReaderWriter"),
    @XmlEnumValue("POSKeyboard")
    POS_KEYBOARD("POSKeyboard"),
    @XmlEnumValue("POSPower")
    POS_POWER("POSPower"),
    @XmlEnumValue("POSPrinter")
    POS_PRINTER("POSPrinter"),
    @XmlEnumValue("RemoteOrderDisplay")
    REMOTE_ORDER_DISPLAY("RemoteOrderDisplay"),
    @XmlEnumValue("Scale")
    SCALE("Scale"),
    @XmlEnumValue("Scanner")
    SCANNER("Scanner"),
    @XmlEnumValue("SignatureCapture")
    SIGNATURE_CAPTURE("SignatureCapture"),
    @XmlEnumValue("SmartCardReader")
    SMART_CARD_READER("SmartCardReader"),
    @XmlEnumValue("ToneIndicator")
    TONE_INDICATOR("ToneIndicator");
    private final String value;

    UnifiedPOSTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnifiedPOSTypeCodeEnumeration fromValue(String v) {
        for (UnifiedPOSTypeCodeEnumeration c: UnifiedPOSTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
