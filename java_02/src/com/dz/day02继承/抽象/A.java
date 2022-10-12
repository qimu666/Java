package com.dz.day02继承.抽象;

public abstract class A {
    private String name;
    private int age;

    public A() {

    }

    public A(String name, int age) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public  void print(){
        System.out.println("姓名："+name+"年龄："+age);
        show();
    }
    public abstract void show();
}
