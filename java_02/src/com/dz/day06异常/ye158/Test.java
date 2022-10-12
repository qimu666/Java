package com.dz.day06异常.ye158;

import java.util.Scanner;

public class Test {
    private String name;
    private String sex;
    private int age;

    public void SetAge(int age) throws Exception {
        if (age < 1 || age > 50) {
            throw new Exception("输入的年龄不在1-50岁之间");
        } else {
            this.age = age;
        }
    }

    public void Print(String sex) throws Exception {
        if (sex.equals("男") || sex.equals("女")) {
            this.sex = sex;
        } else {
            throw new Exception("请输入性别男/女");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Test test = new Test();
        System.out.println("请输入姓名");
        test.name = scanner.next();
        System.out.println("请输入性别：");
        try {
            test.Print(scanner.next());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("请输入年龄");
        try {
            test.SetAge(scanner.nextInt());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
