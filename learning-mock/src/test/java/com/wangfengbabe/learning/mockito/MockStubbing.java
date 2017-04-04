package com.wangfengbabe.learning.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import org.junit.Test;

/**
 * Created by wangfeng on 15/03/2017.
 */
public class MockStubbing {

  @Test
  public void testStubbing() {
    //we can mock concrete classes ,not just interfaces
    LinkedList mockedList = mock(LinkedList.class);
    //stubbing
    when(mockedList.get(0)).thenReturn("first");
    when(mockedList.get(1)).thenThrow(new RuntimeException());

    //following print first
    System.out.println(mockedList.get(0));
    //following throw runtime exception
    try {
      System.out.println(mockedList.get(1));
    } catch (RuntimeException e) {
      System.out.println(e.getStackTrace());
    }

    //following print null because get(999) was not assigned
    System.out.println(mockedList.get(999));

    //Although it is possible to verify a stubbed invocation, usually it's just redundant
    //If your code cares what get(0) returns, then something else breaks (often even before verify() gets executed).
    //If your code doesn't care what get(0) returns, then it should not be stubbed. Not convinced? See here.
    verify(mockedList).get(0);


  }

}
