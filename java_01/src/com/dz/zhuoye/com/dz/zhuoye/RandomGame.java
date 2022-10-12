package com.dz.zhuoye;

import java.util.Scanner;
public class RandomGame {
    Scanner scanner=new Scanner(System.in);
    int yue=0;//定义余额变量
    public void User(){
        System.out.println("请输入姓名：");
        String xingming=scanner.next();
          System.out.println("请输入充值金额");
          int chongzhi = scanner.nextInt();     //从控制台获取键盘输入的充值金额
             yue=chongzhi+yue;
          if (chongzhi % 10 == 0) {             //用if-else判断充值金额是否满足整数的条件
              System.out.println(xingming + ":充值成功，余额为："+yue);
          } else {
             do{
                  System.out.println("充值失败，请输入整数");
                  chongzhi = scanner.nextInt();
                  if (chongzhi % 10 == 0) {     //用if判断充值金额是否满足整数的条件
                      yue=0;
                      yue=chongzhi+yue;
                      System.out.println(xingming + ":充值成功，余额为：" + yue);
                      break;
                  }
              }while (true);
          }
    }
    public void Rule(){      //输出游戏规则
        System.out.println("猜的数字与随机数相等则为赢。\n猜的数字与随机数不相等则输。");
        System.out.println("一局游戏10元，赢一局奖励10元，输一局5元");
    }
    public void Game(){
       do {                                          //do-while循环游戏进行步骤
           System.out.println("请输入您猜的数字：(33-37之间)");
           int cai = scanner.nextInt();              //从控制台获取猜测的数字
           int shuiji = (int)( Math.random() * 5+33);//产生随机数
           System.out.println("随机数为："+shuiji);
           if (cai == shuiji) {                      //用if选择结构和嵌套if选择结构判断游戏规则
               yue = yue + 10;
               System.out.println("游戏胜利：恭喜获得10元，余额为：" + yue);
               System.out.println("是否继续游戏(y.继续 n.结束)");
               String  xz=scanner.next();             //从控制台获取是否继续游戏的选择
               if (xz.equals("y")){                   //当选择为y时，继续游戏
                   System.out.println("游戏继续，当前余额为："+yue);
               }else if (xz.equals("n")){             //选择为n时，结束游戏
                   System.out.println("游戏结束，当前余额为："+yue);
                   break;
               }else {
                   System.out.println("输入有误，请重新输入：");
                   xz=scanner.next();
               }
           } else {                                     // //输入的数字与随机数进行对比，当不相等时输出以下结果
               yue = yue - 5;
               System.out.println("游戏失败：您输掉5元钱！余额为" + yue);
               System.out.println("是否继续游戏(y.继续 n.结束)");
               String  xz=scanner.next();
               if (xz.equals("y")){                       //当选择为y时，继续游戏
                   System.out.println("游戏继续，当前余额为："+yue);
               }else if (xz.equals("n")){                  //选择为n时，结束游戏
                   System.out.println("游戏结束，当前余额为："+yue);
                   break;
               }else {
                   System.out.println("输入有误，请重新输入：");
                   xz=scanner.next();
               }
           }
       }while (true);
    }
}
