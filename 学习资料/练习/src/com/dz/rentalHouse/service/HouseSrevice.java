package com.dz.rentalHouse.service;

import com.dz.rentalHouse.house.House;

/*
HouseService.java类[业务层]
定义House[]，保存House对象
1.响应HouseView的调用
2.完成对房屋信息的各种操作 增删改查
*/
public class HouseSrevice {
    private House[] house;//定义一个动态对象数组
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前id自增长到哪个值

    public HouseSrevice(int size) {
        //构造器初始化一个house对象，size为数组的大小
        house = new House[size];
        //给house动态数组赋一个初始值
        house[0] = new House(1, "张三", 1234, "郑州", 2000, "未出祖");
    }

    //定义一个返回类型为House[]的方法，返回house
    public House[] list() {
        return house;
    }

    //添加房屋操作：add()方法 添加新对象，返回boolea
    public boolean add(House newHouse) {
        //判断是否还可以继续添加,当houseNums的当前值等于数组的大小，表示已经满了
        if (houseNums == house.length) {
            System.out.println("没有剩余的房间可以租了");
            return false;
        }
        //把newHouse对象加入到house数组中 表示新增了一个房屋
        house[houseNums++] = newHouse;
        //两种一样的效果
        //house[houseNums] = newHouse;
        //houseNums++;

        /** 设计一个id自增长的机制 然后更新newHouse的id */
        //++idCounter;
        newHouse.setId(++idCounter);
        return true;
    }

    //查找方法:返回house对象或者null
    public House select(int id) {
        //判断房屋是否存在，用i < houseNums是因为要在已有的信息中查找
        for (int i = 0; i < houseNums; i++) {
            if (id == house[i].getId()) {
                return house[i];
            }
        }
        return null;
    }

    /**
     * select的第二种
     */
//    public void select(int id) {
//        //判断房屋是否存在，用i < houseNums是因为要在已有的信息中查找
//        for (int i = 0; i < houseNums; i++) {
//            if (id == house[i].getId()) {
//                System.out.println(house[i]);
//            } else {
//                System.out.println("该房屋没有人入住");
//            }
//        }
//    }

    //delete方法 删除一个房屋信息
    public boolean delete(int id) {
        //应当先找到要删除的房屋信息对应的下标
        //注意 一定要搞清楚 下标和房屋的编号不是一会事
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (id == house[i].getId()) {
                //要删除的房屋id 是数组下标为i的元素
                index = i;
            }
        }
        //说明delId在数组中不存在
        if (index == -1) {
            return false;
        }
        //如果找到：
        for (int i = 0; i < houseNums - 1; i++) {
            //把i+1赋值给前面的数
            house[i] = house[i + 1];
        }
        //把当前存在的房屋信息的最后一个 设置null
        house[--houseNums] = null;
        return true;
    }
}
