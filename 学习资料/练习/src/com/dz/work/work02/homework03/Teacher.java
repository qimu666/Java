package com.dz.work.work02.homework03;

public class Teacher {
    /*
    3.编写老师类
    (1)要求有属性“姓名name”,"年龄age”,“职称post”,“基本工资salary”
    (2)编写业务方法，introduce()，实现输出一个教师的信息。
    (3)编写教师类的三个子类：教授类(Professor)、副教授类、讲师类。工资级别分别为：
       教授为1.3、副教授为12、讲师类1.1。在三个子类里面都重写父类的introduce()方法。
    (4)定义并初始化一个老师对像，调用业务方法，实现对象基本信息的后台打印.
     */
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String introduce() {
        return "姓名：" + name + "\t年龄" + age + "\t职称" + post + "\t基本工资" + salary;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
