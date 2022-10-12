package com.dz.第4章;

import java.util.Scanner;

public class while108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("在线音乐播放列表");
        boolean a = false;
        do {
            System.out.println("____________");
            System.out.println("1.查看列表\n2.新增至列表\n3.从列表删除\n4.添加至'最爱'\n5.从'最爱'中退出\n6.退出列表编辑\n0.退出");
            System.out.println("请选择：");
            int sr = scanner.nextInt();
            switch (sr){
                case 1:
                    System.out.println("查看列表");
                    break;
                case 2:
                    System.out.println("新增至列表");
                    break;
                case 3:
                    System.out.println("从列表删除");
                    break;
                case 4:
                    System.out.println("添加至'最爱");
                    break;
                case 5:
                    System.out.println("从'最爱'中退出");
                    break;
                case 6:
                    System.out.println("退出列表编辑");
                    break;
                case 0:
                    System.out.println("输入0退出");
                    a = true;
                    break;
                default:
                    System.out.println("输入有误！");
                    break;
            }
        }while (!a);
    }

}
