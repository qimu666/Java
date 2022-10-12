package com.dz.day03多态.ye83;

public class Army extends Person {

    @Override
    public void blood() {
        setName("张三");
        System.out.println("雇佣兵" + getName() + "体力回复中，生命值加5");
    }

    public void patrol() {
        setName("张三");
        System.out.println("雇佣兵" + getName() + "正在巡逻");
    }
}
