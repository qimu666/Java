package com.dz.test01;

import java.util.Scanner;

public class SuZuReDuce {
    /**
     * 数组数据缩减
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        do {
            int[] b = new int[arr.length - 1];
            for (int i = 0; i < arr.length-1;i++) {
                b[i] = arr[i];
            }
            arr = b;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
                if (arr.length<=1){
                    System.out.println("不能缩减了!!!");
                    return;
                }
            }
            System.out.println("是否继续y/n:");
            char key = scanner.next().charAt(0);
            if (key == 'n') {
                break;
            }
        } while (true);
    }
}
