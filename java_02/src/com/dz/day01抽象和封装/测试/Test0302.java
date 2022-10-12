package com.dz.day01抽象和封装.测试;

import java.util.Scanner;

public class Test0302 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Test0301 text3 =new Test0301();
        System.out.println("请输入姓名");
        text3.name=scanner.next();
        System.out.println("请输入年龄：");
        text3.age=scanner.nextInt();
        text3.show();
    }
}
