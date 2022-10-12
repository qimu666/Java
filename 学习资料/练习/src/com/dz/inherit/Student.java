package com.dz.inherit;

public class Student extends Person{
    /*  2.编写一个Student类，继承Person类，增加id、scorel属性/private,以及构造器，定义say方法（返回自我介绍的信息）。
     */
    private int id;
    private int scorel;

    public Student(String name, int age, int id, int scorel) {
        super(name, age);
        this.id = id;
        this.scorel = scorel;
    }
    public String say(){
        return super.say()+"\tid"+id+"\tscorel"+scorel;
    }
}
