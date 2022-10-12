package com.dz.第10章;

import java.util.Scanner;

public class shuzu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int avg=0;
        int sum=0;
        int[] scores =new int[5];
        for (int i=0;i<scores.length;i++){
            System.out.println("请输入第"+(i+1)+"名学生的成绩：");
            scores[i]=scanner.nextInt();
            sum=sum+scores[i];
            avg=sum/scores.length;
        }
        System.out.println(avg);
    }
}
