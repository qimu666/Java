package com.dz.work.work01;

public class Work05 {
    /*
    5.定义一个圆类Circle,定义属性：半径，
    提供显示圆周长功能的方法，
    提供显示圆面积的方法
     */
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("圆的面积为："+circle.area(5));
        System.out.println("圆的周长为："+circle.perimeter(5));
    }
}

class Circle {
    public int r;

    public double perimeter(int r) {
        return 2 * 3.14 * r;
    }

    public double area(int r) {
        return 3.14 * r * r;
    }
}