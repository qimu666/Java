package com.dz.第8章;

import java.util.Scanner;

public class d191401 {
    Scanner scanner=new Scanner(System.in);
    int xz,xz1,xz2;
    public void showLoginMenu(){
        System.out.println("欢迎使用超市购物管理系统");
        System.out.println("1.登录\n2.退出");
        System.out.println("******************");


    }
    public void showMainMenu(){
//        int xz=scanner.nextInt();
        System.out.println("超市购物管理系统主菜单");
        System.out.println("******************");
        System.out.println("\n1.客户信息管理\n2.真情回馈");
        System.out.println("\n******************");
        System.out.println("请选择，输入数字或按0返回上一级：");
        xz1=scanner.nextInt();
    }
    public void showCustMenu(){
        System.out.println("超市购物系统>客户信息管理");
        System.out.println("******************");
        System.out.println("1.显示所有客户信息\n2.添加客户信息\n3.修改客户信息\n4.查看客户信息");
        System.out.println("******************");
        System.out.println("请选择，输入数字或按0返回上一级：");
        xz2=scanner.nextInt();

    }
    public void showSendGMenu(){
        System.out.println("超市购物系统>真情回馈");
        System.out.println("******************");
        System.out.println("\n1.幸运大放送\n2.幸运抽奖\n3.生日问候");
        System.out.println("******************");
        System.out.println("请选择，输入数字或按0返回上一级：");
    }

}
