package com.dz.第3章;

import java.util.Scanner;

public class d67 {
    public static void main(String[] args) {
        Scanner sanner = new Scanner(System.in);
        System.out.println("请输入您有多少存款（万）：");
        int ck = sanner.nextInt();
        if (ck > 500){
            System.out.println("您可以买凯迪拉克！");
        }else if (ck > 100 ){
            System.out.println("您可以买帕萨特！");
        }else if (ck > 50 ){
            System.out.println("您可以买伊兰特！");
        }else if (ck > 10 ){
            System.out.println("您可以买奥拓！");
        }else{
            System.out.println("您可以买捷安特！");
        }
    }
}
