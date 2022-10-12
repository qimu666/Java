package com.dz.第11章;

import java.util.Scanner;

public class d2590402 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        d2590401 xx=new d2590401();
        System.out.println("请输入学生姓名：");
        xx.name=scanner.next();
        System.out.println("请输入学生年龄：");
        xx.age=scanner.next();
        System.out.println("请输入学生性别：");
        xx.xingbie=scanner.next();
        System.out.println("请输入学生学校：");
        xx.xuexiao=scanner.next();
        xx.xjk();
    }
}
