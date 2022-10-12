package com.dz.第3章;

import java.util.Scanner;

public class d7901 {
    public static void main(String[] arge){
     Scanner sr = new Scanner (System.in);
        System.out.println("请输入一个整数：");
        int sz = sr.nextInt();
        if (sz % 3==0||sz % 5 == 0 ){
            System.out.println("恭喜是幸运数字！");
        }else{
            System.out.println("遗憾，不是幸运数字");
        }
    }
}
