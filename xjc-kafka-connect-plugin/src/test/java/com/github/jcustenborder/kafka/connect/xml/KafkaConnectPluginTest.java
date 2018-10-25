/**
 * Copyright © 2017 Jeremy Custenborder (jcustenborder@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jcustenborder.kafka.connect.xml;

import com.google.common.collect.ImmutableSet;
import com.google.common.io.PatternFilenameFilter;
import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.api.ErrorListener;
import com.sun.tools.xjc.api.S2JJAXBModel;
import com.sun.tools.xjc.api.SchemaCompiler;
import com.sun.tools.xjc.api.XJC;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;


public class KafkaConnectPluginTest implements ErrorListener {
  private static final Logger log = LoggerFactory.getLogger(KafkaConnectPluginTest.class);

  final File outputDirectoryRoot = new File("target/connect-plugin");
  final File inputDirectory = new File("src/test/resources/com/github/jcustenborder/kafka/connect/xml");

  List<SAXParseException> exceptions;

  @BeforeEach
  public void beforeEach() {
    this.exceptions = new ArrayList<>();
  }


  @Test
  public void simpleTypes() throws IOException {
    test(new File(inputDirectory, "simpleTypes.xsd"));
  }

  @Test
  public void books() throws IOException {
    test(new File(inputDirectory, "books.xsd"));
  }

  @Test
  public void cdlist() throws IOException {
    test(new File(inputDirectory, "cd-list.xsd"));
  }

  @Test
  public void inventory() throws IOException {
    test(new File(inputDirectory, "InventoryV2.0.0.xsd"));
  }

  @Test
  public void kitchen() throws IOException {
    test(new File(inputDirectory, "KitchenV1.0.0.xsd"));
  }

  @Test
  public void recipe() throws IOException {
    test(new File(inputDirectory, "recipe.xsd"));
  }

  @Test
  public void shiporder() throws IOException {
    test(new File(inputDirectory, "shiporder.xsd"));
  }

  @Disabled
  @Test
  public void niem() throws IOException {
//    https://release.niem.gov/niem/niem-core/4.0/niem-core.xsd
    InputSource inputSource = new InputSource("https://release.niem.gov/niem/niem-core/4.0/niem-core.xsd");

    File outputDirectory = new File(outputDirectoryRoot, "niem-core.xsd");
    test(inputSource, outputDirectory);
  }


  void test(File schemaFile) throws IOException {
    InputSource is = new InputSource(schemaFile.toURI().toString());
    File outputDirectory = new File(outputDirectoryRoot, schemaFile.getName());
    outputDirectory.mkdirs();
    test(is, outputDirectory);
  }


  void test(InputSource is, File outputDirectory) throws IOException {
    // Setup schema compiler
    System.setProperty("javax.xml.accessExternalSchema", "all");
    SchemaCompiler sc = XJC.createSchemaCompiler();
    Options options = sc.getOptions();
//    options
    InputStream stream = this.getClass().getResourceAsStream("binding.xml");
    InputSource source = new InputSource(stream);

    source.setSystemId("binding");
    options.addBindFile(source);


    options.activePlugins.add(new KafkaConnectPlugin());
    sc.forcePackageName("com.xyz.schema");

    sc.parseSchema(is);
    sc.setErrorListener(this);
    S2JJAXBModel model = sc.bind();
    assertTrue(exceptions.isEmpty(), "There should be no exceptions.");

    JCodeModel jCodeModel = model.generateCode(null, null);
    jCodeModel.build(outputDirectory);
  }

  @Disabled
  @TestFactory
  public Stream<DynamicTest> build() throws IOException {


    final Set<String> skip = ImmutableSet.of(
        "KitchenV1.0.0.xsd",
        "simpleTypes.xsd"
    );
    return Arrays.stream(inputDirectory.listFiles(new PatternFilenameFilter("^.+\\.xsd$")))
        .map(schemaFile -> dynamicTest(schemaFile.getName(), () -> {
          test(schemaFile);
        }));
  }

  @Override
  public void error(SAXParseException e) {
    log.error("error", e);
    exceptions.add(e);
  }

  @Override
  public void fatalError(SAXParseException e) {
    log.error("fatalError", e);
    exceptions.add(e);
  }

  @Override
  public void warning(SAXParseException e) {
    log.warn("warning", e);
  }

  @Override
  public void info(SAXParseException e) {
    log.warn("info", e);
  }
}
