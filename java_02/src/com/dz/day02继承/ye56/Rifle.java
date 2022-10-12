package com.dz.day02继承.ye56;

public final class Rifle extends Gun {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int amount(int day, int pay) {
        return day * pay;
    }

    @Override
    public void print() {
        super.print();
        System.out.print("型号：" + getModel());
    }
}
