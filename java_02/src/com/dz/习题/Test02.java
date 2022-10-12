package com.dz.习题;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zj = 0;
        Set<Integer> red = new HashSet<>();
        System.out.print("红色中奖号码是:");
            for (int j = 0; j < 6; j++) {
                int random = (int) (Math.random()*33+1);
                red.add(random);
            }
            System.out.println(red);
        System.out.print("蓝色中将号码是：");
        Set<Integer> lan =new HashSet<>();
        int random1 = (int)( Math.random()*16+1);
        lan.add(random1);
        System.out.println(random1);
        System.out.println("请输入一个1-16之间的蓝色球号码");
        int lanse = scanner.nextInt();
        if (lanse==random1){
            System.out.println("蓝色球中奖了");
        }else {
            System.out.println("蓝色球未中奖");
        }
        System.out.println("请输入一个1-31之间的红色球号码");
        for (int i = 1; i <= 6; i++) {
            System.out.println("第"+i+"个红色球号码：");
            int hongshe = scanner.nextInt();
        }
    }
}
