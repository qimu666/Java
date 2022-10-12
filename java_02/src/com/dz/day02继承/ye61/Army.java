package com.dz.day02继承.ye61;

public class Army extends Preson {
    private String birth;

    public Army() {

    }

    public Army(String birth) {

    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void patrol() {

    }

    public void Print() {
        System.out.println("出生地:" + getBirth());
    }
}
