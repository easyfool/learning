package com.wangfengbabe.learning.helloword;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by wangfeng on 08/02/2017.
 */
public class HelloWorldTest {

    @Test
    public void testConstructorInject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config/helloworld.xml");
        HelloWorld helloworld = (HelloWorld) context.getBean("helloworld");
        assertThat("", helloworld.message, is("constructor inject"));
    }

    @Test
    public void testSetterInject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config/helloworld.xml");
        HelloWorld helloworld = (HelloWorld) context.getBean("helloworld2");
        assertThat("", helloworld.message, is("setter inject"));
    }

}