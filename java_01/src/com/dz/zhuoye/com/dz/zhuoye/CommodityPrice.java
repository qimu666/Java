package com.dz.zhuoye;

import java.util.Scanner;

public class CommodityPrice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("人数为：");
        int renshu=scanner.nextInt();  //从控制台获取键盘输入的人数
        System.out.println("商品数量为：");
        int shangpin=scanner.nextInt();//从控制台获取键盘输入的商品数量
        System.out.println("商品价格为：");
        int jiage=scanner.nextInt();   //从控制台获取键盘输入的商品价格
        int zj=renshu*shangpin*jiage;  //计算消费金额
        System.out.println("总共花费"+zj+"元");
        int hd=2000;                   //定义抽奖活动金额为2000元
        int[] a = new int[5];          //定义5位数组
        if (zj>hd) {                 //用if选择结构判断消费金额是否满足抽奖活动金额
            System.out.println("您的消费金额超过2000元，可以参加抽奖活动");
            for (int i = 0; i < a.length; i++) {                    //循环输出数组
                a[i] = (int) (Math.random() * (63 - 27 + 1) + 27);  //获取随机数
                System.out.print("抽奖结果为：" + a[i] + " ");
                if (a[i]==37|| a[i]==62) {                          //用if-else选择结构判断中的奖品类别
                    System.out.println("恭喜您中了一等奖");
                } else if (a[i]==39 || a[i]==49 || a[i]==59) {
                    System.out.println("恭喜您中了二等奖");
                } else {
                    System.out.println("很遗憾没有中奖");
                }
            }
            System.out.print("\n最终抽奖结果为：");
            for (int i=0;i<a.length;i++){              //用for循环输出数组随机数抽奖结果
                System.out.print(a[i]+" ");
            }
            }else{
            System.out.println("您的消费金额不足,还差"+(hd-zj+0.01)+"元可以参加活动");
        }

    }
}
