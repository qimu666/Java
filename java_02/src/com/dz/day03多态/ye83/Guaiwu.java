package com.dz.day03多态.ye83;

public class Guaiwu extends Person{
    @Override
    public void blood() {
        setName("麻子");
        System.out.println("怪物" + getName() + "体力回复中，生命值加10");
    }

    public void patrol() {
        setName("麻子");
        System.out.println("怪物" + getName() + "正在巡逻");
    }
}
