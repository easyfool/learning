package com.wangfengbabe.learning_spring.beanbasic.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 20/02/2017.
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "classpath:spring/beanbasic/factoryBean/applicationContext.xml");
    //java.util.list
    CustomerList customerList1 = (CustomerList) context.getBean("customerList1");
    System.out.println(customerList1.getList());
    CustomerList customerList2 = (CustomerList) context.getBean("customerList2");
    System.out.println(customerList2.getList());

    //java.util.set
    CustomerSet customerSet1 = (CustomerSet) context.getBean("customerSet1");
    System.out.println(customerSet1.getSet());
    CustomerSet customerSet2 = (CustomerSet) context.getBean("customerSet2");
    System.out.println(customerSet2.getSet());

//java.util.map
    CustomerMap customerMap1 = (CustomerMap) context.getBean("customerMap1");
    System.out.println(customerMap1.getMap().entrySet());
    CustomerMap customerMap2 = (CustomerMap) context.getBean("customerMap2");
    System.out.println(customerMap2.getMap().entrySet());


  }
}
