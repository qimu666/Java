package com.dz.work.work02.homework01;

public class Test {
    public static void main(String[] args) {
        /*
    1.定义一个Person类{name,age,job以，初始化Person对像数组，有3个person对像，并
    按照age从大到小进行排序，提示，使用冒泡排序
     */
        Person[] persons = new Person[3];
        persons[0] = new Person("jake", 20, "医生");
        persons[1] = new Person("mali", 98, "java");
        persons[2] = new Person("ming", 56, "c语言");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
        Person tem=null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j+1].getAge()) {
                    tem=persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1]=tem;
                }
            }
        }
        System.out.println("_________________");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }
}
