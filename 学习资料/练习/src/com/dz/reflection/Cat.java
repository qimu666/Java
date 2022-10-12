package com.dz.reflection;

public class Cat {
    private String name = "小白";
    public int age = 10;

    public Cat(String name) {
        this.name = name;

    }

    public Cat() {
    }

    public void hi() {
        System.out.println("hi  " + name + ">>>" + age);
    }

    public void cry() {
        System.out.println("cry" + name + "喵喵叫\n" + age);
    }
}
