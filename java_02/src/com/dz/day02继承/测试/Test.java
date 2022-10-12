package com.dz.day02继承.测试;

public class Test {
    public static void main(String[] args) {
        System.out.println("子类");
        Hero hero = new Hero();
        hero.setName("李四");
        hero.setHealth(100);
        hero.show();
        System.out.println("++++++++++++++++++");
        System.out.println("父类");
        Army army = new Army();
        army.setName("王二");
        army.setHealth(98);
        army.getName();
        army.show();
    }
}
