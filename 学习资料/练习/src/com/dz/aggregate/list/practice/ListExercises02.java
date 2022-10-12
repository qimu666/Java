package com.dz.aggregate.list.practice;

import java.util.ArrayList;
import java.util.List;

public class ListExercises02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
       /* 使用Lst的实现类添加三本图书，并遍历，打印如下效果
        名称：XX       价格：Xx      作者：Xx
        名称: XX       价格：Xx      作者：XX
        名称：Xx        价格：Xx      作者：xx
        要球:
        1)按价格排序，从低到高（使用冒泡法）
        */
        List list = new ArrayList();
        list.add(new Book("红楼梦上", "曹雪芹", 100));
        list.add(new Book("西游记", "吴承恩", 39));
        list.add(new Book("水浒传", "施耐庵", 67));
        list.add(new Book("三国演义", "罗贯中", 10));
        list.add(new Book("红楼梦下", "曹雪芹", 300));
        bubble(list);
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void bubble(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}


class Book {
    private String name;
    private String author;
    private double price;


    public Book(String name, String author, double price) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称:" + name + "\t\t价格: " + price + "\t作者：" + author;
    }
}
