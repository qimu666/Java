package com.dz.work.work02.homework04;

public class employee {
    private String name;
    private double daysalary;
    private int day;
    private double level;

    public employee(String name, double daysalary, int day, double level) {
        this.name = name;
        this.daysalary = daysalary;
        this.day = day;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaysalary() {
        return daysalary;
    }

    public void setDaysalary(double daysalary) {
        this.daysalary = daysalary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public void print() {
        double a = day * daysalary * level;
        System.out.println(a);
    }
}
