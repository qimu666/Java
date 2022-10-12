package com.dz.Test01;

public class FingerGuessGame {
    public static void main(String[] args) {
        FingerGuess fingerGuess = new FingerGuess();
        fingerGuess.name = "小明";
        FingerGuess fingerGuess1 = new FingerGuess();
        fingerGuess1.name = "小王";

        System.out.println(fingerGuess.name + "出：" + fingerGuess.showFinger());
        System.out.println(fingerGuess1.name + "出：" + fingerGuess1.showFinger());
        if (fingerGuess1.caiquan == fingerGuess.caiquan) {
            System.out.println("平局");
        } else if ((fingerGuess.caiquan == "石头" && fingerGuess1.caiquan == "剪刀")
                || (fingerGuess.caiquan == "剪刀" && fingerGuess1.caiquan == "布")
                || (fingerGuess.caiquan == "布" && fingerGuess1.caiquan == "石头")) {
            System.out.println(fingerGuess.name + "赢");
        } else {
            System.out.println(fingerGuess1.name + "赢");
        }
    }
}
