
package com.xyz.schema;

import org.apache.kafka.connect.data.Struct;

public interface Connectable {


    Struct toConnectStruct();

}
