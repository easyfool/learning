package com.wangfengbabe.learning.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.Test;

/**
 * Created by wangfeng on 15/03/2017.
 */
public class VerifyBehavior {

  @Test
  public void testMockBehavior() {
    // mock creation
    List mockedList = mock(List.class);

    //using mock object
    mockedList.add("one");
    mockedList.clear();

    //verification
    verify(mockedList).add("one");
    verify(mockedList).clear();

    assertThat(1,is(1));
  }

}
