package com.dz.test01;


import org.junit.Test;

import java.util.Scanner;

public class SuZuLianXi {
    public static void main(String[] args) {
        /*
            已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，比如：
            [10,12,45,90],添加23后，数组为[10,12,23,45,90]
         */
//        Scanner scanner = new Scanner(System.in);
        int[] a = {10, 45, 12, 90};
        int b[] = new int[a.length + 1];
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[b.length - 1] = 23;
        a = b;
        for (int j = 0; j < a.length; j++)
            for (int i = 0; i < a.length - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    max = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = max;
                }
            }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }


    @Test
/*
*     随机生成10个整数(1-100的范围)保存到数组，并倒序打印以及求平均值、求最大
      值和最大值的下标、并查找里面是否有8
*
* */

    public void L02() {
        int a[] = new int[10];
        int max=a[0];
        int maxindex=0;
        int sum=0;
        int count=0;
        for (int i = 0; i < a.length; i++) {
            int b = (int) ((Math.random() * 100) + 1);
            a[i] = b;
            count+=a[i];
            if (max<a[i]){
                max=a[i];
                maxindex=i;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println("\n倒叙:");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        sum=count/10;
        System.out.println("\n平均值为:"+sum);
        System.out.println("最大值为："+max +"下标为:"+maxindex);

        System.out.println("总数为："+count);
           int findNum=8;
           int index=-1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == findNum) {
                System.out.println("存在8");
                index=i;
            }
            if (index==-i){
                System.out.println("不存在8");
            }
        }
    }
}
