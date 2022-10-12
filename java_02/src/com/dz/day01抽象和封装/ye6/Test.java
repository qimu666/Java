package com.dz.day01抽象和封装.ye6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Army army = new Army();
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎来到本网游！");
        System.out.println("请输入要购买人物的昵称：");
        String name = input.next();
        hero.name = name;
        System.out.println("请输入您要购买的人物类型：1.英雄 2.雇佣兵");
        do {
            int leixing = input.nextInt();
            if (leixing == 1) {
                System.out.println("请选择英雄的职业：1.骑士 2.法师");
                int zhiye = input.nextInt();
                if (zhiye == 1) {
                    hero.occupation = "骑士";
                    break;
                } else if (zhiye == 2) {
                    hero.occupation = "法师";
                    break;
                } else {
                    System.out.println("输入有误");
                }
                hero.show();
                break;
            } else if (leixing == 2) {
                army.name = name;
                System.out.println("请选择雇佣兵出生地：1.盗墓公社 2.弓箭手营房");
                int zhiye2 = input.nextInt();
                if (zhiye2 == 1) {
                    army.birth = "盗墓公社";
                    break;
                } else if (zhiye2 == 2) {
                    army.birth = "弓箭手营房";
                    break;
                } else {
                    System.out.println("输入有误");
                }
                army.show();
                break;
            } else {
                System.out.println("输入有误!请输入您要购买的人物类型：1.英雄 2.雇佣兵");
            }
        } while (true);

    }

}
