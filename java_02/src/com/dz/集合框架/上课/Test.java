package com.dz.集合框架.上课;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        一次添加多个数据
        Collections.addAll(list, "1", "2", "3", "4", "5", "6");
        System.out.println("直接输出：" + list);
//        打乱list集合之后的数据Collections.shuffle
        Collections.shuffle(list);
        System.out.println("打乱list集合之后的数据：" + list);
//        对集合进行排序Collections.sort
        Collections.sort(list);
        System.out.println("排序之后的顺序：" + list);
//        list.add("aa");
//        list.add("bb");
//        list.add("cc");
//        list.add("aa");
//        list.add("bb");
        System.out.print("遍历之后的集合：");
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            System.out.print(string + "");

        }

        System.out.print("\n增强for循环：");
        for (String s : list) {
            System.out.print(s + "");
        }

        System.out.print("\n去重复：");
//        增加重复数据
        Collections.addAll(list, "1", "2", "3", "4", "5", "6");
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s : list) {
            if (Collections.frequency(arrayList, s) < 1) {
                arrayList.add(s);
            }
        }
        System.out.println(arrayList);
    }
}
