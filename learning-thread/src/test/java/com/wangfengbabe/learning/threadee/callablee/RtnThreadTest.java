package com.wangfengbabe.learning.threadee.callablee;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import static org.junit.Assert.*;

/**
 * Created by wangfeng on 11/27/16.
 */
public class RtnThreadTest {
    public static void main(String[] args) {
        RtnThread rtn = new RtnThread();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(rtn);
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "循环变量的值:" + i);
            if (i == 20) {
                new Thread(futureTask, "有返回值的线程").start();
            }

        }
        try {
            System.out.println("子线程的返回值:" + futureTask.get());//将导致主线程阻塞
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("hello");
    }

}