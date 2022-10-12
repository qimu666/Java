package com.dz.test01;

import java.util.Scanner;

public class FuxiTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {10, 3, 5, 6, 1, -1};
        do {
            int[] b = new int[a.length + 1];
            int[] c = new int[a.length - 1];
            System.out.println("1.添加 2.缩减");
            int sr = scanner.nextInt();
            if (sr == 1) {
                System.out.println("添加");
                int v = scanner.nextInt();
                for (int i = 0; i < a.length; i++) {
                    b[i] = a[i];
                }
                b[b.length - 1] = v;
                a = b;
            }
            if (sr == 2) {
                System.out.println("减少");
                for (int i = 0; i < a.length - 1; i++) {
                    c[i] = a[i];
                }
                a = c;
                if (c.length <= 1) {
                    System.out.println("不能再缩减了");
                    break;
                }
            }

            for (int i = 0; i < a.length; i++) {
                int max = 0;
                for (int j = 0; j < a.length - 1 - i; j++) {
                    if (a[j] > a[j + 1]) {
                        max = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = max;
                    }
                }
            }
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + " ");

            }
        } while (true);
    }

    @org.junit.Test
    public void a() {
        char[] a={'a','z','b','c'};
        char[] b=a;
        a[2]='韩';
        for (int i = 0; i < b.length; i++) {
            System.out.println(a[i]+","+b[i]);

        }
    }
}
