package com.dz.第10章;

import java.util.Scanner;

public class sj1 {
    Scanner scanner=new Scanner(System.in);
    int avg=0;  //定义平均分
    int cj=0;  //定义成绩
    public void chengji(){
        int[] scores =new int[5]; //创建scores数组
        for (int i=0;i<scores.length;i++){
            System.out.println("请输入"+(i+1)+"位学生成绩：");
            scores[i]=scanner.nextInt();
            cj=cj+scores[i];//求总成绩
            avg=cj/scores.length;//求平均分
        }
        System.out.println("总成绩为："+cj);//输出总成绩
        System.out.println("平均分为："+avg);//输出平均分
    }
}
