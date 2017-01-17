package com.wangfengbabe.learning.threadee.threadinaction.chapter02;

/**
 * Created by wangfeng on 12/1/16.
 */
public class DemoThread2 extends Thread{
    private Widget childWidget;

    public DemoThread2(Widget childWidget) {
        this.childWidget = childWidget;
    }

    public Widget getChildWidget() {
        return childWidget;
    }

    public void setChildWidget(Widget childWidget) {
        this.childWidget = childWidget;
    }

    public void run() {
        childWidget.doSomething();
    }
}
