package com.dz.day01抽象和封装.ye35;

public class Hero {
    private String name;
    private int health;
    private String sex;
    private String occupation;

    public Hero() {
        sex="男";
        occupation="骑士";
    }

    public Hero(String name, int health, String sex, String occupation) {
        this.name = name;
        this.health = health;
        this.sex = sex;
        this.occupation = occupation;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void show() {
        System.out.println("人物介绍：\n" + "昵称：" + name + "\n生命值：" + health + "\n性别：" + sex + "\n职业：" + occupation);
    }
}
