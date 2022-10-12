package com.dz.day02继承.测试;

public class Hero extends Army {
    public void show() {
//        super.getName();
        System.out.println("重写get方法");
//        super.show();
        System.out.println("重写后的初始昵称：" + getName() + "\n生命值" + getHealth());
    }
}
