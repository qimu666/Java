package com.dz.tankGame03;

import javax.swing.*;

public class TankGame03 extends JFrame {
    public static void main(String[] args) {
        new TankGame03();
    }

    public TankGame03() {
        PaintTank paintTank = new PaintTank();
        Thread thread = new Thread(paintTank);
        thread.start();
        this.setSize(1020, 780);
        this.add(paintTank);
        this.addKeyListener(paintTank);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
