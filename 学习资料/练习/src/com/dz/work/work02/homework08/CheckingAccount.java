package com.dz.work.work02.homework08;

public class CheckingAccount extends BankAccount {
    private int poundage=1;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    public double getPoundage() {
        return poundage;
    }

    public void setPoundage(int poundage) {
        this.poundage = poundage;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount-poundage);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount+1);
    }
}
