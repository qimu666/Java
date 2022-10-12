package com.dz.day03多态.ye83;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hreo hreo = new Hreo();
        Army army = new Army();
        Guaiwu guaiwu = new Guaiwu();
        Master master = new Master();
        System.out.println("欢迎来到王权！");
        System.out.println("请选择您要购买的类型：1.英雄 2.雇佣兵 3.怪物");
        int xuanzhe = scanner.nextInt();
        if (xuanzhe == 1) {
            master.feed(hreo);
//            master.Work(hreo);
        } else if (xuanzhe == 2) {
            master.feed(army);
//            master.Work(army);
        }else if (xuanzhe==3){
            master.feed(guaiwu);
        }else {
            System.out.println("输入有误！");
        }
    }
}
