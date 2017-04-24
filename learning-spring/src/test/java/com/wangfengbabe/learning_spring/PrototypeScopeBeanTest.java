package com.wangfengbabe.learning_spring;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangfeng on 18/04/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-beans.xml")
public class PrototypeScopeBeanTest {

  @Autowired
  @Qualifier("prototypeCustomer")
  private BeanScope customer1;

  @Autowired
  @Qualifier("prototypeCustomer")
  private BeanScope customer2;

  @Test
  public void whenBeanScopeIsPrototypeThenShouldNotBeSameInstance() {
    assertThat(customer1, is(not(nullValue(BeanScope.class))));
    assertThat(customer2, is(not(nullValue(BeanScope.class))));
    assertThat(customer1, not(sameInstance(customer2)));
    customer1.setMessage("hello");
    assertThat(customer1.getMessage(), is("hello"));
    assertThat(customer2.getMessage(), is(nullValue()));
  }

}
