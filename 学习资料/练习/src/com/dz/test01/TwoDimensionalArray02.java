package com.dz.test01;

import org.junit.Test;

public class TwoDimensionalArray02 {
    /*
   int arr[][]={{4,6},{1,4,5,7},{-2}};
   遍历数组并求和
    */
    public static void main(String[] args) {
        int arr[][] = {{4, 6}, {1, 4, 5, 7}, {-2}};
        int sum = 0;
        System.out.println("遍历：");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("和为" + sum);
    }

    /*
    杨辉三角10行
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
    1 5 1010 5 1

    */
    @Test
    public void YangHui() {
        int[][] yanghui = new int[10][];
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            for (int j = 0; j < yanghui[i].length; j++) {
                if (j == 0 || j == yanghui[i].length - 1) {
                    yanghui[i][j] = 1;
                } else {
                    yanghui[i][j] = yanghui[i - 1][j] + yanghui[i - 1][j - 1];
                }
            }
        }
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //be ,blue,1,3,6,  4,
}
