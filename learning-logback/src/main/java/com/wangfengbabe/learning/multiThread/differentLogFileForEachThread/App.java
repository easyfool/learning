package com.wangfengbabe.learning.multiThread.differentLogFileForEachThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangfeng on 14/03/2017.
 */
public class App {

  public static void main(String[] args) {
    ExecutorService threadPool = Executors.newFixedThreadPool(10);
    int count = 1;
    while (count <= 10) {
      Head head = new Head();
      head.setName("head-" + count);
      threadPool.execute(head);
      count++;
    }
    threadPool.shutdown();
  }

}
