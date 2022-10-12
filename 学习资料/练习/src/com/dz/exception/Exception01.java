package com.dz.exception;

public class Exception01 {
    //异常
    public static void main(String[] args) {
        int  a=10;
        int b=0;
        try {
            int i = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("程序继续执行");
        }
    }
}
