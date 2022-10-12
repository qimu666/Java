package com.dz.aggregate.work.work03;

import java.util.*;

public class Test {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
     /* 1)使用HashMap:类实例化一个Map类型的对象m,键(String)和值(int)分别用于存储员
        工的姓名和工资，存入数据如下：jack一650元；tom一1200元；smith一2900元；
        2)将jack的工资更改为2600元
        3)为所有员工工资加薪100元：
        4)遍历集合中所有的员工
          遍历集合中所有的工资
      */
        HashMap map = new HashMap();
        map.put("jake", new M(650));
        map.put("tom", new M(1200));
        map.put("smith", new M(2900));

        map.put("jake", new M(2600));
        System.out.println(map);
        Set set = map.keySet();
        for (Object o : set) {
            M m = (M) map.get(o);
            m.setSal(m.getSal() + 100);
            System.out.println(m);
        }
        System.out.println("员工姓名");
        for (Object o : set) {
            System.out.println(o);
        }
        Collection values = map.values();
        System.out.println("员工工资");
        for (Object value : values) {
            System.out.println(value);
        }
        System.out.println("迭代器");
        Set set1 = map.entrySet();
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry) iterator.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }
    }
}

class M {
    private int sal;

    public M(int sal) {
        this.sal = sal;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "M{" +
                "sal=" + sal +
                '}';
    }
}