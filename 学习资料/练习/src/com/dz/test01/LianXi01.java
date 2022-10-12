package com.dz.test01;

import org.junit.Test;

import java.util.Scanner;

public class LianXi01 {
    public static void main(String[] args) {
//        double pay = 100000;
//        int sy = 0;
//        int ci = 0;
//        while (true) {
//            if (pay > 50000) {
//                pay = pay - (pay * 5 / 100);
//                ci++;
//            } else if (pay >= 1000) {
//                pay = pay - 1000;
//                ci++;
//            } else {
//                break;
//            }
//        }
//        System.out.println("100000可以过" + ci + "个路口，还剩" + pay);
//    }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i = scanner.nextInt();
        if (i > 0) {
            System.out.println("大于0");
        } else if (i == 0) {
            System.out.println("等于0");
        } else {
            System.out.println("小于0");
        }
    }

    /*
    输出1-100之间不能被5整除的数，每5给一行
     */
    @Test
    public void lianxi02() {
        int count = 0;//统计输出个数
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                System.out.print(i + " ");
                count++;
                //判断每满5给，就输出一个空格
                if (count % 5 == 0) {
                    System.out.println();
                }
            }

        }
    }


    /*
     *输出大写的a-z 以及Z-A
     *
     **/
    @Test
    public void lianxi03() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
    }

    /*
    求(1)+(1+2)+(1+2+3)+....+(1+2+3+..+100)的结果
     */
    @Test
    public void lianxi04() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
