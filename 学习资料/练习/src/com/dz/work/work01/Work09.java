package com.dz.work.work01;

public class Work09 {
    /*9.定义Music类，里面有音乐名name、音乐时长times.属性，并有播放play功能
        和返回本身属性信息的功能方法getInfo
        10.100,101,    100,100
     */
    public static void main(String[] args) {
        Music music = new Music("辞", 2.45);
        music.play();
        System.out.println(music.getInfo());
    }
}

class Music {
    String name;
    double times;

    public Music(String name, double times) {
        this.name = name;
        this.times = times;
    }
    public void play(){
        System.out.println("音乐播放中："+"\n音乐名："+name+"\n音乐时长："+times);
    }
    public String getInfo(){
        return "播放音乐";
    }
}