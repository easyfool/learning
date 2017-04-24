package com.wangfengbabe.learning_spring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * BeanWithCollectionProperty Tester.
 *
 * @author wangfeng
 * @version 1.0
 * @since <pre>04/18/2017</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-beans.xml")
public class BeanWithCollectionPropertyTest {

  @Autowired
  @Qualifier("beanWithCollectionProperty")
  private BeanWithCollectionProperty collectionBean;

  @Before
  public void before() throws Exception {
  }

  @After
  public void after() throws Exception {
  }

  /**
   * Method: getLists()
   */
  @Test
  public void testGetList() throws Exception {
//TODO: Test goes here...

  }

  /**
   * Method: setLists(List<Object> lists)
   */
  @Test
  public void testSetList() throws Exception {
//TODO: Test goes here... 
  }

  /**
   * Method: getSets()
   */
  @Test
  public void testGetSet() throws Exception {
//TODO: Test goes here... 
  }

  /**
   * Method: setSet(Set<Object> sets)
   */
  @Test
  public void testSetSet() throws Exception {
//TODO: Test goes here... 
  }

  /**
   * Method: getMap()
   */
  @Test
  public void testGetMap() throws Exception {
//TODO: Test goes here... 
  }

  /**
   * Method: setMaps(Map<Object, Object> maps)
   */
  @Test
  public void testSetMap() throws Exception {
//TODO: Test goes here... 
  }

  /**
   * Method: getProperties()
   */
  @Test
  public void testGetProperties() throws Exception {
//TODO: Test goes here...
    System.out.println("");
  }

  /**
   * Method: setProperties(Properties properties)
   */
  @Test
  public void testSetProperties() throws Exception {
//TODO: Test goes here... 
  }

  @Test
  public void testWhenPropertyIsList() {
    List<Object> list = collectionBean.getList();
    //assertThat(list,hasItem(equalTo(1)));
  }

} 
