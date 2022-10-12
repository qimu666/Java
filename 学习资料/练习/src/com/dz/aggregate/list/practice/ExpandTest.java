package com.dz.aggregate.list.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

@SuppressWarnings({"all"})
public class ExpandTest {
    //扩容源码查看
    public static void main(String[] args) {
        Vector list = new Vector();
        for (int i = 1; i <=10; i++) {
            list.add(i);
        }
        for (int i = 11; i <=21; i++) {
            list.add(i);
        }

    }
}
