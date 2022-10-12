package com.dz.work.work01;

public class Work06 {
    /* 6.编程创建一个Cae计算类，在其中定义2个变量表示两个操作数，
     定义四个方法实现求和、差、乘、商（要求除数为0的话，要提示）并创建两个对象，分别测试
     */
    public static void main(String[] args) {
        Cae sum = new Cae();
        Cae shang = new Cae();
        System.out.println("和为："+sum.sum(2,8));
        System.out.println("和为："+sum.shang(2,0));
    }
}

class Cae {
    public int sum(int a, int b) {
        return a + b;
    }

    public int poor(int a, int b) {
        return a - b;
    }

    public int take(int a, int b) {
        return a * b;
    }

    public int shang(int a, int b) {
        if (b==0){
            System.out.println("除数不能为0");
        }
        return a / b;
    }
}