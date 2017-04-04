package com.wangfengbabe.learning_spring.springJdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 10/03/2017.
 */
public class App {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    LOGGER.info("begin running app to test");
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "classpath:spring/springJdbc/spring-module-jdbc.xml");
    CustomerDAO dao = (CustomerDAO) context.getBean("customerDao");
    Customer customer = new Customer(1, "wangfeng", 28);
    dao.insert(customer);
    Customer customer1 = dao.findByCustomerId(1);
    System.out.println(customer1);
  }

}
