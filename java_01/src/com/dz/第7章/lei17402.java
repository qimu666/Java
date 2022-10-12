package com.dz.第7章;

import java.util.Scanner;

public class lei17402 {
    public static void main(String[] args) {
       lei17401 xx = new lei17401();
        Scanner scanner=new Scanner(System.in);
        System.out.println("入场收费开始....");
        for (int i=0;i<99999;i++) {
            System.out.println("\n姓名：");
            String sr1 = scanner.next();
            System.out.println("年龄：");
            int sr2 = scanner.nextInt();
            xx.xm = sr1;
            xx.nl = sr2;
            xx.xinxi();
            if (sr2>60||sr2<18){
                System.out.print("免费进园");
            }else if (xx.nl<=60||xx.nl>=18){
                System.out.print("门票价格：20元\n");
            }
            System.out.println("\n下一位游客继续？（y/n）");
            String sr3 =scanner.next();
          if (sr3.equals("y")){
              System.out.println("入场继续收费");
          }else if (sr3.equals("n")){
              System.out.println("入场收费结束！");
              break;
          }else{
              for (int l=1;l<=2;l++){
              System.out.println("输入有误，请输入y/n");
              sr3=scanner.next();
                  System.out.println("输入有误，再输错"+(2-l)+"次将退出程序");
              if (sr3.equals("n")){
                  System.out.println("入场收费结束！");
                      return;
              }else if (sr3.equals("y")) {
                  System.out.println("入场继续收费");
                 }
                  if (l==2) {
                      System.out.println("您已输错3次，将退出程序");
                      return;
                  }
              }
           }
        }
    }
}
