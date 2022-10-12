package com.dz.第5章;

import java.util.Scanner;

public class sj {
    public static void main(String[] args) {
        String zh;
        String mm;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账号");
            zh = scanner.next();
            System.out.println("请输入密码");
            mm = scanner.next();
            if ("qimu".equals(zh) && "123456".equals(mm)) {
                System.out.println("登录成功");
                break;
            }
            if (i == 2) {
                System.out.println("已3次输入有误，退出程序");
            }else{
                System.out.println("登录失败,还有"+(2-i)+"次机会");
            }
        }
    }
}