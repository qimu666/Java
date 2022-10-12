package com.dz.work.work02.homework05;

public class employeeTest {
    public static void main(String[] args) {
        new worker(2000).print();
        new Peasant(1000).print();
        new Waiter(1500).print();
        Scientist scientist = new Scientist(3000);
        scientist.setBonus(100000);
        scientist.print();
        Teacher teacher = new Teacher(2000);
        teacher.setDay(360);
        teacher.setDaysalary(100);
        teacher.print();
    }
}
