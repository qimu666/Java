package com.dz.test01;

import java.util.Scanner;

public class PaiXu {
    /**
     * 冒泡排序
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {21, 200, 23};
        /*
        1.
               21,23,60,31,46,-1
               21,23,60,31,46,-1
               21,23,31,60,46,-1
               21,23,31,46,60,-1
               21,23,31,46,-1,60
        2.
               21,23,31,46,-1,60
               21,23,31,46,-1,60
               21,23,31,46,-1,60
               21,23,31,46,-1,60
               21,23,31,-1,46,60
         3.
               21,23,31,-1,46,60
               21,23,31,-1,46,60
               21,23,-1,31,46,60
         4.
               21,23,-1,31,46,60
               21,-1,23,31,46,60
         5.
               -1,21,23,31,46,60
         */


        //添加数据使用1
        do {
            int[] b = new int[a.length + 1];
            int[] c = new int[a.length - 1];
            System.out.println();
            try {
                System.out.println("请输入您的操作：（1.增加数据 2.减少数据）");
                int i2 = scanner.nextInt();
            if (i2 == 1) {
                System.out.println("请输入您要添加的数据:");
                int i1 = scanner.nextInt();
                for (int j = 0; j < a.length; j++) {
                    b[j] = a[j];
                }
                b[b.length - 1] = i1;
                a = b;
            } else if (i2 == 2) {
                for (int i = 0; i < a.length - 1; i++) {
                    c[i] = a[i];
                }
                a = c;
                System.out.println("执行成功");
                if (c.length <= 1) {
                    System.out.println("不能再缩减了!!!");
                    return;
                }
            } else {
                System.out.println("输入有误！请重新输入您的操作：（1.增加数据 2.减少数据）");
                continue;
            }
            }catch (Exception e){
                System.out.println("请输入正确的数据或操作！！！");
                return;
            }
            //1 冒泡排序
            for (int i = 0; i < a.length-1; i++) {
                int tmp = 0;//定义tmp变量临时存储最大数
                for (int j = 0; j < a.length - 1 - i; j++) {//a.length-1是比较多少次-i是循环
                    if (a[j] > a[j + 1]) {//当a[0]>a[1]时执行
                        tmp = a[j];       //a[0]的值赋给临时变量tmp中
                        a[j] = a[j + 1];  //a[1]的值赋给a[0];
                        a[j + 1] = tmp;   //再把tmp中a[0]的值赋给a[1];达成交换位置的效果
                    }
                }
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            do {
                System.out.println();
                System.out.println("是否继续添加（y.继续 n.退出）");
                char key = scanner.next().charAt(0);
                if (key == 'n') {
                    break;
                } else if (key == 'y') {
                    break;
                } else {
                    System.out.println("输入有误");
                    break;
                }
            }while (true);
        } while (true);
    }
}
