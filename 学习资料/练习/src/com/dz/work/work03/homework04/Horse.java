package com.dz.work.work03.homework04;

public class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("一般情况下"+Person.getName()+"骑马");
    }
}
