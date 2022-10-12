package com.dz.reflection;

import com.dz.work.work03.homework05.Car;

public class GetClass {
    /**
     * 获取Class对象的六种方式
     */
    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class.forName()，通常通过配置文件获取
        String path = "com.dz.reflection.Cat";
        Class<?> cls1 = Class.forName(path);
        System.out.println(cls1);
        //2.对象.Class ,应用场景：用于对象实例
        Cat cat = new Cat();
        Class cls2 = cat.getClass();
        System.out.println(cls2);
        //3.类名.class,应用场景：用于参数传递
        Class cls3 = Cat.class;
        System.out.println(cls3);
        //4.通过类加载器获取Class对象
        //(1)得到类加载器 Cat
        ClassLoader classLoader = cat.getClass().getClassLoader();
        //(2)通过类的加载器得到Class对象
        Class<?> cls4 = classLoader.loadClass(path);
        System.out.println(cls4);
        //5.基本数据类型int,char,boolean,float,double,byte,long,short
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        System.out.println(integerClass);
        //基本类型对应的包装类，可以通过TYPE得到Class对象
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);
    }
}
