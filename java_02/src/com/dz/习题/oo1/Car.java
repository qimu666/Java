package com.dz.习题.oo1;

public class Car {
    private String sid;
    private String name;
    private int jiage;

    public Car(String sid, String name, int jiage) {
        this.sid = sid;
        this.name = name;
        this.jiage = jiage;
    }

    public Car() {
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJiage() {
        return jiage;
    }

    public void setJiage(int jiage) {
        this.jiage = jiage;
    }
    public  String toString(){
        return sid+"\t"+name+"\t"+jiage+"\t";
    };


}
