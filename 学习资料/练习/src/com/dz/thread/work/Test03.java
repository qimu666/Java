package com.dz.thread.work;

public class Test03 {
    public static void main(String[] args) {
      /*(1) 有2个用户分别从同一个卡上取钱 (总额：10000)
        (2) 每次都取1000，当余额不足时，就不能取款了
        (3) 不能出现超取现象 =》线程同步问题
       */
        WithdrawMoney withdrawMoneys = new WithdrawMoney();
        Thread thread = new Thread(withdrawMoneys);
        thread.setName("小明");
        Thread thread1 = new Thread(withdrawMoneys);
        thread1.setName("小赵");
        thread1.start();
        thread.start();
    }
}

class WithdrawMoney implements Runnable {
    private int money = 10000;
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            synchronized (this) {
                if (money < 1000) {
                    loop = false;
                    System.out.println("余额不足,"+Thread.currentThread().getName()+"取钱失败，剩余" + money);
                    return;
                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName() + "取钱1000，剩余" + (money));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
