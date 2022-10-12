package com.dz.aggregate.work.work02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test03 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
          /* 使用ArrayList完成对对象Car{name,price}的各种操作
        1.add:添加单个元素
        2.remove:删除指定元素
        3.contains:查找元素是否存在
        4.size获取元素个数
        5.isEmpty::判断是否为空
        6.clear:清空
        7.addAll:添加多个元素
        8.containsAll:查找多个元素是否都存在
        9.removeAll:删除多个元素
        使用增强for和迭代器来遍历所有的car,需要重写Car的toString方法
      */
        List list = new ArrayList();
        Car car = new Car("宝马", 100000);
        Car car1 = new Car("宾利", 200000);
        Car car2 = new Car("兰博基尼", 5000000);
        Car car3 = new Car("奔驰", 200000);
        list.add(car);
        list.add(car1);
        list.remove(0);
        //  查找元素是否存在
        System.out.println(list.contains(car));
        // size获取元素个数
        int size = list.size();
        System.out.println(size);
        // isEmpty::判断是否为空
        System.out.println(list.isEmpty());
//        clear:清空
//         list.clear();
//        addAll:添加多个元素
        System.out.println(list.addAll(list));
//        containsAll:查找多个元素是否都存在
        System.out.println(list.containsAll(list));
//        removeAll:删除多个元素
//        System.out.println(list.removeAll(list));
        System.out.println("增强for");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("迭代器");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
