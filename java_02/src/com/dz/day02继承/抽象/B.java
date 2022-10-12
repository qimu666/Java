package com.dz.day02继承.抽象;

public  class B extends A{
    public void show(){
        setAge(10);
        setName("张三");
        System.out.println("姓名:"+getName()+"年龄"+getAge());
    }
}
