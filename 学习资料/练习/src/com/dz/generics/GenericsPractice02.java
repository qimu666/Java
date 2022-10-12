package com.dz.generics;


import java.util.ArrayList;
import java.util.Comparator;

public class GenericsPractice02 {
    public static void main(String[] args) {
      /*定义Employee类
        1)该类包含：private成员变量name,sal,birthday,其中birthday为MyDate类的对象；
        2)为每一个属性定义getter,,setter方法：
        3)重写toString方法输出name,sal,birthday
        4)MyDate类包含：private成员变量month,day,year;并为每一个属性定义getter,setter方法；
        5)创建该类的3个对象，并把这些对象放入ArrayList集合中(ArrayList需使用泛型来定义)，
        对集舍中的元素进行排序，并遍历输出：
        排序方式：调用ArrayList的sort方法，传入Comparator对像[使用泛型]，先按照
        name排序，如果name相同，则按生日日期的先后排序。【即：定制排序】
       */
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("zzz", 3300, new MyDate(2000, 9, 14)));
        employees.add(new Employee("tom", 2300, new MyDate(2021, 6, 14)));
        employees.add(new Employee("smith", 3200, new MyDate(1998, 7, 15)));
        employees.add(new Employee("tom", 4000, new MyDate(2000, 8, 23)));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {
                    return 0;
                }
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0) {
                    return i;
                }
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });
        System.out.println("排序后");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate> {
    private int month;
    private int day;
    private int year;

    public MyDate(int year, int month, int day) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o1) {
        int years = year - o1.getYear();
        if (years != 0) {
            return years;
        }
        int months = month - o1.getMonth();
        if (months != 0) {
            return months;
        }
        return day - o1.getDay();
    }
}