package com.dz.tankGame02;

import javax.swing.*;

/**
 * @author 坦克大战
 * @version 3.0
 */
public class TankGame extends JFrame {
    PaintTank paintTank = null;

    public static void main(String[] args) {
        new TankGame();
    }

    public TankGame() {
        paintTank = new PaintTank();
        Thread thread = new Thread(paintTank);
        thread.start();
        this.add(paintTank);
        this.setSize(1025, 790);
        this.addKeyListener(paintTank);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
