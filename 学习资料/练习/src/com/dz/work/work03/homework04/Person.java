package com.dz.work.work03.homework04;

public class Person {
    private static String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    //过河的情况下
    public void getboat() {
        // 1.当 vehicles为null时 vehicles instanceof Boat =>返回 false
        // 2.当 vehicles运行类型为Horse时 vehicles instanceof Boat =>返回 false
        // 3.当 vehicles运行类型为Boat时, vehicles instanceof Boat =>返回 true;
        // ！(上面三种情况的值) ！取反之后为ture时执行if里面的代码，否则不执行.
        // (上面三种情况前两种取反后执行if，第3种情况说明当前vehicles为Boat,则跳过if直接执行vehicles.work()方法)
        if (!(vehicles instanceof Boat)) {
            vehicles = Factory.getBoat();
        }
        vehicles.work();
    }

    //一般情况下
    public void common() {
        //和上面的情况一样
        if (!(vehicles instanceof Horse)) {
            vehicles = Factory.getHorse();
        }
        vehicles.work();
    }

    public void volcano() {
        if (!(vehicles instanceof Plane)) {
            vehicles = Factory.getPlane();
        }
        vehicles.work();
    }
}
