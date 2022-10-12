package com.dz.lianxi;

import org.junit.Test;

public class Printer implements Runnable {
    private int index = 1;

    @Test
    @Override
    public void run() {
            while (true){
                if (index>=53){
                    return;
                }else {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        System.out.println(Thread.currentThread().getName()+"¥Ú”°¡À"+index+++"∑›");
                    }
                }
            }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();


    }
}
