package com.wangfengbabe.learning_spring.beanbasic.collectionProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 21/02/2017.
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "classpath:spring/beanbasic/collectionProperties/applicationContext.xml");
    Garden garden = (Garden) context.getBean("garden");
    System.out.println(garden.getLists());
  }

}
