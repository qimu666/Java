package com.dz.work.work02.homework03;

public class Professor extends Teacher {
    private double level;

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    @Override
    public String introduce() {
        return super.introduce() + "\t工资级别：" + level;
    }
}
