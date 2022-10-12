package com.dz.第2章;

import java.util.Scanner;

public class zhuanhuan {
    public static void main(String[] arge){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入张三的成绩： ");
        int zhangsan =scanner.nextInt();
        int lisi =80;
        boolean big=zhangsan>lisi;
        System.out.println("张三的成绩比李四的成绩高吗？"+big);

    }
}
