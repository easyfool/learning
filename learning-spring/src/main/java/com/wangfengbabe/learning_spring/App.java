package com.wangfengbabe.learning_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 17/02/2017.
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring/ApplicationContext.xml");
    CustomerService service = (CustomerService) context.getBean("customerServiceProxy");
    System.out.println();
    service.printName();
    System.out.println();
    service.printUrl();
    System.out.println();
    try {
      service.printThrowException();
    } catch (Exception e) {
      System.out.println("exception throwed");
    }

    CustomerBo customerBo = (CustomerBo) context.getBean("customerBo");
    customerBo.addCustomer();
  }
}
