package com.dz.第3章;

import java.util.Scanner;

public class d64 {
    public static void main(String[] arge) {
        Scanner sr = new Scanner(System.in);
        System.out.println("请输入java成绩：");
        int java = sr.nextInt();
 //       System.out.println("请输入体育成绩: ");
 //     int ty = sr.nextInt();
 //       if ((java > 97 && ty > 85) || (java == 100 && ty > 75)) {
        if( java >97){
            System.out.println("不错奖励一只手表！");
        }else {
            System.out.println("惩罚进行编码！");
        }
    }
}
