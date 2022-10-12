package com.dz.第4章;

public class shangji {
    public static void main(String[] args) {
        int year=2012;
        double xs =250000;
        while (xs<=1000000){
            xs = xs*(1+0.25);
            year++;
        }
        System.out.println(year);
    }
}
