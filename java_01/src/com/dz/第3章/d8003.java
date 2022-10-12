package com.dz.第3章;

import java.util.Scanner;

public class d8003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入订票季节（1-12）");
        int jj = scanner.nextInt();
        System.out.println("请输入订票级别（1.头等舱 2.经济舱）");
        int jb = scanner.nextInt();
        int jg =5000;
        if (jj >= 4 && jj <= 10) {
            if (jb == 1) {
                double jg1=5000*0.9;
                System.out.println("9折\t"+"您需要支付："+jg1+"元");
            } else if (jb == 2) {
                double jg2=5000*0.8;
                System.out.println("8折\t"+"您需要支付："+jg2+"元");
            } else {
                System.out.println("输入座次有误！");
            }
        }else if ((jj >= 1 && jj <= 3) || (jj >= 11 && jj <= 12)) {
            if (jb == 1) {
                double jg3=5000*0.5;
                System.out.println("5折\t"+"您需要支付："+jg3+"元");
            } else if (jb == 2) {
                double jg4=5000*0.4;
                System.out.println("4折\t"+"您需要支付："+jg4+"元");
            }else{System.out.println("输入座次有误!");
            }
        }else {
            System.out.println("输入月份有误！");
        }
    }
}