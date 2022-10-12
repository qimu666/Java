package com.dz.work.work02.homework04;

public class BranchManager extends employee {
    private double bonus;

    public BranchManager(String name, double daysalary, int day, double level) {
        super(name, daysalary, day, level);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void print() {
        System.out.println("经理");
        System.out.println("姓名" + getName() + "\t工资:" + (bonus + getDay() * getDaysalary() * getLevel()));
    }
}
