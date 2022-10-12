package com.dz.work.work01;

public class Work03 {
    /*
    3.编写类Book,定义方法updatePrice,实现更改某本书的价格，
      具体：如果价格>150,则更改为150，
           如果价格>100，更改为100，
           否则不变
     */
    public static void main(String[] args) {
        Book book = new Book();
        int price = book.updatePrice(10);
        System.out.println("修改成功，当前价格为："+price);
    }
}
class Book{
    public int updatePrice(int price){
        if (price>150){
            return 150;
        }else if (price>100){
            return 100;
        }else {
            return price;
        }
    }
}
