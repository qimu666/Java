package com.dz.第5章;

import java.util.Scanner;

public class for13801 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String m1,m2;
        for (int i =0; i<3; i++){
            System.out.println("ATM已识别银行卡");
            System.out.println("请输入6位密码：");
             m1 = scanner.next();
            System.out.println("请再次输入6位密码：");
             m2 = scanner.next();
            if ("654321".equals( m1)&& "654321".equals(m2)){
                System.out.println("欢迎登录ATM自动柜员系统！");
                break;
            }
            if (i==2){
                System.out.println("密码3次输入错误，退出程序");
            }else {
                System.out.println("密码输入错误！还剩" + (2 - i) + "次机会。");
            }

        }

    }
}
