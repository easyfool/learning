package com.wangfengbabe.learning_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 17/02/2017.
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-beans.xml");
    HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
    helloWorld.sayHello();
  }
}
