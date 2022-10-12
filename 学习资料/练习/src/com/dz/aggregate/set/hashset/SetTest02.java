package com.dz.aggregate.set.hashset;

import java.util.HashSet;
import java.util.Objects;

public class SetTest02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
       /*定义一个Employee类，该类包含：private成员属性name,sal,birthday(MyDate类型)，
         其中birthday为MyDate类型（属性包括：year,month,day),要求：
        1.创建3个Employee放入HashSet中
        2.当name和birthday的值相同时，认为是相同员工，不能添加到HashSets集合中
        */
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee02("小明",2300,new MyDate("2020",12,3)));
        hashSet.add(new Employee02("小李",2300,new MyDate("2020",12,3)));
        hashSet.add(new Employee02("小明",2300,new MyDate("2020",12,3)));
        hashSet.add(new Employee02("小李",3900,new MyDate("2022",6,28)));
        for (Object o : hashSet) {
            System.out.println(o);
        }
    }
}

class Employee02 {
    private String name;
    private int sal;
    private MyDate birthday;

    public Employee02(String name, int sal, MyDate birthday) {
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

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
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
        return "Employee02{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee02 that = (Employee02) o;
        return Objects.equals(name, that.name) && Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}

class MyDate {
     private String year;
     private int month;
     private int day;

    public MyDate(String year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
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

    @Override
    public String toString() {
        return "MyDate{" +
                "year='" + year + '\'' +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return month == myDate.month && day == myDate.day && Objects.equals(year, myDate.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}