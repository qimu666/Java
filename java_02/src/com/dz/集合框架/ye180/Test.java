package com.dz.集合框架.ye180;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("CCTV", "中央电视台");
        map.put("BTV", "北京电视台");
        map.put("HNTV", "河南电视台");
        map.put("TVB", "翡翠台");
        String cctv = (String) map.get("CCTV");
        System.out.println("对应的中文全称是：" + cctv);
        System.out.println("元素共有：" + map.size() + "个");
        System.out.println("map中包含CCTV的键吗？" + map.containsKey("CCTV"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);
        map.clear();
        if (map.isEmpty()) {
            System.out.println("已清空map中的数据");
        }
    }
}
