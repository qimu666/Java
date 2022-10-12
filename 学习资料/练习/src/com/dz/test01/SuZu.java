package com.dz.test01;

import org.junit.Test;

import java.util.Scanner;

public class SuZu {
    /**
     * 创建一个char类型的26个元素数组，分别放置‘A’-'Z'.
     * 使用for循环遍历打印出来。提示：‘A’+1=‘B’
     */
    public static void main(String[] args) {
        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('A' + i);//需要强转类型
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            System.out.print(" ");
        }
    }

    /**
     * 求数组最大值
     **/
    @Test
    public void SuZu02() {
        int[] a = {4, -1, 9, 10, 23};
        int max = a[0];//假设第一个数为最大值
        int maxIndex = 0;
        for (int i = 1; i < a.length; i++) {//从下标1开始遍历数组
            if (max < a[i]) {//如果max<当前元素
                max = a[i];   //把当前元素替换给max
                maxIndex = i;
            }
        }
        System.out.println("最大值=" + max + "下标为=" + maxIndex
        );
    }
    /*
    * 数组交换
    *
    * */

    @Test
    public void FanZuan() {
        int[] a = {4, -1, 9, 10, 23, 45};
        //             a.length/2是要交换3次
        int JiaoHuan = 0;
        for (int i = 0; i < a.length / 2; i++) {
            JiaoHuan = a[a.length - 1 - i];//a[5]的值保存到变量JiaoHuan
            a[a.length - 1 - i] = a[i];//把a[0]的值赋给a[5];达成交换
            a[i] = JiaoHuan;//把数组a[5]的值(45)赋给a[0]{第一次循环开始},；
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    @Test
    public void FanZuan02() {
        int[] a = {4, -1, 9, 10, 23, 45};
        int[] b = new int[a.length];
        for (int i = a.length - 1, j = 0; i >= 0; j++, i--) {
            b[j] = a[i];
        }
        a = b;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
