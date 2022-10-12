package com.dz.集合框架.上课;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Iterator {
    public static void main(String[] args) {
        Map map =new HashMap();
        map.put(1,42);
        map.put(2,"32");
        map.put(3,22);
        map.put(4,12);
        System.out.println(map);
        Set set = map.keySet();
        java.util.Iterator integer=set.iterator();
        while (integer.hasNext()){
            Object next = integer.next();
            System.out.println(next);
        }

    }
}
