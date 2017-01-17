package com.wangfengbabe.learning.threadee;

/**
 * Created by wangfeng on 11/26/16.
 */
public class FirstThread extends Thread {
    private int i = 1;


    public void run() {
        for (; i < 10; i++) {
            System.out.println(i);
        }
    }
}
