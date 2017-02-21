package com.wangfengbabe.learning_spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 20/02/2017.
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/helloworld/helloworld.xml");
    HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
    helloWorld.printHello();
  }
}
