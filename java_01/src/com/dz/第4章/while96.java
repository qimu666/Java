package com.dz.第4章;

import java.util.Scanner;

public class while96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("合格了吗？（y/n）: ");
        String sr ;
        sr = scanner.next();
        while (!"y".equals(sr)){
            System.out.println("上午阅读教程\n"+"下午上机练习");
             sr = scanner.next();
        }
        System.out.println("完成学习任务！");
    }
}
