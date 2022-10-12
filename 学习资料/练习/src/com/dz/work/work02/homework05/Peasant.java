package com.dz.work.work02.homework05;

public class Peasant extends employee{
    public Peasant(double salary) {
        super(salary);
    }
    public void print() {
        System.out.println("农民工资");
        super.print();
    }
}
