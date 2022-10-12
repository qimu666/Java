package dz.Test03;

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        UnderGraduate underGraduate = new UnderGraduate();
        Graduate graduate = new Graduate();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择您的学历：(1.本科 2.研究生)");
        int sr = scanner.nextInt();
        if (sr == 1) {
            System.out.println("请选择您的操作：1.登录 2.注销");
            int i = scanner.nextInt();
            if (i == 1) {
                System.out.println("请输入您的学号：");
                underGraduate.setId(scanner.nextInt());
                System.out.println("请输入您的姓名：");
                underGraduate.setName(scanner.next());
                System.out.println("请输入您的班级：");
                underGraduate.setClassName(scanner.next());
                underGraduate.logln();
            } else if (i == 2) {
                underGraduate.clearOut();
            } else {
                System.out.println("请选择正确的操作！");
            }
        } else if (sr == 2) {
            System.out.println("请选择您的操作：1.登录 2.注销");
            int q = scanner.nextInt();
            if (q == 1) {
                System.out.println("请输入您的学号：");
                graduate.setId(scanner.nextInt());
                System.out.println("请输入您的姓名：");
                graduate.setName(scanner.next());
                System.out.println("请输入您的班级：");
                graduate.setClassName(scanner.next());
                graduate.logln();
            } else if (q == 2) {
                graduate.clearOut();
            } else {
                System.out.println("请选择正确的操作！");
            }

        } else {
            System.out.println("输入有误！");
        }

    }
}
