package com.dz.day02继承.ye67;

public class Test {
    public static void main(String[] args) {
        HackCar hackCar =new HackCar();
        FamilyCar familyCar=new FamilyCar();
        System.out.println("=================================================");
        familyCar.start();
        familyCar.stop();
        System.out.println("=================================================");
        hackCar.setNo("B99999999");
        hackCar.start();
        hackCar.stop();
        System.out.println("=================================================");
    }
}
