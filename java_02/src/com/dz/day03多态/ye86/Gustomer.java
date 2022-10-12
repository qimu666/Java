package com.dz.day03多态.ye86;

public class Gustomer extends Gun {
   int sum=0;
   int day;
   public int amount(int day, int pay) {
      return day * pay;
   }

   public int getDay() {
      return day;
   }

   public void setDay(int day) {
      this.day = day;
   }

   public void print() {
      System.out.println("客户名路飞--使用天数"+getDay());
      System.out.print("总金额是：" + sum);
   }
}
