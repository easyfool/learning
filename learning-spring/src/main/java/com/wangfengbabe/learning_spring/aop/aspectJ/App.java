package com.wangfengbabe.learning_spring.aop.aspectJ;

import com.wangfengbabe.learning_spring.aop.CustomerBo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 10/03/2017.
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "classpath:spring/aop/aspectJ/spring-aop-aspectJ.xml");
    CustomerBo customerBo = (CustomerBo) context.getBean("customerBo");
    customerBo.addCustomer();
    customerBo.addCustomerReturnValue();
    try {
      customerBo.addCustomerThrowException();
    } catch (Exception e) {
      e.printStackTrace();
    }
    customerBo.addCustomerAround("wangfeng");
  }

}
