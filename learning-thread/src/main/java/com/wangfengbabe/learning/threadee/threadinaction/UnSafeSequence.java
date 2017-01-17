package com.wangfengbabe.learning.threadee.threadinaction;

/**
 * Created by wangfeng on 11/27/16.
 */
@NotTheadSafe
public class UnSafeSequence {
    private int value;

    public int getNext() {
        return value++;
    }
}
