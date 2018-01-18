
package com.xyz.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemIDTypeCodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemIDTypeCodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="GTIN"/&gt;
 *     &lt;enumeration value="PLU"/&gt;
 *     &lt;enumeration value="SKU"/&gt;
 *     &lt;enumeration value="ItemID"/&gt;
 *     &lt;enumeration value="ISBN"/&gt;
 *     &lt;enumeration value="ISSN"/&gt;
 *     &lt;enumeration value="EPC"/&gt;
 *     &lt;enumeration value="TUC"/&gt;
 *     &lt;enumeration value="POSDepartment"/&gt;
 *     &lt;enumeration value="RFID"/&gt;
 *     &lt;enumeration value="UPC"/&gt;
 *     &lt;enumeration value="MUZEID"/&gt;
 *     &lt;enumeration value="AMGID"/&gt;
 *     &lt;enumeration value="MenuID"/&gt;
 *     &lt;enumeration value="UPC-A"/&gt;
 *     &lt;enumeration value="UPC-AWithSupplementalBarcode"/&gt;
 *     &lt;enumeration value="UPC-E"/&gt;
 *     &lt;enumeration value="UPC-EWithSupplementalBarcode"/&gt;
 *     &lt;enumeration value="UPC-D1"/&gt;
 *     &lt;enumeration value="UPC-D2"/&gt;
 *     &lt;enumeration value="UPC-D3"/&gt;
 *     &lt;enumeration value="UPC-D4"/&gt;
 *     &lt;enumeration value="UPC-D5"/&gt;
 *     &lt;enumeration value="EAN8"/&gt;
 *     &lt;enumeration value="JAN8"/&gt;
 *     &lt;enumeration value="EAN8WithSupplementalBarcode"/&gt;
 *     &lt;enumeration value="EAN13"/&gt;
 *     &lt;enumeration value="JAN13"/&gt;
 *     &lt;enumeration value="EAN13WithSupplementalBarcode"/&gt;
 *     &lt;enumeration value="EAN-128"/&gt;
 *     &lt;enumeration value="Standard2Of5"/&gt;
 *     &lt;enumeration value="Interleaved2Of5"/&gt;
 *     &lt;enumeration value="Codabar"/&gt;
 *     &lt;enumeration value="Code39"/&gt;
 *     &lt;enumeration value="Code93"/&gt;
 *     &lt;enumeration value="Code128"/&gt;
 *     &lt;enumeration value="OCRA"/&gt;
 *     &lt;enumeration value="OCRB"/&gt;
 *     &lt;enumeration value="PDF417"/&gt;
 *     &lt;enumeration value="MAXICODE"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemIDTypeCodeEnumeration")
@XmlEnum
public enum ItemIDTypeCodeEnumeration {

    GTIN("GTIN"),
    PLU("PLU"),
    SKU("SKU"),
    @XmlEnumValue("ItemID")
    ITEM_ID("ItemID"),
    ISBN("ISBN"),
    ISSN("ISSN"),
    EPC("EPC"),
    TUC("TUC"),
    @XmlEnumValue("POSDepartment")
    POS_DEPARTMENT("POSDepartment"),
    RFID("RFID"),
    UPC("UPC"),
    MUZEID("MUZEID"),
    AMGID("AMGID"),
    @XmlEnumValue("MenuID")
    MENU_ID("MenuID"),
    @XmlEnumValue("UPC-A")
    UPC_A("UPC-A"),
    @XmlEnumValue("UPC-AWithSupplementalBarcode")
    UPC_A_WITH_SUPPLEMENTAL_BARCODE("UPC-AWithSupplementalBarcode"),
    @XmlEnumValue("UPC-E")
    UPC_E("UPC-E"),
    @XmlEnumValue("UPC-EWithSupplementalBarcode")
    UPC_E_WITH_SUPPLEMENTAL_BARCODE("UPC-EWithSupplementalBarcode"),
    @XmlEnumValue("UPC-D1")
    UPC_D_1("UPC-D1"),
    @XmlEnumValue("UPC-D2")
    UPC_D_2("UPC-D2"),
    @XmlEnumValue("UPC-D3")
    UPC_D_3("UPC-D3"),
    @XmlEnumValue("UPC-D4")
    UPC_D_4("UPC-D4"),
    @XmlEnumValue("UPC-D5")
    UPC_D_5("UPC-D5"),
    @XmlEnumValue("EAN8")
    EAN_8("EAN8"),
    @XmlEnumValue("JAN8")
    JAN_8("JAN8"),
    @XmlEnumValue("EAN8WithSupplementalBarcode")
    EAN_8_WITH_SUPPLEMENTAL_BARCODE("EAN8WithSupplementalBarcode"),
    @XmlEnumValue("EAN13")
    EAN_13("EAN13"),
    @XmlEnumValue("JAN13")
    JAN_13("JAN13"),
    @XmlEnumValue("EAN13WithSupplementalBarcode")
    EAN_13_WITH_SUPPLEMENTAL_BARCODE("EAN13WithSupplementalBarcode"),
    @XmlEnumValue("EAN-128")
    EAN_128("EAN-128"),
    @XmlEnumValue("Standard2Of5")
    STANDARD_2_OF_5("Standard2Of5"),
    @XmlEnumValue("Interleaved2Of5")
    INTERLEAVED_2_OF_5("Interleaved2Of5"),
    @XmlEnumValue("Codabar")
    CODABAR("Codabar"),
    @XmlEnumValue("Code39")
    CODE_39("Code39"),
    @XmlEnumValue("Code93")
    CODE_93("Code93"),
    @XmlEnumValue("Code128")
    CODE_128("Code128"),
    OCRA("OCRA"),
    OCRB("OCRB"),
    @XmlEnumValue("PDF417")
    PDF_417("PDF417"),
    MAXICODE("MAXICODE"),
    OTHER("OTHER"),
    UNKNOWN("UNKNOWN");
    private final String value;

    ItemIDTypeCodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemIDTypeCodeEnumeration fromValue(String v) {
        for (ItemIDTypeCodeEnumeration c: ItemIDTypeCodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
