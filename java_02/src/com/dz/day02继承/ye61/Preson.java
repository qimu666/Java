package com.dz.day02继承.ye61;

public abstract class Preson {
    private String name;
    private int health;

    public Preson() {

    }

    public Preson(String name, int health, String blood) {

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

    public abstract void Print();

    public void show(){
        System.out.println("姓名:" + name + "\n生命值：" + health);
        Print();
    }

}
