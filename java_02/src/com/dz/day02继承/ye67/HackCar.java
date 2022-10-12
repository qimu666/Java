package com.dz.day02继承.ye67;

public class HackCar extends Car {
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public void start() {
        System.out.println("开运一队出发一辆出租车--牌号豫" + getNo());
    }

    public void stop() {
        System.out.println("牌号豫" + getNo() + "驶入车站");
    }
}
