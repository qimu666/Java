package com.dz.第8章;

import java.util.Scanner;

public class sj02 {
    public static void main(String[] args) {
        sj01 fs =new sj01();
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入Java成绩：");
        fs.java=scanner.nextInt();
        System.out.println("请输入c#成绩：");
        fs.c=scanner.nextInt();
        System.out.println("请输入DB成绩：");
        fs.db=scanner.nextInt();
        int zcj=fs.c+fs.java+ fs.db;
        System.out.println("总成绩为："+zcj);
        double pjf =zcj/3;
        System.out.println("平均分为："+pjf);
    }
}
