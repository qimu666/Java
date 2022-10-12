package com.dz.第2章;

import java.util.Scanner;

public class d40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("计算机基础的成绩是： ");
        int jsq = scanner.nextInt();
        System.out.println("Java的成绩是： ");
        int Java = scanner.nextInt();
        System.out.println("MySql的成绩是：");
        int mySql = scanner.nextInt();
        int diffen;
        double avg;
        System.out.println("——————————————————————————");
        System.out.println("计算机基础\tJava\tMySQL");
        System.out.println(jsq+"\t"+Java+"\t"+mySql);
        System.out.println("——————————————————————————");
        diffen = Java-mySql;
        System.out.println("Java和MySQL课的成绩差： "+diffen);
        avg = (jsq + Java + mySql) / 3;
        System.out.println("3门课的平均分是： "+avg);
    }
}

