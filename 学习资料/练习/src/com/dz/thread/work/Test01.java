package com.dz.thread.work;

public class Test01 {

    public static void main(String[] args) throws InterruptedException {
        Subthread subthread = new Subthread();
        Thread thread = new Thread(subthread);
        thread.setDaemon(true); //守护线程 setDaemon
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "输出了：hi" + (i));
                if (i == 5) {
                    thread.start();
                    thread.join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("主线程结束........");
    }
}

class Subthread implements Runnable {
    private int count = 0;
    @Override
    public void run() {
        while (true) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "输出了：hello" + (++count));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            if (count == 10) {
                System.out.println("子线程结束>>>>>>>");
                break;
            }
        }
    }
}