package com.wangfengbabe.learning.threadee.threadinaction.chapter02;

/**
 * Created by wangfeng on 12/1/16.
 */
public class DemoThread1 extends Thread {
    private Widget widget;

    public DemoThread1(Widget widget) {
        this.widget = widget;
    }

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    public void run() {
        widget.doSomething();
    }
}
