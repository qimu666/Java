package com.dz.第11章;

import java.util.Scanner;

public class d25803 {
    public static void main(String[] args) {
        System.out.print("请输入年份：");
        Scanner scanner= new Scanner(System.in);
        int year=scanner.nextInt();
        System.out.println("请选择产品类型(1.台式机 2.笔记本 3.其他)");
        int xz=scanner.nextInt();
        int a=(int)(Math.random()*1000);
        String shuchu=year+"0"+xz+a;
        System.out.println(shuchu);
    }
}
