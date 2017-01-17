package com.wangfengbabe.learning.threadee.threadinaction.chapter02;

/**
 * Created by wangfeng on 12/1/16.
 */
public class Client {
    public static void main(String[] args) {
        Widget widget = new ChildWidget();
        new Thread(new DemoThread1(widget)).start();
        new Thread(new DemoThread1(widget)).start();
    }
}
