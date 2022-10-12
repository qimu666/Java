package com.dz.test01;

public class TwoDimensionalArray01 {
    /*
    二维数组:
    输出图形
      1,2,3,4,5,6
      6,5,4,3,2,1
      2,3,4,5,6,7
      8,9,7,6,5,4
    * */
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4, 5, 6},
                     {6, 5, 4, 3, 2, 1},
                     {2, 3, 4, 5, 6, 7},
                     {8, 9, 7, 6, 5, 4}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
