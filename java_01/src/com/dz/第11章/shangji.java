package com.dz.第11章;

import java.util.Scanner;

public class shangji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入手机号：");
         String[] a=new String[11];
     for (int i=0;i<a.length;i++) {
         a[i] = scanner.next();
         if (a[i].length() != 11) {
             System.out.println("手机号不是11位,输入失败");
             break;
             }
             if (a[i].indexOf('1') != 0) {
                 System.out.println("手机号首位不是1，输入失败");
                 break;
             }
             if (a[i].indexOf('3') != 1 && a[i].indexOf('5') != 1 && a[i].indexOf('7') != 1) {
                 System.out.println("手机号第二位不是3、5、7，输入失败");
                 break;
             } else {
                 System.out.println("输入成功");
                 break;
         }
      }
    }
}