package com.dz.第11章;

import java.util.Scanner;

public class d2570102 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name=scanner.next();
        System.out.println("请输入密码：");
        String password=scanner.next();
        d2570101 xx=new d2570101();
        boolean a=xx.dl(name,password);
        if (a){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }

    }
}
