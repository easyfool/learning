package com.wangfengbabe.learning.multiThread.differentLogFileForEachThread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * Created by wangfeng on 14/03/2017.
 */
public class Head implements Runnable {

  static Logger logger = LoggerFactory.getLogger(Head.class);
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    MDC.put("logFileName", getName());
    logger.debug("hello");
    MDC.remove("logFileName");
  }
}
