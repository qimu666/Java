package com.dz.第3章;

import java.util.Scanner;

public class d70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入比赛成绩（s）：");
        double cj = scanner.nextDouble();
        System.out.println("请输入性别：");
        String xb = scanner.next();
        if ( cj <= 10){
            if (xb.equals("男")){
                System.out.println("进入男子决赛！");
            }else if(xb.equals("女")){
                System.out.println("进入女子决赛！");
            }
        }else{
            System.out.println("淘汰！！！");
        }
    }
}
