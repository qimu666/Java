package com.dz.第8章;

import java.util.Scanner;

public class Customer1 {
    public static void main(String[] args) {
        Customer sc = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        sc.xingming =scanner.next();
        System.out.println("请输入卡类型（金/普）：");
        sc.leixing = scanner.next();
       for (int i=1;i<=2;i++){
            if (!sc.leixing.equals("金") && !sc.leixing.equals("普")) {
                System.out.println("输入有误,请输入（金/普），您还有"+(2-i)+"次机会");
            sc.leixing=scanner.next();
            } else if (i==2){
                System.out.println("您已输入错误3次，将退出程序");
                return;
            }
        }
        System.out.println("请输入积分：");
        sc.jifen=scanner.nextInt();
        if (sc.leixing.equals("金")&&sc.jifen>1000){
            sc.xitong();
            System.out.println("回馈500积分");
        }else if (sc.leixing.equals("普")&&sc.jifen>5000){
            sc.xitong();
            System.out.println("回馈500积分");
        }else{
            sc.xitong();
            System.out.println("无回馈积分");
        }
    }
}
