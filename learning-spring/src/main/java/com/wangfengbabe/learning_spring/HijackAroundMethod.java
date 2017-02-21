package com.wangfengbabe.learning_spring;

import java.lang.reflect.Method;
import java.util.Arrays;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodProxy;


/**
 * Created by wangfeng on 18/02/2017.
 */
public class HijackAroundMethod implements MethodInterceptor {


  @Override
  public Object invoke(MethodInvocation methodInvocation) throws Throwable {
    System.out.println("Method name : " + methodInvocation.getMethod().getName());
    System.out.println("method arguments " + Arrays.toString(methodInvocation.getArguments()));
    System.out.println("around start ");
    Object result = null;
    try {
      result = methodInvocation.proceed();
    } catch (Exception e) {

    }
    System.out.println("around end");
    return result;
  }
}
