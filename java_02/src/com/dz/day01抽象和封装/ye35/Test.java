package com.dz.day01抽象和封装.ye35;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Army army = new Army();
        System.out.println("请输入你要购买的士兵昵称");
        String name = scanner.next();
        army.setName(name);
        System.out.println("请输入你要购买的士兵的生命值");
        int health = scanner.nextInt();
        army.setHealth(health);
        if (health < 20) {
            System.out.println("生命值过低，请输入20生命值以上");
        } else {
            army.show();
        }
    }
}
