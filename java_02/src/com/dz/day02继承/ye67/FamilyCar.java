package com.dz.day02继承.ye67;

public class FamilyCar extends Car {
    private String hostName;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public void start() {
        System.out.println("轿车主人李峰开动汽车");
    }

    public void stop() {
        System.out.println("李峰开着汽车驶进车库");
    }
}
