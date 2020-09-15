/**
 * Copyright © 2017 Jeremy Custenborder (jcustenborder@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jcustenborder.kafka.connect.xml;

import com.google.common.io.PatternFilenameFilter;
import com.sun.codemodel.CodeWriter;
import com.sun.codemodel.JAnnotationUse;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JPackage;
import com.sun.codemodel.writer.SingleStreamCodeWriter;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.Plugin;
import com.sun.tools.xjc.api.S2JJAXBModel;
import com.sun.tools.xjc.api.SchemaCompiler;
import com.sun.tools.xjc.api.XJC;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;


public class KafkaConnectPluginTest {
  private static final Logger log = LoggerFactory.getLogger(KafkaConnectPluginTest.class);

  private final File outputDirectoryRoot = new File("target/connect-plugin");
  private final File inputDirectory = new File("src/test/resources/com/github/jcustenborder/kafka/connect/xml");


  static void compile(InputSource is, File outputDirectory, Plugin plugin, File... bindingFiles) throws IOException {
    if (!outputDirectory.isDirectory()) {
      assertTrue(
          outputDirectory.mkdirs(),
          String.format("Directory %s should have been created.", outputDirectory)
      );
    }
    System.setProperty("javax.xml.accessExternalSchema", "all");
    SchemaCompiler sc = XJC.createSchemaCompiler();
    Options options = sc.getOptions();
    if (null != plugin) {
      log.info("compile() - adding activePlugins {}", plugin);
      options.activePlugins.addAll(Arrays.asList(plugin));
    }
    for (File bindingFile : bindingFiles) {
      options.addBindFile(bindingFile);
    }
    options.automaticNameConflictResolution = true;
    sc.forcePackageName("com.xyz.schema");
    sc.parseSchema(is);
    ConnectErrorListener errorListener = new ConnectErrorListener();
    sc.setErrorListener(errorListener);
    log.info("compile() - Binding model for {}", is);
    S2JJAXBModel model = sc.bind();
    assertFalse(errorListener.hasExceptions(), "There should be no exceptions.");
    assertNotNull(model, "model could not be generated.");

    log.info("compile() - Generating code to {}", outputDirectory);
    JCodeModel jCodeModel = model.generateCode(null, errorListener);
    jCodeModel.build(outputDirectory);
  }

  void test(File schemaFile, boolean ignoreAnyType) throws IOException {
    InputSource is = new InputSource(schemaFile.toURI().toString());
    File outputDirectory = new File(outputDirectoryRoot, schemaFile.getName());
    test(is, outputDirectory, ignoreAnyType);
  }


  void test(InputSource is, File outputDirectory, boolean ignoreAnyType, File... bindingFiles) throws IOException {
    File beforeDirectory = new File(outputDirectory, "before");
    compile(is, beforeDirectory, null, bindingFiles);
    File afterDirectory = new File(outputDirectory, "after");
    KafkaConnectPlugin plugin = new KafkaConnectPlugin();
    plugin.setIgnoreAnyTypeFields(ignoreAnyType);
    compile(is, afterDirectory, plugin, bindingFiles);
  }

  @Test
  public void ignoreAnyType() throws IOException {
    File input = new File("src/test/resources/com/github/jcustenborder/kafka/connect/xml/other/anyType.xsd");
    test(input, true);
  }

  @Disabled
  @Test
  public void DATEXIISchema_1_0_1_0() throws IOException {
    File outputDirectory = new File(this.outputDirectoryRoot, "DATEXIISchema_1_0_1_0.xsd");
    InputSource is = new InputSource("https://datex2.eu/schema/1_0/1_0/DATEXIISchema_1_0_1_0.xsd");
    File bindingFile = new File("src/test/resources/com/github/jcustenborder/kafka/connect/xml/DATEXIISchema_1_0_1_0.xjb");
    test(is, outputDirectory, true, bindingFile);
  }

  @Disabled
  @TestFactory
  public Stream<DynamicTest> build() throws IOException {
    File[] inputFiles = Objects.requireNonNull(inputDirectory.listFiles(new PatternFilenameFilter("^.+\\.xsd$")));

    return Arrays.stream(inputFiles)
        .map(file -> dynamicTest(file.getName(), () -> {
          test(file, false);
        }));
  }

  @TestFactory
  public Stream<DynamicTest> targetsEnum() throws Exception {

    JCodeModel codeModel = new JCodeModel();
    JPackage codePackage = codeModel._package("example");
    JClass listClass = codeModel.ref(List.class);

    JDefinedClass enumType = codePackage._enum("VehicleTypeEnum");
    enumType.annotate(XmlEnum.class);
    enumType.annotate(XmlType.class).param("name", "VehicleTypeEnum");
    enumType.enumConstant("ONE");
    JDefinedClass definedClass = codePackage._class("TestClass");
    JFieldVar singleEnumField = definedClass.field(JMod.PROTECTED, enumType, "vehicleType");
    JFieldVar listOfEnum = definedClass.field(JMod.PROTECTED, listClass.narrow(enumType), "vehicleTypes");
    JAnnotationUse fieldAnnotation = singleEnumField.annotate(XmlSchemaType.class);
    fieldAnnotation.param("name", "string");

    String code;
    try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
      CodeWriter writer = new SingleStreamCodeWriter(outputStream);
      codeModel.build(writer);
      code = new String(outputStream.toByteArray(), StandardCharsets.UTF_8);
    }
    log.info("code:\n{}", code);
    KafkaConnectPlugin plugin = new KafkaConnectPlugin();
    plugin.setupImportedClasses(codeModel);

    return definedClass.fields().entrySet()
        .stream()
        .map(e-> dynamicTest(e.getKey(), ()-> {
          assertTrue(plugin.targetsEnum(e.getValue()), String.format("%s should be true", e.getKey()));
        }));
  }


  @Test
  public void singleEnum() throws JClassAlreadyExistsException, IOException {
    JCodeModel codeModel = new JCodeModel();
    JPackage codePackage = codeModel._package("example");

    JDefinedClass enumType = codePackage._enum("VehicleTypeEnum");
    enumType.annotate(XmlEnum.class);
    enumType.annotate(XmlType.class).param("name", "VehicleTypeEnum");
    enumType.enumConstant("ONE");
    JDefinedClass definedClass = codePackage._class("TestClass");
    JFieldVar definedField = definedClass.field(JMod.PROTECTED, enumType, "vehicleType");
    JAnnotationUse fieldAnnotation = definedField.annotate(XmlSchemaType.class);
    fieldAnnotation.param("name", "string");

    String code;
    try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
      CodeWriter writer = new SingleStreamCodeWriter(outputStream);
      codeModel.build(writer);
      code = new String(outputStream.toByteArray(), StandardCharsets.UTF_8);
    }
    log.info("code:\n{}", code);
    KafkaConnectPlugin plugin = new KafkaConnectPlugin();
    plugin.setupImportedClasses(codeModel);
    FieldState fieldState = plugin.field(definedClass, definedField.name(), definedField);
    log.info("fieldState = {}", fieldState);
    assertEquals("fromEnum", fieldState.readMethod());
    assertEquals("toEnum", fieldState.writeMethod());
  }

  @Test
  public void listOfEnums() throws JClassAlreadyExistsException, IOException {
//    @XmlSchemaType(name = "string")
//    protected List<VehicleTypeEnum> vehicleType;

    JCodeModel codeModel = new JCodeModel();
    JClass listClass = codeModel.ref(List.class);
    JPackage codePackage = codeModel._package("example");

    JDefinedClass enumType = codePackage._enum("VehicleTypeEnum");
    enumType.annotate(XmlEnum.class);
    enumType.annotate(XmlType.class).param("name", "VehicleTypeEnum");
    enumType.enumConstant("ONE");
    JClass listOfVehicleTypeEnum = listClass.narrow(enumType);

    JDefinedClass definedClass = codePackage._class("TestClass");
    JFieldVar definedField = definedClass.field(JMod.PROTECTED, listOfVehicleTypeEnum, "vehicleType");
    JAnnotationUse fieldAnnotation = definedField.annotate(XmlSchemaType.class);
    fieldAnnotation.param("name", "string");

    String code;
    try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
      CodeWriter writer = new SingleStreamCodeWriter(outputStream);
      codeModel.build(writer);
      code = new String(outputStream.toByteArray(), StandardCharsets.UTF_8);
    }
    log.info("code:\n{}", code);
    KafkaConnectPlugin plugin = new KafkaConnectPlugin();
    plugin.setupImportedClasses(codeModel);
    FieldState fieldState = plugin.field(definedClass, definedField.name(), definedField);
    log.info("fieldState = {}", fieldState);
    assertEquals("fromEnums", fieldState.readMethod());
    assertEquals("toEnums", fieldState.writeMethod());

//    plugin.
//    ClassOutline classOutline = codeModel.getClasses()


//    ClassOutline classOutline = new
//    plugin.field()


  }


}
