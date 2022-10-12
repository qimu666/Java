package com.dz.第11章;

import java.util.Scanner;

public class d2580201 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个日期(月/日/年)");
        String date=scanner.next();
        int q1=date.indexOf("/");
        int q2=date.lastIndexOf("/");
        int length=date.length();
        String month=date.substring(0,q1);
        String day =date.substring((q1+1),q2);
        String year=date.substring((q2+1),length);
        System.out.println(year+"年"+month+"月"+day+"日");
    }
}
