package com.dz.file.io.objecOutputStream;

import java.io.Serializable;

//如果要序列化或反序列化某个类的对象,必须实现Serializable接口
//如果反序列化，要调用某个类对象的方法，要将此类作为共有的public
public class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
