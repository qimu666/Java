package com.dz.Test01;

public class FingerGuess {
    public String name;
    public String caiquan = "";

    public String showFinger() {
        int random1 = ((int) (Math.random() * 3) + 1);
        if (random1 == 1) {
            caiquan = "ʯͷ";
        } else if (random1 == 2) {
            caiquan = "����";
        } else {
            caiquan = "��";
        }
        return caiquan;
    }
}






