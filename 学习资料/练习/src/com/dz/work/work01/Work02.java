package com.dz.work.work01;

import java.util.Scanner;

public class Work02 {
    public static void main(String[] args) {
        /*
        2.编写类A02,定义方法fid,实现查找某字符串数组中的元素查找，并返回索引
          如果找不到，返回-1
         */
        String[] arr = {"小明", "小红", "小白","柒"};
        A02 a02 = new A02();
        System.out.println(a02.fid(arr));
    }
}

class A02 {
    public int fid(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的字符串");
        String sr = scanner.next();
        for (int i = 0; i < arr.length; i++) {
            if (sr.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }
}