package com.dz.work.work02.homework05;

public class Waiter extends employee{
    public Waiter(double salary) {
        super(salary);
    }

    @Override
    public void print() {
        System.out.println("服务生工资");
        super.print();
    }
}
