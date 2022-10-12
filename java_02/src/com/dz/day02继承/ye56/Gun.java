package com.dz.day02继承.ye56;

public abstract class Gun {
    private String name;
    private String country;
    public int pay;

    public Gun() {

    }

    public Gun(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setConuntry(String country) {
        this.country = country;
    }


    public void setPay(int pay) {
        this.pay = pay;
    }


    public void print() {
        System.out.println("枪的名称：" + name + "\n国家：" + country);
    }

    public abstract int amount(int day, int pay);

}
