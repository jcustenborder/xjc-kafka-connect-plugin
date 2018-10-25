package com.github.jcustenborder.kafka.connect.xml;

import com.sun.codemodel.JType;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
interface DefinedTypeState extends State {
  JType type();
}
