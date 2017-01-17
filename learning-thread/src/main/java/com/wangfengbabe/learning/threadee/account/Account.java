package com.wangfengbabe.learning.threadee.account;

/**
 * Created by wangfeng on 11/26/16.
 */
public class Account {
    private String accountNum;
    private double balance;

    private boolean flag = false;//判断是否已有存款

    public Account(String accountNum, double balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return accountNum.equals(account.accountNum);

    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNum='" + accountNum + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int hashCode() {
        return accountNum.hashCode();
    }

    public String getAccountNum() {

        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized void draw(double amount) {
        try {
            if (!flag) {
                wait();
            } else {
                System.out.println(Thread.currentThread().getName() + "取钱" + amount);
                balance -= amount;
                System.out.println("账户余额:" + balance);
                flag = false;
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized void deposite(double amout) {
        try {
            if (flag) {
                wait();
            } else {
                System.out.println(Thread.currentThread().getName() + "存钱" + amout);
                balance += amout;
                System.out.println("账户余额:" + balance);
                flag = true;
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
