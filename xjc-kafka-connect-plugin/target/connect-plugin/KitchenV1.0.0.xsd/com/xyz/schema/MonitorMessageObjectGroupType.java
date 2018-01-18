
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * Entry into notify message table
 * 
 * <p>Java class for MonitorMessageObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitorMessageObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMMessagesType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitorMessageObjectGroupType")
public class MonitorMessageObjectGroupType
    extends NAFEMMessagesType
    implements Connectable
{

    public final static Schema CONNECT_SCHEMA;

    static MonitorMessageObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MonitorMessageObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        CONNECT_SCHEMA = builder.build();
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        return struct;
    }

}
