package com.dz.第8章;

import java.util.Scanner;

public class d18902 {
    public static void main(String[] args) {
        d18901 xx=new d18901();
        do {
            xx.menu();
            if (xx.xz==1){
                xx.save();
            }else if (xx.xz==2){
                xx.get();
            }else if (xx.xz==3){
                System.out.println("退出成功");
                break;
            }else{
                System.out.println("输入有误，请重新输入");
            }
        }while (true);
        }
    }

