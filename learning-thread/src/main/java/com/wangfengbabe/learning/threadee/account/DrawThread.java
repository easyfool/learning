package com.wangfengbabe.learning.threadee.account;

/**
 * Created by wangfeng on 11/26/16.
 */
public class DrawThread extends Thread {
    private Account account;
    private double amount;

    public DrawThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            account.draw(200);
        }

    }
}
