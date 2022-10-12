package com.dz.第3章;

import java.util.Scanner;

public class d8701 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入顾客类型：（1.会员 2.普通）");
        int lx = scanner.nextInt();
        System.out.println("请输入消费金额：");
        int xf = scanner.nextInt();
        if (lx==1 ){
            if (xf<100){
                System.out.println("无折扣");
            }else if (xf>100){
                System.out.println("9折");
            }else{
                System.out.println("会员类型输入有误！");
            }
        }
        if (lx==2){
            if (xf<200){
                System.out.println("8折");
            }else if (xf>200){
                System.out.println("7.5折");
            }else{
                System.out.println("会员类型输入有误！");
            }
        }
    }
}
