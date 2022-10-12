package com.dz.work.work03.homework04;

public class Test {
    public static void main(String[] args) {
        /*
        1.有一个交通工具接口类Vehicles,有work接口
        2.有Horse类和Boat类分别实现Vehicles
        3.创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
        4.有Person类，有name和Vehicles属性，在构造器中为两个属性赋值
        5.实例化Person对象“唐僧”，要求一般情况下用Horse作为交通工具，遇到大河时用Boat作为交通工具
         */
        Person person = new Person("唐僧",new Horse());
        person.common();//骑马
        person.getboat();//坐船
        person.volcano();//飞机
        person.getboat();//坐船
        person.volcano();//飞机
        person.common();//骑马
        person.common();//骑马
        person.volcano();//飞机
        person.getboat();//坐船
        person.getboat();//坐船

    }
}
