
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * Table of associated acknowledgement feature attributes to the
 *                 notification message. This table is used when the system requires a response from a
 *                 manager when a trap is sent
 * 
 * <p>Java class for InventoryAcknowledgementObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryAcknowledgementObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMAcknowledgementType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryAcknowledgementObjectGroupType")
public class InventoryAcknowledgementObjectGroupType
    extends NAFEMAcknowledgementType
    implements Connectable
{

    public final static Schema CONNECT_SCHEMA;

    static InventoryAcknowledgementObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.InventoryAcknowledgementObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        CONNECT_SCHEMA = builder.build();
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        return struct;
    }

}
