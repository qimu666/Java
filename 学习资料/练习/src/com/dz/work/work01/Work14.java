package com.dz.work.work01;



import java.util.Scanner;

public class Work14 {
    /*有个人Tom设计他的成员变量.成员方法，可以电脑猜拳
      电脑每次都会随机生成0,1,2
      0表示石头,1表示剪刀,2表示布
      并要可以显示Tom的输赢次数（清单）
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        do {

            play play = new play();
            play.play();
//        }while (true);

    }
}

class Tom {
    public int wan() {
        return (int) (Math.random() * 3);
    }

    public int jiqi() {
        return (int) (Math.random() * 3);
    }
}

class play {
    public void play() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int su = 0;

        do {
            int d=scanner.nextInt();
            Tom tom = new Tom();
            int a = tom.wan();
            int b = tom.jiqi();
            if (a == 1) {
                System.out.println("Tom出石头");
            } else if (a == 2) {
                System.out.println("Tom出剪刀");
            } else {
                System.out.println("Tom出布");
            }
            if (b == 1) {
                System.out.println("电脑出石头");
            } else if (b == 2) {
                System.out.println("电脑出剪刀");
            } else {
                System.out.println("电脑出布");
            }


            if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0)) {
                System.out.println("Tom赢");
                sum += 1;
            } else if ((a == 0 && b == 0) || (a == 1 && b == 1) || (a == 2 && b == 2)) {
                System.out.println("平局");
            } else {
                System.out.println("Tom输");
                su += 1;
            }
            System.out.println("TOM赢了" + sum + "次");
            System.out.println("TOM输了" + su + "次");

        }while (true);
    }
}

