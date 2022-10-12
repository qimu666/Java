package com.dz.work.work02.homework08;

public class BankAccountTest {
    /*
    要求：
          (1)在上面类的基础上扩展新类CheckingAccount
          对每次存款和取款都收取1美元的手续费
          (2)扩展前一个练习的BankAccount类，新类SavingsAccount每个月都有利息产生
          (earnMonthlyInterest方法被调用)，并且有每月三次免手续费的存款或取款。
          在earnMonthlyInterest方法中重置交易计数
          (3)体会重写的好处
     */
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(100);
//        System.out.println(checkingAccount.getBalance());
//        checkingAccount.withdraw(99);
//        System.out.println(checkingAccount.getBalance());
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(300);
        savingsAccount.deposit(100);
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.earnMonthlyInterest();
        savingsAccount.withdraw(100);
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(2000);
        savingsAccount.withdraw(200);
        System.out.println(savingsAccount.getBalance());

    }
}
