package com.dz.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("练习/src/com/dz/reflection/re.properties"));
        String classpath = properties.get("classpath") + "";
        String method = properties.get("method") + "";
        System.out.println(classpath + ">>>" + method);

        //1.加载类
        Class<?> cla = Class.forName(classpath);
        //2.通过cls得到加载的类 com.dz.reflection.Cat的对象实例
        Object o = cla.getDeclaredConstructor().newInstance();
        //通过cls得到加载的类 com.dz.reflection.Cat的 method "hi"的方法对象
        //在发射中，可以把方法视为对象
        Method method1 = cla.getMethod(method);
        method1.setAccessible(true);//调用反射方法时，取消访问检查，效果不大，Field，Constructor也可以使用
        System.out.println("++++++++++++++++++");
        method1.invoke(o);

        // java.lang.reflect.Field 代表类的成员变量,
        //Field对象表示某个类的成员变量
        //getField不能得到私有的属性
        Field age = cla.getField("age");//成员变量对象.get(对象)
        System.out.println(age.get(o));
        //Constructor表示对象构造器
        Constructor<?> constructor = cla.getConstructor(String.class);
        System.out.println(constructor);
        Constructor<?> constructor1 = cla.getConstructor();//()中什么都不写是无参构造器
        System.out.println(constructor1);
    }
}
