package com.github.jcustenborder.kafka.connect.xml;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
interface XmlTypeState extends State {
  /**
   * Xml Types
   * @return
   */
  List<String> xmlTypes();
}
