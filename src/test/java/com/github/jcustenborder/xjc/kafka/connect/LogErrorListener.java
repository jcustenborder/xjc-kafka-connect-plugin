package com.github.jcustenborder.xjc.kafka.connect;

import org.slf4j.Logger;
import org.xml.sax.SAXParseException;

class LogErrorListener implements com.sun.tools.xjc.api.ErrorListener {
  final Logger log;

  LogErrorListener(Logger log) {
    this.log = log;
  }

  @Override
  public void error(SAXParseException e) {
    log.error("error", e);
  }

  @Override
  public void fatalError(SAXParseException e) {
    log.error("fatalError", e);
  }

  @Override
  public void warning(SAXParseException e) {
    log.warn("warning", e);
  }

  @Override
  public void info(SAXParseException e) {
    log.info("info", e);
  }
}
