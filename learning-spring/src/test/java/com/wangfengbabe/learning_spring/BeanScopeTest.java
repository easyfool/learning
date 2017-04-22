package com.wangfengbabe.learning_spring;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * BeanScope Tester.
 *
 * @author wangfeng
 * @version 1.0
 * @since <pre>04/18/2017</pre>
 */
@RunWith(Suite.class)
@SuiteClasses({PrototypeScopeBeanTest.class, SingletonScopeBeanTest.class})
public class BeanScopeTest {

  @Before
  public void before() throws Exception {
  }

  @After
  public void after() throws Exception {
  }

  /**
   * Method: getMessage()
   */
  @Test
  public void testGetMessage() throws Exception {
//TODO: Test goes here... 
  }

  /**
   * Method: setMessage(String message)
   */
  @Test
  public void testSetMessage() throws Exception {
//TODO: Test goes here... 
  }


} 
