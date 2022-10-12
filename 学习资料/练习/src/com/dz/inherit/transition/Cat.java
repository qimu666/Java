package com.dz.inherit.transition;

public class Cat extends Animal{
    public void eat() {
        name="小猫";
        System.out.println(name+"在吃东西");
    }
    public void QW(){
        System.out.println(name+"特有方法");
    }
}
