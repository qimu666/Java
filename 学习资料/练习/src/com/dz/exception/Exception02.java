package com.dz.exception;

import java.util.Scanner;

public class Exception02 {
    public static void main(String[] args) {
        // 如果用户输入的不是一个整数，就提示他反复输入，直到输入一个整数为止
        boolean bool = true;
        while (bool) {
            System.out.println("请输入一个整数");
            Scanner scanner = new Scanner(System.in);
            try {
                int i = scanner.nextInt();
                bool = false;
            } catch (Exception e) {
                System.out.println("输入的不是整数请重新输入");
            }
        }
        System.out.println("输入的是一个整数");
    }
}
