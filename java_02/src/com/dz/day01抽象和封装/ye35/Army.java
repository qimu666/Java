package com.dz.day01抽象和封装.ye35;

public class Army {
    private String name;
    private int health;

    public Army() {

    }

    public Army(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void show() {
        System.out.println("游戏简介:\n" + "昵称：" + name + "\n生命值" + health);
    }
}
