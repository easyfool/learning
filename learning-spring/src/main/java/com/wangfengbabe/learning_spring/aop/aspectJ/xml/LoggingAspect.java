package com.wangfengbabe.learning_spring.aop.aspectJ.xml;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by wangfeng on 10/03/2017.
 */
public class LoggingAspect {

  public void logBefore(JoinPoint joinPoint) {
    System.out.println("logBefore() is running");
    System.out.println("hijacked: " + joinPoint.getSignature().getName());
    System.out.println("***************");
  }

  public void logAfter(JoinPoint joinPoint) {
    System.out.println("logAfter() is running");
    System.out.println("hijacked: " + joinPoint.getSignature().getName());
    System.out.println("****************");
  }

  public void logAfterReturning(JoinPoint joinPoint, Object result) {
    System.out.println("logAfterReturning() is running");
    System.out.println("hijacked :" + joinPoint.getSignature().getName());
    System.out.println("return value :" + result);
    System.out.println("**************");

  }

  public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
    System.out.println("logAfterThrowing() is running");
    System.out.println("hijacked :" + joinPoint.getSignature().getName());
    System.out.println("Exception :" + error);
    System.out.println("**************");
  }

  public void logAround(ProceedingJoinPoint proceedingJoinPoint) {
    System.out.println("logAround() is running");
    System.out.println("hijacked method : " + proceedingJoinPoint.getSignature().getName());
    System.out.println("hijacked arguments:" + Arrays.toString(proceedingJoinPoint.getArgs()));

    System.out.println("Around before is running");
    try {
      proceedingJoinPoint.proceed();
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }
    System.out.println("Around after is running");
    System.out.println("*********");

  }

}
