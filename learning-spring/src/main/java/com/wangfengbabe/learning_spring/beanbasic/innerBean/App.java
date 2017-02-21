package com.wangfengbabe.learning_spring.beanbasic.innerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 20/02/2017.
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "classpath:spring/beanbasic/innerbean/applicationContext.xml");
    Customer customer = (Customer) context.getBean("customer");
    System.out.println(customer.getPerson().getName());
    System.out.println(customer.getPerson().getAge());

    Person person = (Person) context.getBean("person");
    //can not be accessible
//    System.out.println(person.getName());

  }
}
