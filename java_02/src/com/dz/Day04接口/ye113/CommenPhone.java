package com.dz.Day04接口.ye113;

public class CommenPhone extends Phone implements Video {
    public void print() {
        System.out.println("手机传统通话");
        System.out.println("手机传统收发信息");
    }

    @Override
    public void shipinbofang() {
        System.out.println("手机播放视频<琅琊榜>");

    }

    @Override
    public void show() {
        setPinpai("诺基亚");
        setXinghao("1050");
        System.out.println("这是一款品牌为" + getPinpai() + "---" + "型号为" + getXinghao() + "的手机");
    }
}
