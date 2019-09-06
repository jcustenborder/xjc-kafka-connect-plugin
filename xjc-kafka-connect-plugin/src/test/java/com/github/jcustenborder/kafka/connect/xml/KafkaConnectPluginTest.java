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

import com.google.common.base.Joiner;
import com.google.common.io.PatternFilenameFilter;
import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.Plugin;
import com.sun.tools.xjc.api.S2JJAXBModel;
import com.sun.tools.xjc.api.SchemaCompiler;
import com.sun.tools.xjc.api.XJC;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;


public class KafkaConnectPluginTest {
  private static final Logger log = LoggerFactory.getLogger(KafkaConnectPluginTest.class);

  private final File outputDirectoryRoot = new File("target/connect-plugin");
  private final File inputDirectory = new File("src/test/resources/com/github/jcustenborder/kafka/connect/xml");

  static void compile(InputSource is, File outputDirectory, Plugin... plugins) throws IOException {
    if (!outputDirectory.isDirectory()) {
      assertTrue(
          outputDirectory.mkdirs(),
          String.format("Directory %s should have been created.", outputDirectory)
      );
    }
    System.setProperty("javax.xml.accessExternalSchema", "all");
    SchemaCompiler sc = XJC.createSchemaCompiler();
    Options options = sc.getOptions();
    if (plugins.length > 0) {
      log.info("compile() - adding activePlugins {}",
          Joiner.on(", ").join(
              Arrays.stream(plugins)
                  .map(plugin -> plugin.getClass().getSimpleName())
                  .collect(Collectors.toList())
          )
      );
      options.activePlugins.addAll(Arrays.asList(plugins));
    }

    sc.forcePackageName("com.xyz.schema");
    sc.parseSchema(is);
    ConnectErrorListener errorListener = new ConnectErrorListener();
    sc.setErrorListener(errorListener);
    S2JJAXBModel model = sc.bind();
    assertFalse(errorListener.hasExceptions(), "There should be no exceptions.");
    assertNotNull(model, "model could not be generated.");

    log.info("compile() - Generating code to {}", outputDirectory);
    JCodeModel jCodeModel = model.generateCode(null, null);
    jCodeModel.build(outputDirectory);
  }

  void test(File schemaFile) throws IOException {
    InputSource is = new InputSource(schemaFile.toURI().toString());
    File outputDirectory = new File(outputDirectoryRoot, schemaFile.getName());
    test(is, outputDirectory);
  }

  void test(InputSource is, File outputDirectory) throws IOException {
    File beforeDirectory = new File(outputDirectory, "before");
    compile(is, beforeDirectory);
    File afterDirectory = new File(outputDirectory, "after");
    compile(is, afterDirectory, new KafkaConnectPlugin());
  }

  @TestFactory
  public Stream<DynamicTest> build() throws IOException {
    return Arrays.stream(inputDirectory.listFiles(new PatternFilenameFilter("^.+\\.xsd$")))
        .map(schemaFile -> dynamicTest(schemaFile.getName(), () -> {
          test(schemaFile);
        }));
  }
}
