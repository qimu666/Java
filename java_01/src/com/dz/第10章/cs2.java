package com.dz.第10章;

import java.util.Scanner;

public class cs2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] jg =new int[4];
        int zd=0;
        zd=jg[0];
        for (int i=0;i<jg.length;i++) {
            System.out.println("第" + (i + 1) + "家店的价格：");
            jg[i] = scanner.nextInt();
        }
        zd=jg[0];
        for (int i=0;i<jg.length;i++){
            if (jg[i]<zd){
                zd=jg[i];
            }
        }
        System.out.println("最低价格为"+zd+"元");
    }
}
