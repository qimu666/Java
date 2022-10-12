package com.dz.test01;

public class LianXi {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            sum=sum+i;
            if (sum>20){
                System.out.println("qqdhhgqh+"+sum+"i="+i);
                break;
            }
        }
        System.out.println(sum);
    }
}
