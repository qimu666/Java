package com.dz.work.work02.homework05;

public class Teacher extends employee{
    private int day;
    private int daysalary;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDaysalary() {
        return daysalary;
    }

    public void setDaysalary(int daysalary) {
        this.daysalary = daysalary;
    }

    public Teacher(double salary) {
        super(salary);
    }

    @Override
    public void print() {
        System.out.println("教师工资");
        System.out.println(getSalary()*12+day*daysalary);
    }
}
