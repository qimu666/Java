package com.dz.work.work02.homework09;

public class LabledPoint extends Point{
    private String lable;

    public LabledPoint(String lable,double x, double y) {
        super(x, y);
        this.lable = lable;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return lable+"\t"+getX()+"\t"+getY();
    }
}
