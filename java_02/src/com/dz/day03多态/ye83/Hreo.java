package com.dz.day03多态.ye83;

public class Hreo extends Person {
    @Override
    public void blood() {
        setName("李四");
        System.out.println("英雄"+getName()+"体力回复中，生命值加3");
    }

    public void affairs(){
        setName("李四");
        System.out.println("英雄"+getName()+"正在内政");
    }
}
