package com.dz.day02继承.测试;

public class Army {
    public String name;
    public int health;

    public Army() {

    }

    public Army(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        System.out.println("父类中初始getName方法");
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
        System.out.println("父类中初始昵称：" + name + "\n生命值" + health);
    }
}
