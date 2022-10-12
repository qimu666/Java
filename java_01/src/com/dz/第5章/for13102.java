package com.dz.第5章;

import java.util.Scanner;

public class for13102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zf =0;
        for (int i =1; i<=5;i++) {
            System.out.println("请输入第" + i + "次射击得分：");
            int zg = scanner.nextInt();
            zf+=zg;
            if (zf  >= 40 && i <=4) {
                System.out.println("提前通过预选！！");
                return;
            }
        }
            if(zf>=40){
                System.out.println("通过预选");

            }else{
                System.out.println("成绩不合格"); 
            }
    }
}
