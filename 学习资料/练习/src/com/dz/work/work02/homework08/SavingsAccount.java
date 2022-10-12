package com.dz.work.work02.homework08;

public class SavingsAccount extends BankAccount {
    private double interest = 0.01;
    private int count=3;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }
    public double earnMonthlyInterest(){
        count=3;
        return getBalance()*interest;
    }
}
