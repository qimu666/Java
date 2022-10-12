package com.dz.第4章;

import java.util.Scanner;

public class while107 {
    public static void main(String[] args) {
        System.out.println("***查询界面***");
        System.out.println("1.优盘（64）个\n2.MBP笔记本\n3.云空间（1核2G/年）");
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit){
            System.out.println("请输入询价商品编号：");
            int sr = scanner.nextInt();
            switch(sr){
                case 1:
                    System.out.println("优盘（64G）价格：48元");
                    break;
                case 2:
                    System.out.println("MBP笔记本价格：12000元");
                    break;
                case 3:
                    System.out.println("云空间（1核2G/年）价格：48元");
                    break;
                case 0:
                        System.out.println("输入0退出");
                        quit=true;
                        break;
                default:
                    System.out.println("输入有误！无商品编号。");
            }
        }
    }
}
