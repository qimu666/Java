package com.dz.aggregate.set.hashset;

import java.util.HashSet;
import java.util.Objects;

public class SetTest {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        /*定义一个Employee类，该类包含：private成员属性name,age要求：
          1.创建3个Employee对象放入HashSet中
          2.当name和age的值相同时，认为是相同员工，不能添加到HashSet集合中
         */
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("小明", 2));
        hashSet.add(new Employee("小红", 2));
        hashSet.add(new Employee("小明", 2));
        for (Object o : hashSet) {
            System.out.println(o);
        }
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
