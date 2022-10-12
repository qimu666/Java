package com.dz.集合框架.上课.练习;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String stuNo;
    private String name;
    private int score;

    public Student() {
    }

    public Student(String stuNo, String name, int score) {
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
        Student student = new Student("javaBoo5", "周杰棍", 62);
        Student student1 = new Student("javaC001", "张三", 92);
        Student student2 = new Student("javaD002", "刘德华", 93);
        Student student3 = new Student("javaF003", "陈乐鸡", 85);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student3);
        Collections.reverse(students);
        ArrayList<Student> arrayList = new ArrayList<>();
        for (Student student4 : students) {
            if (Collections.frequency(arrayList, student4) < 1) {
                arrayList.add(student4);
                if (student4.score >= 68) {
                    student4.score = student4.score + 5;
                }
                System.out.print(student4);
                if (student4.score < 70) {
                    System.out.print("\t\t没及格!");
                }
            }
        }
    }
}
