package com.github.jcustenborder.kafka.connect.xml;

import com.sun.codemodel.JExpression;
import com.sun.codemodel.JFieldVar;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
interface FieldState extends State {
  /**
   * Name of the field in the xml document.
   * @return
   */
  String name();

  /**
   * The field in the generated code.
   * @return
   */
  JFieldVar fieldVar();

  /**
   * Flag to determine if the field is required.
   * @return
   */
  boolean required();

  /**
   * Additional arguments that are passed to the read method.
   * @return
   */
  List<JExpression> readMethodArgs();
}
