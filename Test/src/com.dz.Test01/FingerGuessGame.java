package com.dz.Test01;

public class FingerGuessGame {
    public static void main(String[] args) {
        FingerGuess fingerGuess = new FingerGuess();
        fingerGuess.name = "С��";
        FingerGuess fingerGuess1 = new FingerGuess();
        fingerGuess1.name = "С��";

        System.out.println(fingerGuess.name + "����" + fingerGuess.showFinger());
        System.out.println(fingerGuess1.name + "����" + fingerGuess1.showFinger());
        if (fingerGuess1.caiquan == fingerGuess.caiquan) {
            System.out.println("ƽ��");
        } else if ((fingerGuess.caiquan == "ʯͷ" && fingerGuess1.caiquan == "����")
                || (fingerGuess.caiquan == "����" && fingerGuess1.caiquan == "��")
                || (fingerGuess.caiquan == "��" && fingerGuess1.caiquan == "ʯͷ")) {
            System.out.println(fingerGuess.name + "Ӯ");
        } else {
            System.out.println(fingerGuess1.name + "Ӯ");
        }
    }
}
