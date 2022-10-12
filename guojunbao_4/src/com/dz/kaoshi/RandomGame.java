package com.dz.kaoshi;

import java.util.Scanner;

public class RandomGame {
    int yue=0;
    String xingming;
    public void User(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入姓名：");
        String xingming=scanner.next();
        System.out.println("请输入充值金额：");
        int chongzhi=scanner.nextInt();
        yue=chongzhi+yue;
        if (chongzhi%10==0) {              //用if判断充值金额是否为整数
            System.out.println("充值成功！当前余额为："+yue);
        }else{
            do {                              //用do-while循环操作循环充值金额不为整数的情况
                System.out.println("充值失败！请输入整数");
                chongzhi = scanner.nextInt();
                yue=0;
                yue=chongzhi+yue;
                if (chongzhi%10==0){            //用if判断充值金额是否为整数
                    System.out.println("充值成功！你的姓名为："+xingming+" 当前余额为："+yue);
                    break;
                }
            }while (true);
        }
    }
    public void Rule(){
        System.out.println("游戏规则：");
        System.out.println("1.只要你的钱够并且你愿意玩下去就可以一直游戏");
        System.out.println("2.钱不够你也可以继续充值");
        System.out.println("3.中途不想玩也可以结束游戏");
        System.out.println("4.猜一位数字");
        System.out.println("5.一局游戏10元");
        System.out.println("6.游戏奖励：猜对一局奖励20元！");
    }
    public void Game(){
        Scanner scanner=new Scanner(System.in);
        do {                                          //do-while循环游戏进行步骤
            System.out.println("请输入您猜的数字：(33-37之间)");
            int cai = scanner.nextInt();//从控制台获取猜测的数字
               if (cai<33||cai>37){
                   System.out.println("输入有误，请重新猜数：(33-37之间)");
                   cai=scanner.nextInt();
           }
            int shuiji = (int)( Math.random() * 5+33);    // 产生随机数
            System.out.println("随机数为："+shuiji);
            if (cai == shuiji) {                         //用if选择结构和嵌套if选择结构判断游戏规则
                int jl=20;
                yue = yue + jl;
                System.out.println("游戏胜利：恭喜获得"+jl+"元，余额为：" + yue);
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
            } else {// //输入的数字与随机数进行对比，当不相等时输出以下结果
                int cf=10;
                yue = yue - cf;
                System.out.println("游戏失败：您输掉"+cf+"元钱！余额为" + yue);
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
                if (yue<=0){          //if-else判断yue是否小于0；yue小于0则执行充值余额操作
                    System.out.println("余额不足，请充值！当前余额为"+yue);
                    int chongzhi=scanner.nextInt();
                    int yue=0;
                    yue=chongzhi+yue;
                    if (chongzhi%10==0) {            //用if判断充值金额是否为整数
                        System.out.println("充值成功！当前余额为："+yue);
                    }else{
                        do {                          //用do-while循环操作循环充值金额不为整数的情况
                            System.out.println("充值失败！请输入整数");
                            chongzhi = scanner.nextInt();
                            yue=0;
                            yue=chongzhi+yue;
                            if (chongzhi%10==0){       //用if判断充值金额是否为整数
                                System.out.println("充值成功！你的姓名为："+xingming+" 当前余额为："+yue);
                                break;
                            }
                        }while (true);
                    }
                }
            }
        }while (true);
    }
}
