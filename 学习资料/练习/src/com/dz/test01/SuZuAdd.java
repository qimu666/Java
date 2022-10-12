package com.dz.test01;

import java.util.Scanner;

public class SuZuAdd {
/**
 * 数组数据扩容
 * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 2, 3};
        do {
            int[] ints = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                ints[i] = arr[i];
            }
            System.out.println("请输入添加的数:");
            int i1 = scanner.nextInt();
            ints[ints.length - 1] = i1;
            arr = ints;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " \t");
            }
            System.out.println("\n是否继续添加（y.继续 n.退出）");
            char key = scanner.next().charAt(0);
            if (key == 'n') {
                break;
            }
        } while (true);
    }

}
