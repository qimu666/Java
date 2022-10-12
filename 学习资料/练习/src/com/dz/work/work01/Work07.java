package com.dz.work.work01;

public class Work07 {
    /*7.设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show(O显示其信息。
        并创建对象，进行测试、【提示this.属性】
       8.10,9,10
     */
    public static void main(String[] args) {

        Dog dog = new Dog("大黄","白色",12);
        dog.show();
    }
}
class Dog{
    String name;
    String color;
    int age;
    public Dog(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    public void show(){
        System.out.println("狗的名字:"+name+"\t狗的颜色:"+color+"\t狗的年龄:"+age);
    }
}
