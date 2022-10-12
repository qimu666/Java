package com.dz.work.work02.homework13;

public class Student extends Person {
    private int stu_id;

    public Student(String name, char sex, int age, int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println(getName()+"承诺，我会好好学习");
    }

    public void printinfo() {
        System.out.println("学生的信息");
        System.out.println(super.basicInfp());
        System.out.println("工龄：" + stu_id);
        study();
        System.out.println(paly());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                '}'+super.toString();
    }

    @Override
    public String paly() {
        return super.paly() + "爱玩足球";
    }
}
