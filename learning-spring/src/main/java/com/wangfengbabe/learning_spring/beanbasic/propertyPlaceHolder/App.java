package com.wangfengbabe.learning_spring.beanbasic.propertyPlaceHolder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by wangfeng on 20/02/2017.
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "classpath:spring/beanbasic/propertyPlaceHolder/placeHolder1.xml");
    DriverManagerDataSource dataSource = (DriverManagerDataSource) context.getBean("dataSource");
    System.out.println(dataSource.getUrl());
    System.out.println(dataSource.getUsername());
    System.out.println(dataSource.getPassword());

    System.out.println("************************");

    context = new ClassPathXmlApplicationContext(
        "classpath:spring/beanbasic/propertyPlaceHolder/placeHolder2.xml");
    dataSource = (DriverManagerDataSource) context.getBean("dataSource");
    System.out.println(dataSource.getUrl());
    System.out.println(dataSource.getUsername());
    System.out.println(dataSource.getPassword());
    System.out.println("************************");


  }
}
