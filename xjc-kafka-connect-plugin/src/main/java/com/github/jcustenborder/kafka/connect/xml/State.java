package com.github.jcustenborder.kafka.connect.xml;

import com.sun.codemodel.JExpression;

import java.util.List;

interface State {
  /**
   * Reference to a schema for this type. For example Schema.STRING
   *
   * @return
   */
  @Nullable
  JExpression schema();

  /**
   * Expression used to build an instance of the schema for this type.
   *
   * @return
   */
  JExpression schemaBuilder();

  /**
   * Method that is used to write data to the struct.
   *
   * @return
   */
  String readMethod();

  /**
   * Additional arguments that are passed to the read method.
   *
   * @return
   */
  List<JExpression> readMethodArgs();

  /**
   *
   * @return
   */
  String writeMethod();

  /**
   *
   * @return
   */
  List<JExpression> writeMethodArgs();
}
