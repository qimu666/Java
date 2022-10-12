package com.dz.work.work02.homework04;

public class staff extends employee {
    public staff(String name, double daysalary, int day, double level) {
        super(name, daysalary, day, level);
    }

    @Override
    public void print() {
        System.out.println("员工工资");
        super.print();
    }
}
