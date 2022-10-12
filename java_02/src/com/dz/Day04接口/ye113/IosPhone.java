package com.dz.Day04接口.ye113;

public class IosPhone extends Phone implements Network, Video, WeChat {

    public void show() {
        setPinpai("苹果");
        setXinghao("苹果6");
        System.out.println("这是一款品牌为" + getPinpai() + "---" + "型号为" + getXinghao() + "的手机");
    }

    @Override
    public void shipinbofang() {
        System.out.println("手机播放视频《大宅门》");
    }

    @Override
    public void shangwang() {
        System.out.println("开始上网浏览网页");
    }

    @Override
    public void shipintonghua() {
        System.out.println("和小明微信视频");
    }

    @Override
    public void xinxi() {
        System.out.println("发送小明微信信息");
    }

    public void print() {
        System.out.println("手机视频通话");
        System.out.println("手机收发语音和图片信息");
    }

    public void youxi() {
        System.out.println("开始玩苹果版--神庙逃亡2");
    }
}
