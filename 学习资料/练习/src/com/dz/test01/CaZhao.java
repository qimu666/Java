package com.dz.test01;

import java.util.Scanner;

public class CaZhao {
    public static void main(String[] args) {
        String[] a = {"金毛狮王", "白眉鹰王", "紫衫龙王", "轻易父王"};
        int index = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("请输入名字");
            String next = scanner.next();
            for (int i = 0; i < a.length; i++) {
                if (next.equals(a[i])) {//字符串比较用equals
                    System.out.println("存在");
                    index = i;
                    System.out.println(i);
                    break;
                }
            }
            if (index == -1) {
                System.out.println("不存在");
            }
        }while (true);
    }
}
