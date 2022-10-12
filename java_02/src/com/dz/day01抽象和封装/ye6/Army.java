package com.dz.day01抽象和封装.ye6;

public class Army {
    public String name ="蓉蓉";
    public int loyalty =1;
    public int health =98;
    public String birth;
    public String occupation = "法师";
    public String sex ="男";
    public void show(){
        System.out.println("雇佣兵介绍：\n我的昵称叫："+name
                +"\n生命值："+health
                +"\n出生地:"+birth
                +"\n忠诚度：" +loyalty
                +"\n我的职业：" +occupation
                +"\n性别:"+sex);
    }
}
