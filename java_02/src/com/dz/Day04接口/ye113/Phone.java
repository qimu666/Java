package com.dz.Day04接口.ye113;

public abstract class Phone {
    public String pinpai;
    public String xinghao;

    public Phone() {
    }

    public Phone(String pinpai, String xinghao) {
        this.pinpai = pinpai;
        this.xinghao = xinghao;
    }

    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }

    public String getXinghao() {
        return xinghao;
    }

    public void setXinghao(String xinghao) {
        this.xinghao = xinghao;
    }

    public abstract void show();
}
