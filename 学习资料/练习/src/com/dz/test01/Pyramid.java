package com.dz.test01;

import org.junit.Test;

public class Pyramid {
    /* 三角星

     *
     ***
     *****
     *******
     *********

     *
     ***
     *****
     *******
     *********

     *
     * *
     *   *
     *     *
     *********

     */
    @Test
    public void A() {
        int totalLevel1 = 10;//层数
        for (int i = 1; i <= totalLevel1; i++) {
            for (int k = 1; k <= totalLevel1 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        int totalLevel = 10;//层数
        for (int i = 1; i <= totalLevel; i++) {
            for (int k = 1; k <= totalLevel - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == totalLevel) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
