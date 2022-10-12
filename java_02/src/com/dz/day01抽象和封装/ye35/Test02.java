package com.dz.day01抽象和封装.ye35;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero();
        System.out.println("请输入你要购买的英雄昵称");
        String name = scanner.next();
        hero.setName(name);
        System.out.println("请输入你要购买的英雄的生命值");
        int health = scanner.nextInt();
        hero.setHealth(health);
        if (health < 20) {
            System.out.println("英雄生命值过低，请输入20生命值以上");
        } else {
            hero.show();
        }
    }
}
