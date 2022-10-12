package com.dz.inherit.transition;

public class Dog extends Animal {
    @Override
    public void eat() {
        name="小狗";
        System.out.println(name+"在吃东西");
    }
    public void QW(){
        System.out.println(name+"特有方法");
    }
}
