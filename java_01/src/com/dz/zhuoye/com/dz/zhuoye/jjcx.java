package com.dz.zhuoye;

import java.util.Scanner;

public class jjcx {
    public int jia(int a,int b){
        return a+b;
    }
    public int jian(int a,int b){
        return a-b;
    }
    public int chen(int a,int b){
        return a*b;
    }
    public int chu(int a,int b){
        return a/b;
    }
    int a,b;
    String  c;
    public void suanfa(){
        if (c.equals("+")){
            System.out.println("结果为："+jia(a,b));
        }else if (c.equals("-")){
            System.out.println("结果为："+jian(a,b));
        }else if (c.equals("/")){
            System.out.println("结果为："+chu(a,b));
        }else if (c.equals("*")){
            System.out.println("结果为："+chen(a,b));
        }else{
            System.out.println("输入有误");
        }
    }
}
