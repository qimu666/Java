package com.dz.work.work02.homework05;

public class worker extends employee{
    public worker(double salary) {
        super(salary);
    }
    public void print() {
        System.out.println("工人工资");
        super.print();
    }
}
