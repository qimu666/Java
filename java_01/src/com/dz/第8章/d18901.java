package com.dz.第8章;

//import jdk.nashorn.internal.parser.Scanner;

import java.util.Scanner;

public class d18901 {
    Scanner scanner=new Scanner(System.in);
   double money;
   double cun;
   double qu;
   int xz;
    public void menu(){
        System.out.println("***********");
        System.out.println("\t1.存款\n\t2.取款\n\t3.退出");
        System.out.println("***********");
        System.out.println("请选择你要执行的操作：");
        xz=scanner.nextInt();
    }
    public void save(){
        System.out.println("请输入存款余额：");
        cun=scanner.nextDouble();
       if (cun%100!=0) {
           System.out.println("不能存零钱！");
       }else{
           money=cun+money;
           System.out.println("存款成功，账户余额为"+money);
       }
    }
    public void get(){
        System.out.println("请输入取款余额：");
        qu=scanner.nextDouble();
        if (qu%100!=0){
            System.out.println("不能取零钱");
        }else if (qu>money){
            System.out.println("余额不足！");
        }else{
            money=money-qu;
            System.out.println("取款成功，账户余额为"+money);
        }
    }

}
