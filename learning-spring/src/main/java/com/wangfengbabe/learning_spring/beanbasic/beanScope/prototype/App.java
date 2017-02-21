package com.wangfengbabe.learning_spring.beanbasic.beanScope.prototype;

import com.wangfengbabe.learning_spring.beanbasic.beanScope.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 20/02/2017.
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "classpath:spring/beanbasic/beanScope/prototype/applicationContext.xml");
    Customer customer1 = (Customer) context.getBean("customer");
    customer1.setMessage("hello world");
    Customer customer2 = (Customer) context.getBean("customer");
    System.out.println(customer2.getMessage());//null
    System.out.println(customer1 == customer2);//false  prototype

  }
}
