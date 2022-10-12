package com.dz.work.work02.homework05;

public class Scientist extends employee {
    private double bonus;

    public Scientist(double salary) {
        super(salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void print() {
        System.out.println("科学家工资");
        System.out.println(bonus+getSalary()*12);
    }
}
