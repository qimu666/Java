package com.dz.reflection;

import com.dz.work.work03.homework05.Car;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //1.获取到对应的class对象
        // <?>表示不确定的java类型
        Class<?> cls = Class.forName("com.dz.reflection.Cat");
        //2.输出cls
        System.out.println(cls);//显示Class对象是哪个类的Class对象
        System.out.println(cls.getClass());//输出cls的运行类型
        //3.得到包名
        System.out.println(cls.getPackage().getName());//包名
        //4.得到全类名
        System.out.println(cls.getName());
        //5.通过cls创建实例化对象
        Object o = cls.getConstructor().newInstance();
        System.out.println(o);
        //6.通过反射获取属性
        Field age = cls.getField("age");//不能是私有属性
        System.out.println(age.get(o));
        //7.通过反射给属性赋值
        age.set(o,20);
        System.out.println(age.get(o));
        //8.得到所有属性
        System.out.println("+++++++++");
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
