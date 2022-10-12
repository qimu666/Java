package com.dz.day02继承.ye56;

public final class Sniper extends Gun {
    private String range;

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public int amount(int day, int pay) {
        return day * pay;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("射程：" + getRange());
    }
}
