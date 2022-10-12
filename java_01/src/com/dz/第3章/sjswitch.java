package com.dz.第3章;

import java.util.Scanner;

public class sjswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("________________________\n"+"欢迎使用家家超市购物管理系统！！\n"+"\t\t1.登录系统\n"+"\t\t2.退出\n"+"________________________");
        System.out.println("请输入数字：");
        int sr = scanner.nextInt();
        if (sr==1){
            System.out.println("购物管理系统\n"+"1.客户信息管理\n"+"2.购物结算\n"+"3.真情回馈\n"+"4.注消\n");
            System.out.println("请输入数字：");
            int cx =scanner.nextInt();
          switch (cx) {
              case 1:
                  System.out.println("购物管理系统>客户信息管理\n"+"1.显示所有客户信息\n"+"2.添加客户信息\n"+"3.修改客户信息\n"+"4.查询客户信息\n");
                  break;
              case 2:
                  System.out.println("购物管理系统>购物结算\n"+"1.购物结算\n"+"2.购物结算\n"+"3.购物结算\n"+"4.购物结算\n");
                  break;
              case 3:
                  System.out.println("购物管理系统>真情回馈"+"1.幸运大放送\n"+"2.幸运抽奖\n"+"3.生日问候\n");
                  break;
              case 4:
                  System.out.println("欢迎下次光临！！！");
                  break;
              default:
                  System.out.println("输入有误！！");
                  break;
          }
            System.out.println("请输入数字：");
            int cx1 =scanner.nextInt();
          switch (cx1){
              case 1:
                  System.out.println("显示所有客户信息");
                  break;
              case 2:
                  System.out.println("添加客户信息");
                  break;
              case 3:
                  System.out.println("修改客户信息");
                  break;
              case 4:
                  System.out.println("查询客户信息");
                  break;

              default:
                  System.out.println("输入有误！！");
                  int cx2 =scanner.nextInt();
                  switch (cx2) {
                      case 1:
                          System.out.println("购物结算1");
                          break;
                      case 2:
                          System.out.println("购物结算2");
                          break;
                      case 3:
                          System.out.println("购物结算3");
                          break;
                      case 4:
                          System.out.println("购物结算4");
                          break;

                      default:
                          System.out.println("输入有误！！");
                  }
                  int cx3 =scanner.nextInt();
                  switch (cx3) {
                      case 1:
                          System.out.println("幸运大放送");
                          break;
                      case 2:
                          System.out.println("幸运抽奖");
                          break;
                      case 3:
                          System.out.println("生日问候");
                          break;

                      default:
                          System.out.println("输入有误！！");
                          break;
                  }
             }
        }else if (sr==2){
            System.out.println("感谢您的使用！！");
        }else{
            System.out.println("输入有误！！");
        }
    }
}
