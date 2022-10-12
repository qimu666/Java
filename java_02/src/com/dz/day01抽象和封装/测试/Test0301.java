package com.dz.day01抽象和封装.测试;

public class Test0301 {
    public String name;
    public int age;

    public Test0301() {

    }

    public Test0301(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("学生叫做" + name + ",年龄" + age);
    }
}
