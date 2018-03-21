package com.github.jcustenborder.kafka.connect.xml;

import org.apache.kafka.connect.data.Struct;

public interface Connectable {
  Struct toConnectStruct();
}
