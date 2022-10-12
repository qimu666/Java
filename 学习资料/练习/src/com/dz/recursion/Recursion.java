package com.dz.recursion;

import javax.swing.*;
import java.util.Scanner;

public class Recursion {
    /*请使用递归的方式求出斐波那契数1,1,2,3,5,8,13··给你一个整数n,求出它的值是多少
     分析：
     n=1时，斐波那契数=1
     n=2时，斐波那契数=1
     n>=3时，斐波那契数=前两个数的和
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        A a = new A();
//        System.out.println("请输入这个正整数");
//        int n = scanner.nextInt();
        int n = 7;
        int res = a.R(n);
        if (res != -1) {
            System.out.println("当n=" + n + "时，对应的斐波那契数值为：" + res);
        }

        /*
        猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个
        以后每天猴子都吃其中的一半，然后再多吃一个。当到第10天时
        想再吃时（即还没吃），发现只有1个桃子了。问题：最初共多少个桃子？

        分析：
         第10天有1个
         第9天有(第10天+1)*2
         第8天 (第9天+1)*2

         */
        B b = new B();
        int day = 1;
        int peach = b.peach(day);
        if (peach!=-1) {
            System.out.println("第" + day + "天时有" + peach + "个桃子");
        }
    }
}

class A {
    public int R(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return R(n - 1) + R(n - 2);
            }
        } else {
            System.out.println("输入的整数有误，n必须>=1");
            return -1;
        }
    }
}

class B {
    public int peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("day必须在1-10之间");
            return -1;
        }
    }
}