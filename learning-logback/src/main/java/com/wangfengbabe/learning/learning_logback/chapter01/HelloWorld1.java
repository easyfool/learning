package com.wangfengbabe.learning.learning_logback.chapter01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wangfeng on 18/01/2017.
 */
public class HelloWorld1 {

  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(HelloWorld1.class);
    logger.debug("Hello World.");
  }
}
