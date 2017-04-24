package com.wangfengbabe.learning.learning_logback.chapter03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wangfeng on 18/01/2017.
 */
public class Foo {

  static final Logger logger = LoggerFactory.getLogger(Foo.class);

  public void doIt() {
    logger.debug("Did it again");
  }
}
