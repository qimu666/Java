package com.dz.thread.work;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
//        (1) 在main方法中启动两个线程
//        (2) 第1个线程循环随机打印100以内的整数
//        (3) 直到第2个线程从键盘读取了“Q”命令。
        A a = new A();
        new Thread(a).start();
        new Thread(new B(a)).start();
    }
}

class A implements Runnable {
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            System.out.println((int) (Math.random() * 100) + 1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

class B implements Runnable {
    A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("输入Q退出：");
            char c = scanner.next().toUpperCase().charAt(0);
            if (c == 'Q') {
                a.setLoop(false);
                break;
            }
        }
    }
}