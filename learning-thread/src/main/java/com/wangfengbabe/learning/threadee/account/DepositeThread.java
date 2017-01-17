package com.wangfengbabe.learning.threadee.account;

/**
 * Created by wangfeng on 11/27/16.
 */
public class DepositeThread extends Thread {
    private Account account;
    private double amount;

    public DepositeThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;

    }

    public void run() {
        for (int i = 0;i <20;i++){
            account.deposite(300);
        }
    }
}
