package com.wangfengbabe.learning.threadee.threadinaction.chapter02;

/**
 * Created by wangfeng on 12/1/16.
 */
public class ChildWidget extends Widget {
    @Override
    public synchronized void doSomething() {
        System.out.println("child widget begin do something");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("child widget end do something");
    }
}
