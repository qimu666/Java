package com.dz.第2章;

import java.util.Scanner;

public class d4801 {
    public static void main(String[] arge) {
        Scanner cj = new Scanner(System.in);
        System.out.println("请输入T恤数量： ");
        int t =cj.nextInt();
        System.out.println("请输入网球鞋数量： ");
        int x = cj.nextInt();
        System.out.println("请输入网球拍数量： ");
        int p = cj.nextInt();
        System.out.println("请输入T恤价格： ");
        int tj =cj.nextInt();
        System.out.println("请输入网球鞋价格： ");
        int xj = cj.nextInt();
        System.out.println("请输入网球拍价格： ");
        int pj = cj.nextInt();
        System.out.println("正在为您出票，请稍等......");
        System.out.println("  ******消费凭据******\n "+"购买物品"+"  单价"+"  个数"+"  金额");
        System.out.print(" T恤 " +"    "+tj);
        System.out.print("     "+t);
        int je=tj*t;
        System.out.println("    "+je);
        System.out.print(" 网球鞋：  "+xj);
        System.out.print("    "+x);
        int jex= x*xj;
        System.out.println("   "+jex);
        System.out.print(" 网球拍： " +"  "+pj);
        System.out.print("    "+p);
        int jep = pj*p;
        System.out.println("   "+jep);
        System.out.println("************************");
        int zj = je+jex+jep;
        System.out.println(" 总价："+zj);
    }
}
