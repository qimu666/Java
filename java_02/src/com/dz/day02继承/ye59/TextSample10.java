package com.dz.day02继承.ye59;

public class TextSample10 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Army army = new Army();
        hero.setName("张三");
        hero.setHealth(100);
        hero.setLoyalty("100");
        hero.setOccupation("骑士");
        hero.Print();
        System.out.println("+++++++++++");
        army.setBirth("地牢");
        army.setName("李四");
        army.setHealth(100);
        army.Print();
    }
}
