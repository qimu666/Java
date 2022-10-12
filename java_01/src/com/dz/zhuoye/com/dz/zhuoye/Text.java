package com.dz.zhuoye;

public class Text {
    public static void main(String[] args) {
        RandomGame cs=new RandomGame(); //调用RandomGame类
        System.out.println("\t***游戏规则***");
        cs.Rule();                      //调用Rule方法
        System.out.println("\t\n***充值中心***");
        cs.User();                      //调用User方法
        System.out.println("\t\n***游戏界面***");
        cs.Game();                      //调用Game方法
    }
}
