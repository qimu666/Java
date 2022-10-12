package com.dz.集合框架.上课;

import java.util.LinkedList;

public class LinkedListTest {
    private String stuNo;
    private String name;
    private int score;

    public LinkedListTest() {
    }

    public LinkedListTest(String stuNo, String name, int score) {
        this.stuNo = stuNo;
        this.name = name;
        this.score = score;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String toString() {
        return "\n学号:" + stuNo +
                "\t姓名：" + name +
                "\t分数：" + score;
    }

    public static void main(String[] args) {
        LinkedListTest student = new LinkedListTest("javaBoo5", "周杰棍", 62);
        LinkedListTest student1 = new LinkedListTest("javaC001", "张三", 92);
        LinkedListTest student2 = new LinkedListTest("javaD002", "刘德华", 93);
        LinkedListTest student3 = new LinkedListTest("javaF003", "陈乐鸡", 85);
        LinkedList linkedList = new LinkedList<>();
        linkedList.add(student);
        linkedList.add(student2);
        linkedList.add(student3);
        linkedList.add(student1);
        for (Object o : linkedList) {
            System.out.print(o);
        }
    }
}
