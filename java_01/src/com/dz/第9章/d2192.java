package com.dz.第9章;

import java.util.Scanner;

public class d2192 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***欢迎进入注册系统***\n");
        boolean sfz1=false;
        boolean sjh1=false;
        boolean zjh1=false;
        do {
            System.out.println("请输入身份证：");
            String sfz = scanner.next();
            System.out.println("请输入手机号：");
            String sjh = scanner.next();
            System.out.println("请输入座机号：");
            String zjh=scanner.next();
//            if (sfz.length() == 15 || sfz.length() == 18 && sjh.length() == 11 && zjh.indexOf('-')==4 && zjh.length()==12){
//                System.out.println("注册成功");
//                break;
//            }
            if (sfz.length() != 15 || sfz.length() != 18) {
                System.out.println("身份证号必须是15位或者18位！");
            }
            if (sjh.length() != 11) {
                System.out.println("手机号必须是11位！");
            }
            if (zjh.indexOf('-')!=4 && zjh.length()!=12){
            System.out.println("座机号区域号必须为4位，电话号码必须为7位");
            }else{
                System.out.println("注册成功");
                break;
            }
        } while (true);
    }
}