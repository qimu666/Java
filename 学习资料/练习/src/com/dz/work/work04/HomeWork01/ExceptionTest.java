package com.dz.work.work04.HomeWork01;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        /*a)接收命令行的两个参数（整数），计算两数相除。
          b)计算两个数相除，要求使用方法cal(int n1,int n2)
          c)对数据格式不正确、缺少命令行参数、除0进行异常处理。
         */
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不为2个");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cai(n1, n2);
            System.out.println("结果为"+res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("参数形式不正确");
        }catch (ArithmeticException e){
            System.out.println("出现了除数为0的错误");
        }
    }

    public static double cai(int n1, int n2) {
        return n1 / n2;
    }
}
