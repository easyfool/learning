package com.wangfengbabe.learning_spring.beanbasic.injectValue.shortcut;

import com.wangfengbabe.learning_spring.beanbasic.injectValue.normalway.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 20/02/2017.
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "classpath:spring/beanbasic/valueInject/shortcut/applicationContext.xml");
    Person person = (Person) context.getBean("person");
    System.out.println(person.getName() + " aged " + person.getAge());
  }

}
