package com.wangfengbabe.learning_spring.springDI.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 20/02/2017.
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/springDI/applicationContext.xml");
    Person person = (Person) context.getBean("person");
    System.out.println(person.getName() + " aged " + person.getAge());
  }
}
