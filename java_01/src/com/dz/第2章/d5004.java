package com.dz.第2章;

import java.util.Scanner;

public class d5004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入4位会员卡号：");
        int hykh = scanner.nextInt();
        int geiwei = hykh % 10;
        int shiwei = hykh / 10 % 10;
        int baiwei = hykh / 100 % 10;
        int qianwei = hykh / 1000;
        int h =geiwei+shiwei+qianwei+baiwei;
        System.out.println("会员卡号"+hykh+"各位之和："+h);
        int xy = 20;
        boolean xy1 = h > xy;
        System.out.println("是幸运客户吗？"+xy1);
    }
}
