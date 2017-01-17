package com.wangfengbabe.learning.threadee;

import com.wangfengbabe.learning.threadee.account.Account;
import com.wangfengbabe.learning.threadee.account.DepositeThread;
import com.wangfengbabe.learning.threadee.account.DrawThread;

/**
 * Created by wangfeng on 11/26/16.
 */
public class Client {
    public static void main(String[] args) {
//        new FirstThread().start();
//        new FirstThread().start();
//        Runnable runnable = new SecondThread();
//        new Thread(runnable).start();
//        new Thread(runnable).start();
        Account account = new Account("12345", 100);

        new DepositeThread(account, 200).start();
        new DrawThread(account, 300).start();

    }
}
