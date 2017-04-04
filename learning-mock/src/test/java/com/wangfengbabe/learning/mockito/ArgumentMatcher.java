package com.wangfengbabe.learning.mockito;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import org.junit.Test;

/**
 * Created by wangfeng on 15/03/2017.
 */
public class ArgumentMatcher {

  @Test
  public void testArgumentMatcher() {
    LinkedList mockedList = mock(LinkedList.class);
    //stubbing using built-in anyInt() argument matcher
    when(mockedList.get(anyInt())).thenReturn("element");

    //stubbing using custom matcher (let's say isValid() returns your own matcher implementation):
//    when(mockedList.contains(argThat(isValid()))).thenReturn("element");

    //following prints "element"
    System.out.println(mockedList.get(999));

    //you can also verify using an argument matcher
    verify(mockedList).get(anyInt());

    //argument matchers can also be written as Java 8 Lambdas

//    verify(mockedList).add(argThat(someString -> someString.length() > 5));
  }

}
