package com.wangfengbabe.learning_spring;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * Created by wangfeng on 18/02/2017.
 */
public class HijackBeforeMethod implements MethodBeforeAdvice {

  @Override
  public void before(Method method, Object[] objects, Object o) throws Throwable {
    System.out.println("before method advice");
  }
}
