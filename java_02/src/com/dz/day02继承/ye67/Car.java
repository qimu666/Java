package com.dz.day02继承.ye67;

public abstract class Car {
    private String type;
    private String no;

    public Car() {
    }

    public Car(String type, String no) {
        this.type = type;
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public abstract void start();
    public abstract void stop();
}
