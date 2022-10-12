package com.dz.集合框架.ye189;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {
    private String name;
    private int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Test() {
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


    public static void main(String[] args) {
        Test test = new Test("张三", 18);
        Test test1 = new Test("李四", 19);
        Test test2 = new Test("王二", 20);
        Test test3 = new Test("小明", 22);
        ArrayList<Test> tests = new ArrayList<>();
        tests.add(test);
        tests.add(test1);
        tests.add(test2);
        tests.add(test3);
        for (Test test4 : tests) {
            System.out.println(test4);
        }

//
        Map map = new HashMap();

        map.put(1,test);
//        Map.put(1, test1);
//        Map.put(2, test2);
//        Map.put(3, test3);
//        System.out.println(map.keySet());
//        for (Object o : Map.keySet()) {
//            System.out.println(o);
//        }

    }
}
