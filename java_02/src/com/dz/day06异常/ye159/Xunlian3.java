package com.dz.day06异常.ye159;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Xunlian3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("请输入被除数：");
            int a = scanner.nextInt();
            System.out.println("请输入除数：");
            int b = scanner.nextInt();
            System.out.println(a + "/" + b + "=" + a / b);
        } catch (InputMismatchException e) {
            System.out.println("只能输入数字！");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } finally {
            System.out.println("感谢使用");
        }
    }
}
