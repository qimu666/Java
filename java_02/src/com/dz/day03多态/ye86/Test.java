package com.dz.day03多态.ye86;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rifle rifle = new Rifle();
        Sniper sniper = new Sniper();
        Gustomer gustomer = new Gustomer();
        System.out.println("欢迎来到反恐精英");
        System.out.println("请输入要使用的天数：");
        int day = scanner.nextInt();
        do {
            System.out.println("请输入您要购买自动步枪的型号：(1.黄金AK47(半) 2.升级版M16(全) 3.95式套装(全) 4.狙击AWP 射程<1000 5.狙击AWP 射程>1000 0.退出)");
            int xuanzhe = scanner.nextInt();
            if (xuanzhe == 1) {
                rifle.setPay(200);
                 gustomer.sum+= rifle.amount(day, rifle.pay);
            } else if (xuanzhe == 2) {
                rifle.setPay(300);
                gustomer.sum += rifle.amount(day, rifle.pay);
            } else if (xuanzhe == 3) {
                rifle.setPay(350);
                gustomer.sum += rifle.amount(day, rifle.pay);
            } else if (xuanzhe == 4) {
                sniper.setPay(500);
                gustomer.sum += sniper.amount(day, sniper.pay);
            } else if (xuanzhe == 5) {
                sniper.setPay(1000);
                gustomer.sum += sniper.amount(day, sniper.pay);
            }
            if (xuanzhe == 0) {
                break;
            }
        }while (true);
        gustomer.setDay(day);
        gustomer.print();
    }
}