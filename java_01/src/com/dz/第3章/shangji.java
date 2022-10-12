package com.dz.第3章;

import java.util.Scanner;

public class shangji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入消费金额：");
        double sr = scanner.nextDouble();
        double xf1 =2;
        double xf2 =3;
        double xf3 =10;
        double xf4 =20;
        if (sr>=50){
            System.out.println("是否参加换购活动：\n"+"1.满50元，加2元换购百事可乐饮料一瓶\n"+"2.满100元，加3元换购500ml可乐一瓶");
            System.out.println("3.满100元，加10元换购5公斤面粉\n"+"4.满200元，加10元可换购一个苏泊尔炒菜锅一个\n"+"5.满200元,加20元可换购欧莱雅爽肤水一瓶");
            System.out.println("0.不换购");
            System.out.println("请选择：");
           int hg = scanner.nextInt();
            switch (hg) {
                case 0:
                   System.out.println("不换购！！");
                    break;
               case 1:
                   if(sr>=100);
                   System.out.println("成功换购：百事可乐一瓶！"+(sr+2));
                    break;
               default:
                   System.out.println("消费金额不足！");
                    break;
           }
        }else if(sr>=200){
            System.out.println("是否参加换购活动：\n"+"1.满50元，加2元换购百事可乐饮料一瓶\n"+"2.满100元，加3元换购500ml可乐一瓶");
            System.out.println("3.满100元，加10元换购5公斤面粉\n"+"4.满200元，加10元可换购一个苏泊尔炒菜锅一个\n"+"5.满200元,加20元可换购欧莱雅爽肤水一瓶");
            System.out.println("0.不换购");
            System.out.println("请选择：");
            int hg2 = scanner.nextInt();
            switch (hg2) {
                case 0:
                    System.out.println("不换购！！");
                    break;
                case 1:
                    double zg1 =sr +xf1;
                    System.out.println("本次消费总金额为："+zg1);
                    System.out.println("成功换购：百事可乐一瓶！");
                    break;
                case 2:
                    double zg2 =sr +xf2;
                    System.out.println("本次消费总金额为："+zg2);
                    System.out.println("成功换购：500ml可乐一瓶！");
                    break;
                case 3:
                    double zg3 =sr +xf3;
                    System.out.println("本次消费总金额为："+zg3);
                    System.out.println("成功换：5公斤面粉！");
                    break;
                case 4:
                    double zg4 =sr +xf3;
                    System.out.println("本次消费总金额为："+zg4);
                    System.out.println("成功换购：苏泊尔炒菜锅一个！");
                    break;
                case 5:
                    double zg5 =sr +xf4;
                    System.out.println("本次消费总金额为："+zg5);
                    System.out.println("成功换购：欧莱雅爽肤水一瓶！");
                    break;
                default:
                    System.out.println("输入有误！");
                    break;
            }
        }else if (sr<50){
            System.out.println("您的消费金额未满足活动要求！！");
        } else{
            System.out.println("欢迎您下次光临！");
        }
    }
}
