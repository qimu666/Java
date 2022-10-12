package com.dz.day01抽象和封装.测试;

public class Test02 {
    public static void main(String[] args) {
        for (int j=1;j<=35;j++){
            if (j*2+(35-j)*4==94){
              System.out.println("鸡"+j);
              System.out.println("兔"+(35-j));
             }
        }
    }
}
