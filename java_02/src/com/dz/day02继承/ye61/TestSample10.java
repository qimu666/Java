package com.dz.day02继承.ye61;

import com.dz.day02继承.ye59.Hero;

public class TestSample10 {
    public static void main(String[] args) {
        com.dz.day02继承.ye59.Hero hero = new Hero();
        Army army = new Army();
        hero.setOccupation("骑士");
        hero.setLoyalty("100");
        hero.setName("张三");
        hero.setHealth(110);
        hero.Print();
        army.setBirth("地牢");
        army.Print();
    }
}
