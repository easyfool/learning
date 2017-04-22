package com.wangfengbabe.learning_spring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.core.IsNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * HelloWorld Tester.
 *
 * @author wangfeng
 * @version 1.0
 * @since <pre>04/16/2017</pre>
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-beans.xml")
public class HelloWorldTest {

  @Rule
  public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

  @Autowired
  HelloWorld helloWorld;

  @Before
  public void before() throws Exception {

  }

  @After
  public void after() throws Exception {
  }

  /**
   * Method: getName()
   */
  @Test
  public void testGetName() throws Exception {
//TODO: Test goes here...
  }

  /**
   * Method: setName(String name)
   */
  @Test
  public void testSetName() throws Exception {
//TODO: Test goes here...
  }

  @Test
  public void testHelloWorldShouldNotBeNull() {
    assertThat(helloWorld, is(IsNull.notNullValue()));
  }

  /**
   * Method: printHello()
   */
  @Test
  public void testPrintHello() throws Exception {
    //TODO: Test goes here...
    systemOutRule.clearLog();
    helloWorld.printHello();
    assertThat(systemOutRule.getLog(), equalTo("hello wangfeng\n"));

  }


} 
