package com.dz.zhuoye;

import java.util.Scanner;

public class jjcx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        com.dz.zhuoye.jjcx q = new com.dz.zhuoye.jjcx();
     do {
        System.out.println("请输入第一个数字");
        q.a=scanner.nextInt();
        System.out.println("请输入第二个数字");
        q.b=scanner.nextInt();
        System.out.println("请输入(加、减、乘、除)");
        q.c=scanner.next();
        q.suanfa();
         }while (true);
    }
}
