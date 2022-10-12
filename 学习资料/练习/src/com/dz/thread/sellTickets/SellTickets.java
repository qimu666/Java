package com.dz.thread.sellTickets;

class SellWindow {
    public static void main(String[] args) {
        SellTickets sellTickets = new SellTickets();
        new Thread(sellTickets).start();
        new Thread(sellTickets).start();
        new Thread(sellTickets).start();
    }
}

public class SellTickets implements Runnable {
    private int count = 100;
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            Sell();//线程同步方法
        }
    }

    //1. public synchronized void Sell() {} 就是一个同步方法
    //2. 这时的锁在 this对象 ,也可以是同一个对象
    //3.也可以在代码块中用synchronized [推荐]
        /*
           synchronized (this) {}     就是一个同步代码块
         */
    Object object = new Object();//同一个对象

    public /*synchronized*/ void Sell() {    //synchronized 线程同步 同一时刻，只能有一条线程执行Sell方法
        synchronized (/*this*/object) {//同一个对象
            if (count <= 0) {
                System.out.println("窗口" + Thread.currentThread().getName() + "售票结束......");
                loop = false;
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "卖出了一张票,剩余" + (count--));
        }
    }

    //同步方法是静态的 锁为当前类本身
    //1. public synchronized static void m() {} 锁是加在 SellTickets.class
    public synchronized static void m() {
    }

    //如果在静态方法中实现代码块,要这样写
    public static void m2() {
        synchronized (SellTickets.class) {
        }
    }
}
