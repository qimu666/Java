package com.dz.work.work03.homework03;

public class Test {
    public static void main(String[] args) {
        /*·1.计算器接口具有work方法，功能是运算，有一个手机类Cellphone,定义方法testWork
           测试计算功能，调用计算接口的work方法，
           2.要求调用CellPhone对象的testWork方法，使用上匿名内部类
         */
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Counter() {
            @Override
            public int work(int a, int b) {
                return a * b;
            }
        }, 2, 5);

         /*  匿名内部类
      new Counter() {
            @Override
            public int work(int a, int b) {
                return a*b;
            }
        },2,5);

       */
    }
}

interface Counter {
    public int work(int a, int b);
}

class Cellphone {

    public void testWork(Counter counter, int a, int b) {
        int i = counter.work(a, b);
        System.out.println("结果为：" + i);
    }
}