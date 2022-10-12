package com.dz.arrays;

import java.util.Arrays;
import java.util.Comparator;

class Array {
    public static void main(String[] args) {
        /*
        案例：自定义Book类，里面包含name和price,按price排序（从大到小）。
        要求使用两种方式排序，有一个Book[]books=4本书对象
        实现Comparator接口匿名内部类，也称为定制排序。
        Book[]books = new Book[4];
        books[0]=new Book("红楼梦",100);
        books[1]=new Book("金瓶梅",90);
        books[2]=new Book("青年文摘",5);
        books[3]=new Book("java从入门到放弃",300);
         */
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 70);
        books[1] = new Book("金瓶梅", 90);
        books[2] = new Book("青年文摘", 5);
        books[3] = new Book("java从入门到放弃", 300);
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double i = book1.getPrice() - book2.getPrice();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));

        Arrays.sort(books, new Comparator() {
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
               return book1.getName().length() - book2.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));
    }

    public static void paixu(Book[] books, Comparator c) {
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅", 90);
        books[2] = new Book("青年文摘", 5);
        books[3] = new Book("java从入门到放弃", 300);

        for (int i = 0; i < books.length - 1; i++) {
            Book tmp = null;
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (c.compare(books[j].getPrice(), books[j + 1].getPrice()) > 0) {
                    tmp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = tmp;
                }
            }
        }
    }
}

class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
