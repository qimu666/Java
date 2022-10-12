package com.dz.day06异常.ye157;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书的编号");
        try{
            int a=scanner.nextInt();
            if (a==1){
                System.out.println("JAVA程序开发初级教程");
            }else if (a==2){
                System.out.println("原型图设计");
            }else if (a==3){
                System.out.println("JAVA核心技术");
            }else if (a<1||a>3){
                System.out.println("输入有误请，输入数字编号(1~3)");
            }
        }catch (InputMismatchException e){
            System.out.println("请输入数字编号(1~3)");
        }finally {
            System.out.println("欢迎您的参与");
        }
    }
}
