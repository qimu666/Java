package com.dz.习题;

import java.util.*;

public class Student {
    private int sid;
    private String name;
    private String age;

    public Student() {
    }

    public Student(int sid, String name, String age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String toString() {
        return sid + "\t" + name + "\t" + age;
    }

    public static void add(ArrayList<Student> list, Scanner scanner) {
        Student student = new Student();
        System.out.println("请输入学生学号：");
        student.setSid(scanner.nextInt());
        System.out.println("请输入学生姓名：");
        student.setName(scanner.next());
        System.out.println("请输入学生年龄：");
        student.setAge(scanner.next());
        list.add(student);
        System.out.println("添加成功");

    }

    public static void shan(ArrayList<Student> list, Scanner scanner) {
        System.out.println("请输入你需要删除的学生编号：");
        int i = scanner.nextInt();
        for (int j = 0; j < list.size(); j++) {
            Student student = list.get(j);
            if (i == student.getSid()) {
                list.remove(j);
                System.out.println("删除成功");
            } else if (i != student.getSid()) {
                System.out.println("没有该学生！无法删除！");
            }
        }
    }

    public static void gai(ArrayList<Student> list, Scanner scanner) {
        System.out.println("请输入你需要修改的学生编号：");
        int i = scanner.nextInt();
        for (int j = 0; j < list.size(); j++) {
            Student student = list.get(j);
            if (i == student.getSid()) {
                list.remove(j);
                System.out.println("删除成功");
            } else if (i != student.getSid()) {
                System.out.println("没有该学生！无法修改！");
            }
            Student student1 = new Student();
            System.out.println("请输入学生学号：");
            student1.setSid(scanner.nextInt());
            System.out.println("请输入学生姓名：");
            student1.setName(scanner.next());
            System.out.println("请输入学生年龄：");
            student1.setAge(scanner.next());
            list.add(student1);
            System.out.println("添加成功");
        }
    }

    public static void gai2(ArrayList<Student> list, Scanner scanner) {
        Student student = new Student();
        System.out.println("请输入您要修改的学生学号");
        int i = scanner.nextInt();
        System.out.println("请输入修改后学生学号：");
        student.setSid(scanner.nextInt());
        System.out.println("请输入修改后学生姓名：");
        student.setName(scanner.next());
        System.out.println("请输入修改后学生年龄：");
        student.setAge(scanner.next());
        for (int j = 0; j < list.size(); j++) {
            Student student1 = list.get(j);
            if (i == student1.getSid()) {
                list.set(j, student);
                System.out.println("修改成功");
            }
        }
    }

    public static void find(ArrayList<Student> list) {
        System.out.println("查看成功");
        System.out.println("学号" + "\t姓名" + "\t年龄");
        for (Student student : list) {
            System.out.println(student);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        do {
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请输入你的选择：");
            int xuanzhe = scanner.nextInt();
            if (xuanzhe == 1) {
                add(list, scanner);
            } else if (xuanzhe == 2) {
                shan(list, scanner);
            } else if (xuanzhe == 3) {
                gai2(list, scanner);
            } else if (xuanzhe == 4) {
                find(list);
            } else if (xuanzhe == 5) {
                System.out.println("退出成功");
                return;
            } else {
                System.out.println("输入有误");
            }
        } while (true);
    }
}
