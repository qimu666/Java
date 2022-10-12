package com.dz.第5章;

import java.util.Scanner;

public class for13203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nl = 18;
        int c ;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入您猜测的年龄：");
            c =scanner.nextInt();
            if ( c==nl) {
                System.out.println("猜对啦！！");
                break;
            }else if (c > nl) {
                System.out.println("猜大啦！！");
            } else  {
                System.out.println("猜小啦！！");
            }
                if (i == 2) {
                System.out.println("不好意思，您的次数已用完");
            }else{
                    System.out.println("再来一次吧！");
                }
        }
    }
}
