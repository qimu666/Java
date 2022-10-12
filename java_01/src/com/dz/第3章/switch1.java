package com.dz.第3章;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.拨爸爸的号");
        System.out.println("2.拨妈妈的号");
        System.out.println("3.拨爷爷的号");
        System.out.println("4.拨奶奶的号");
        System.out.println("请输入：");
        int sr = scanner.nextInt();
        switch (sr){
            case 1:
                System.out.println("拨爸爸的号");
                break;
            case 2:
                System.out.println("拨妈妈的号");
                break;
            case 3:
                System.out.println("拨爷爷的号");
                break;
            case 4:
                System.out.println("拨奶奶的号");
                break;
        }
    }
}
