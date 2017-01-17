package com.wangfengbabe.learning.threadee;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangfeng on 11/27/16.
 */

class TestThead implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadpoolTest {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newCachedThreadPool();
        threadPool.submit(new TestThead());
        threadPool.submit(new TestThead());
        threadPool.shutdown();
    }
}
