package com.dz.集合框架.上课;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList<>();
//        arrayList.add("a");
//        arrayList.add("b");
//        arrayList.add("c");
//        System.out.println(arrayList);
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "a");
        hashMap.put(2, "b");
        hashMap.put(3, "c");
        hashMap.put(4, "d");
        hashMap.put(11, "11");
        System.out.println(hashMap);
//        size获取集合中的元素个数
        int size = hashMap.size();
        System.out.println("元素个数:" + size);
//        get获取集合中元素的key值
        Object o = hashMap.get(1);
        System.out.println("获取元素的key值" + o);
//        keySet,获取集合中的键
        System.out.println(hashMap.keySet());
//        containsValue返回值,获取集合中的值，有的话为true,没有为false
        boolean b = hashMap.containsValue("c");
        System.out.println("value值是否存在" + b);
//        containsKey返回键,获取集合中的键
        boolean c = hashMap.containsKey(3);
        System.out.println("key值是否存在" + c);
//       删除后的元素数据
        String remove = hashMap.remove(2);
        System.out.println("删除后的元素数据" + hashMap);
//        clear清空集合中的数据
        hashMap.clear();
        System.out.println("清空集合中的数据" + hashMap);
//        集合中有数据为false
        System.out.println(hashMap.isEmpty());
    }
}
