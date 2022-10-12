package com.dz.work.work03.homework06;

public class Test {
    /*枚举类
       1.创建一个Color枚举类
       2.有RED,BLUE,BLACK,YELLOW,GREEN这个五个枚举值/对像；
       3.Color有三个属性redValue,greenValue,blueValue,
       4.创建构造方法，参数包括这三个属性，
       5.每个枚举值都要给这三个属性赋值，三个属性对应的值分别是
       6.red:255,0,0   blue:0,0,255    black:0,0,0   yellow:255,255,0    green:0,255,0
       7.定义接口，里面有方法show,要求Colo实现该接口
       8.show方法中显示三属性的值
       9.将枚举对象在switch语句中匹配使用
     */
    public static void main(String[] args) {
       Color color= Color.BLACK;
       color.show();
       switch (color){
           case RED -> {
               System.out.println("匹配到红色");
               break;
           }
           case BLUE -> {
               System.out.println("匹配到蓝色");
               break;
           }
           case BLACK -> {
               System.out.println("匹配到黑色");
               break;
           }
           case GREEN -> {
               System.out.println("匹配到绿色");
               break;
           }
           case YELLOW -> {
               System.out.println("匹配到黄色");
               break;
           }
           default -> {
               System.out.println("没有匹配到");
           }
       }
    }
}

enum Color implements getColor {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);


    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public int getRedValue() {
        return redValue;
    }

    public void setRedValue(int redValue) {
        this.redValue = redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public void setGreenValue(int greenValue) {
        this.greenValue = greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }

    public void setBlueValue(int blueValue) {
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值为" + redValue+","+greenValue+","+blueValue);
    }
}

