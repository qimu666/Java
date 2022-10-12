package com.dz.day02继承.ye56;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rifle rifle = new Rifle();
        Sniper sniper = new Sniper();
        System.out.println("欢迎来到反恐精英");
        System.out.println("请输入要使用的天数：");
        int day = scanner.nextInt();
        System.out.println("请输入您要购买的枪支类型(1.自动步枪 2.狙击枪)");
        int xuanzhe = scanner.nextInt();
        if (xuanzhe == 1) {
            System.out.println("请输入您要购买自动步枪的型号：(1.黄金AK47(半) 2.升级版M16(全) 3.95式套装(全))");
            int buqiang = scanner.nextInt();
            if (buqiang == 1) {
                rifle.setPay(200);
                rifle.setModel("自动步枪");
                rifle.setName("黄金AK47(半)");
                rifle.setConuntry("美国");
                System.out.println("恭喜您订购了" + rifle.getModel());
                System.out.println("一共花费了" + rifle.amount(day, rifle.pay) + "游戏币");
                System.out.println("++++++++++++");
                System.out.println("自动步枪详情：");
                rifle.print();
            } else if (buqiang == 2) {
                rifle.setPay(300);
                rifle.setModel("自动步枪");
                rifle.setName("升级版M16(全)");
                rifle.setConuntry("苏联");
                System.out.println("恭喜您订购了" + rifle.getModel());
                System.out.println("一共花费了" + rifle.amount(day, rifle.pay) + "游戏币");
                System.out.println("++++++++++++");
                System.out.println("自动步枪详情：");
                rifle.print();
            } else if (buqiang == 3) {
                rifle.setPay(350);
                rifle.setModel("自动步枪");
                rifle.setName("95式套装(全)");
                rifle.setConuntry("中国");
                System.out.println("恭喜您订购了" + rifle.getModel());
                System.out.println("一共花费了" + rifle.amount(day, rifle.pay) + "游戏币");
                System.out.println("++++++++++++");
                System.out.println("自动步枪详情：");
                rifle.print();
            } else {
                System.out.println("输入有误！");
            }
        } else if (xuanzhe == 2) {
            System.out.println("请输入您要购买狙击枪的型号：(1.射程<1000 2.射程>1000)`");
            int shecheng = scanner.nextInt();
            if (shecheng == 1) {
                sniper.setPay(500);
                sniper.setName("AWM");
                sniper.setConuntry("美国");
                sniper.setRange("射程<1000");
                System.out.println("恭喜您订购了" + sniper.getName());
                System.out.println("一共花费了" + sniper.amount(day, sniper.pay) + "游戏币");
                System.out.println("++++++++++++");
                System.out.println("狙击枪详情：");
                sniper.print();
            } else if (shecheng == 2) {
                sniper.setPay(1000);
                sniper.setName("M4");
                sniper.setConuntry("中国");
                sniper.setRange("射程>1000");
                System.out.println("恭喜您订购了" + sniper.getName());
                System.out.println("一共花费了" + sniper.amount(day, sniper.pay) + "游戏币");
                System.out.println("++++++++++++");
                System.out.println("狙击枪详情：");
                sniper.print();
            } else {
                System.out.println("输入有误！");
            }
        } else {
            System.out.println("输入有误！");
        }
    }
}
