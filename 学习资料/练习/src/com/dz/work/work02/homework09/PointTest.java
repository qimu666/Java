package com.dz.work.work02.homework09;

public class PointTest {
    /*
    9.设计一个Point类，其x和y坐标可以通过构造器提供。提供一个子类LabeledPoint,其
      构造器接受一个标签值和x,y坐标，比如：new LabeledPoint(“Black”,1929,230.07刀
      写出对应的构造器即可
     */
    public static void main(String[] args) {
        LabledPoint labledPoint = new LabledPoint("jack", 123.6, 23.9);
        System.out.println(labledPoint.toString());
    }
}
