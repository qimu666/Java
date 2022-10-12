package com.dz.work.work03.homework04;

public class Factory {
    //表示从始至终只有一匹马，（唐僧取经一直骑得都是白龙马）
    private static Horse horse = new Horse();

    //私有化构造器，不能创建新的对象
    private Factory() {
    }

    //3.创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Plane getPlane() {
        return new Plane();
    }
}
