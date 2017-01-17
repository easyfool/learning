package com.wangfengbabe.learning.threadee;

/**
 * Created by wangfeng on 11/26/16.
 */
public class SecondThread implements Runnable {
    private int i = 1;


    @Override
    public void run() {
        for (; i < 10; i++) {
            System.out.println(i);
        }
    }
}
