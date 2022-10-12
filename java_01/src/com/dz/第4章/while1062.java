package com.dz.第4章;

import java.util.Scanner;

public class while1062 {
    public static void main(String[] args) {
        double nl = 0;
        double nl1 =0;
        int age = 0;
        int i = 1;
        Scanner scanner = new Scanner(System.in);
      while (i <=10) {
          System.out.println("请输入第"+i+"位顾客的年龄：");
          i++;
          age = scanner.nextInt();
          if (age>0&&age<=30){
              nl++;
          }else if (age>30){
              nl1++;
          }
      }
         System.out.println("30岁以下的比例是"+(nl*10)+"%");
         System.out.println("30岁以上的比例是"+(nl1*10)+"%");
    }

}
