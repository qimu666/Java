package com.dz.aggregate.map;

import java.util.*;

public class MapExercise01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
       /* 使用HashMap添加3个员工对象，要求
          键：员工id
          值：员工对象
          并遍历显示工资>18000的员工（遍历方式最少两种）
          员工类：姓名、工资、员工id
        */
        Map hashMap = new HashMap();
        hashMap.put(1, new Staff("小明", 18200, 1));
        hashMap.put(2, new Staff("张三", 4000, 2));
        hashMap.put(3, new Staff("李四", 8000, 3));
        hashMap.put(4, new Staff("王二", 15000, 4));
        hashMap.put(5, new Staff("李四", 20000, 5));
        System.out.println("第一种方式");
        Set set = hashMap.keySet();
        for (Object key : set) {
            Staff staff = (Staff) hashMap.get(key);
            if (staff.getSal() > 18000) {
                System.out.println(staff);
            }
        }
        System.out.println("第二种方式");
        Set set1 = hashMap.entrySet();
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            //向下转型为Entry类型
            Map.Entry next = (Map.Entry) iterator.next();
            Staff staff = (Staff) next.getValue();
            if (staff.getSal() > 18000) {
                System.out.println(staff);
            }
        }
    }
}

class Staff {
    private String name;
    private int sal;
    private int id;

    public Staff(String name, int sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
