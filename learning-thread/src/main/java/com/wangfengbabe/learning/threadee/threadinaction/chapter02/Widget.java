package com.wangfengbabe.learning.threadee.threadinaction.chapter02;

/**
 * Created by wangfeng on 12/1/16.
 */
public class Widget {
    public synchronized void doSomething() {
        System.out.println("parent class begin ... dosomething");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("parent class end ... dosomething");
    }

}
