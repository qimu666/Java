package com.dz.第3章;

import java.util.Scanner;

public class d8104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("在线音乐播放列表\n"+"-------------\n"+"1.查看列表\n"+"2.新增至列表\n"+"3.从列表删除\n"+"4.添加至'最爱'\n"+"5.从'最爱'中删除\n"+"6.退出列表框\n");
        System.out.println("--------------");
        System.out.println("请选择：");
        int xh = scanner.nextInt();
        switch (xh){
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
                System.out.println("添加至'最爱'");
                break;
            case 5:
                System.out.println("从'最爱'中删除");
                break;
            case 6:
                System.out.println("退出列表框");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
