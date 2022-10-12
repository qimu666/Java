package com.dz.第9章;

import java.util.Scanner;

public class d21702 {
    public static void main(String[] args) {
        d217 hy =new d217();
        Scanner scanner =new Scanner(System.in);
        System.out.println("***欢迎进入注册系统***\n");
       do {
         System.out.println("请输入用户名：");
         hy.yhm = scanner.next();
         System.out.println("请输入密码：");
         hy.mima = scanner.next();
         System.out.println("请再次输入密码：");
         hy.mima1 = scanner.next();
         if (hy.yhm.length()>=3&&hy.mima.length()>=6&&hy.mima1.equals(hy.mima)){
             System.out.println("注册成功！请牢记用户名和密码！");
             break;
         }else if (!hy.mima1.equals(hy.mima)){
             System.out.println("注册失败，两次输入的密码不相同");
         } else{
             System.out.println("用户名长度不能小于3，密码长度不能小于6！");
//             continue;
         }
       }while (true);
    }
}
