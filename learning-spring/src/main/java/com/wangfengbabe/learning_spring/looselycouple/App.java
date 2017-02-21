package com.wangfengbabe.learning_spring.looselycouple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 20/02/2017.
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "classpath:spring/looselycouple/applicationContext.xml");
    OutputHelper outputHelper = (OutputHelper) context.getBean("outputHelper");
    outputHelper.generateOutput();
  }

}
