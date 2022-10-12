package com.dz.第5章;

public class for13001 {
    public static void main(String[] args) {
        int a = 0;
        for (int i=0;i<100;i++){
            if (i%2==0){
                continue;
            }a=a+i;
        }
        System.out.println("100以内奇数和为"+a);
    }
}
