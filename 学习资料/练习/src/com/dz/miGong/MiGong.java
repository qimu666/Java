package com.dz.miGong;

public class MiGong {
    public static void main(String[] args) {
        int[][] arr = new int[8][7];
        //打印障碍物 第1列和第7列为1
        for (int i = 0; i <= 7; i++) {
            arr[i][0] = 1;
            arr[i][6] = 1;
        }
        //打印障碍物 第1行和第8行为1
        for (int i = 0; i <= 6; i++) {
            arr[0][i] = 1;
            arr[7][i] = 1;
        }
        //额外障碍物
        arr[3][1] = 1;
        arr[3][2] = 1;
        arr[2][2] = 1;
        //绘制地图
        System.out.println("原地图");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        A a = new A();
        a.Migong(arr, 1, 1);
        System.out.println("______________________");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class A {
    public boolean Migong(int[][] arr, int i, int j) {
        //当小球走到坐标6,5时，将退出程序。
        if (arr[6][5] == 2) {
            return true;
        } else {
            //假设可以走，并在原地打印为2
            if (arr[i][j] == 0) {
                arr[i][j] = 2;
                //根据 下>右>上>左 的策略走
                if ((Migong(arr, i + 1, j))) {
                    return true;
                } else if ((Migong(arr, i, j + 1))) {
                    return true;
                } else if ((Migong(arr, i - 1, j))) {
                    return true;
                } else if ((Migong(arr, i, j - 1))) {
                    return true;
                } else {
                    //根据 下>右>上>左 的策略走不通，代表是死路，并标记为3，进行回溯。
                    arr[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}