package com.dz.第2章;

import java.util.Scanner;

public class d4903 {
    public static void main(String[] arge){
        Scanner scanner = new Scanner(System.in);
        double tdj=50;
        double pdj=80;
        double xdj = 200;
        int sl = 1;
        System.out.println("请输入折扣： ");
        double zk = scanner.nextDouble();
        double z = 100;
        double tzk =sl*tdj*zk;
        boolean t1 = tzk<z;
        System.out.println("T恤折扣价格低于100吗？"+t1);
        double xzk =sl*xdj*zk;
        boolean x1 = xzk<z;
        System.out.println("网球鞋折扣价低于100吗？"+x1);
        double pzk = sl*pdj*zk;
        boolean p1 = pzk<z;
        System.out.println("网球拍折扣价低于100吗？"+p1);
        }
    }
