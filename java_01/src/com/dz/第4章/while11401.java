package com.dz.第4章;

import java.util.Scanner;

public class while11401 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入该班级的学员总数：");
        int zs = scanner.nextInt();
        int zh=0;
        int i = 1;
        int cj ;
        double  avg;
        while (i<=zs){
            System.out.println("请输入第"+i+"位学员成绩：");
            cj=scanner.nextInt();
            i++;
            zh=zh+cj;


        }
        avg = zh/zs;
        System.out.println("平均成绩为"+avg);
    }
}