package com.wangfengbabe.learning_spring.aop.simple;

import com.wangfengbabe.learning_spring.aop.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 09/03/2017.
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "classpath:spring/aop/simple/spring-aop-simple.xml");
    CustomerService service = (CustomerService) context.getBean("customerServiceProxy");
    System.out.println("*************");
    service.printName();
    System.out.println("*************");
    service.printURL();
    System.out.println("*************");
    try {
      service.printThrowException();
    } catch (Exception e) {

    }
  }

}
