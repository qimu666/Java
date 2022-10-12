package com.dz.第3章;

import java.util.Scanner;

public class shangji1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int s1 = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int s2 = scanner.nextInt();
        System.out.println("请输入运算符（+、-、*、/）");
        String s3 = scanner.next();
        int j =s1+s2;
        int jian = s1-s2;
        int c = s1 * s2;
        int chu =s1/s2;
        switch (s3) {
            case "+":
                System.out.println(s1+s3+s2+"="+j);
                break;
            case "-":
                System.out.println(s1+s3+s2+"="+jian);
                break;
            case "*":
                System.out.println(s1+s3+s2+"="+c);
                break;
            case "/":
                System.out.println(s1+s3+s2+"="+chu);
                break;
            default:
                System.out.println("输入有误！");
                break;
        }
    }
}

