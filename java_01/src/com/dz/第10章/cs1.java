package com.dz.第10章;

import java.util.Scanner;

public class cs1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] aa = {8, 4, 2, 1, 23, 344, 12};
        int he = 0;
        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i] + " ");
            he = he + aa[i];
        }
        System.out.println("数值的和为：" + he + "\n");
        System.out.println("请输入一个数据：");
        int sr = scanner.nextInt();
        for (int i = 0; i < aa.length;i++) {
            if (sr == aa[i]) {
                System.out.println("此数列中不包含输入的数据");
                break;
            } else {
                System.out.println("此数列中包含输入的数据") ;
                break;
            }
        }
    }
}
