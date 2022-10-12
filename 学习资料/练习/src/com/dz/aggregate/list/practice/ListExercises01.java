package com.dz.aggregate.list.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercises01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        /*
        添加10个以上的元素（比北如String"hello”),在2号位插入一个元素"qimu666”，
        获得第5个元素，删除第6个元素，修改第7个元素，在使用迭代器遍历集
        合，要求：使用List的实现类ArrayList完成。
         */
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }
        list.add(1, "qimu666");
        System.out.println("第五个元素："+list.get(4));
        list.remove(5);
        list.set(7, "你好");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);

        }
    }
}
