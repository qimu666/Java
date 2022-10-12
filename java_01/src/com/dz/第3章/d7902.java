package com.dz.第3章;

import java.util.Scanner;

public class d7902 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int a = sr.nextInt();
        System.out.println("请输入第二个数字:");
        int b = sr.nextInt();
        System.out.println("请输入第三个数字:");
        int c = sr.nextInt();
        int x = 0;
        if (a>b) {
            x = a;
            a = b;
            b = x;
        }if (a>c){
             x=a;
             c=a;
             c=x;
        }if(b>c){
            b=x;
            b=c;
            c=x;
        }System.out.println("排序结果："+a+"<"+b+"<"+c);
    }
}

