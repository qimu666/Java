package com.dz.day01抽象和封装.ye6;

public class Hero {
    public String name = "萧大侠";
    public int loyalty = 0;
    public int health = 100;
    public String birth;
    public String occupation = "骑士";
    public String sex = "男";

    public void show() {
        System.out.println("英雄介绍：\n我的昵称叫：" + name
                + "\n生命值：" + health
                + "\n忠诚度：" + loyalty
                + "\n我的职业：" + occupation
                + "\n性别:" + sex);
    }
}
