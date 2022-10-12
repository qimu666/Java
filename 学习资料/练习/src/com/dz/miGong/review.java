package com.dz.miGong;

public class review {
    public static void main(String[] args) {
        int[][] arr = new int[8][7];
        for (int i = 0; i <= 7; i++) {
            arr[i][0] = 1;
            arr[i][6] = 1;
        }
        for (int i = 0; i <= 6; i++) {
            arr[0][i] = 1;
            arr[7][i] = 1;
        }
        arr[3][1] = 1;
        arr[3][2] = 1;
        arr[3][3] = 1;
        arr[3][4] = 1;
        arr[2][4] = 1;
//        arr[1][4] = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        B b = new B();
        b.migong(arr,1,1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

class B {
    public boolean migong(int[][] arr, int i, int j) {
        if (arr[6][5] == 2) {
            return true;
        } else if (arr[i][j] == 0) {
            arr[i][j] = 2;
            if (migong(arr, i+1 , j)) {//об
                return true;
            } else if (migong(arr, i, j + 1)) {//ср
                return true;
            } else if (migong(arr, i - 1, j)) {//ио
                return true;
            } else if (migong(arr, i, j - 1)) {//вС
                return true;
            } else {
                arr[i][j] = 3;
                return false;
            }
        } else {
            return false;
        }
    }
}
