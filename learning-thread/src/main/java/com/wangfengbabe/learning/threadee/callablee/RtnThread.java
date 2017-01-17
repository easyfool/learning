package com.wangfengbabe.learning.threadee.callablee;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangfeng on 11/27/16.
 */
public class RtnThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "的循环变量i值:" + i);
        }
        TimeUnit.SECONDS.sleep(3);
        return i;
    }
}
