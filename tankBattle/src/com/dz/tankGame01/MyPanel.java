package com.dz.tankGame01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener, Runnable {
    MyTank myTank = null;
    int enemys = 3;
    Vector<EnemyTank> enemyTanks = new Vector<>();

    public MyPanel() {
        myTank = new MyTank(100, 100);//初始化自己的坦克
        myTank.setSpeed(5);
        for (int i = 0; i < enemys; i++) {
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            enemyTank.setDirection(2);
            enemyTanks.add(enemyTank);
            FireBullets fireBullets = new FireBullets(enemyTank.getX(), enemyTank.getY(), enemyTank.getDirection());
            enemyTank.enemy.add(fireBullets);
            new Thread(fireBullets).start();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//绘制地图
        paintTank(myTank.getX(), myTank.getY(), g, myTank.getDirection(), 0);
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            paintTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 1);

            for (int j = 0; j < enemyTank.enemy.size(); j++) {
                FireBullets fireBullets = enemyTank.enemy.get(j);
                if (fireBullets.isLive) {
                    g.draw3DRect(fireBullets.x, fireBullets.y, 2, 2, false);
                } else {
                    enemyTank.enemy.remove(fireBullets);
                }

            }
        }
        if (myTank.fireBullets != null && myTank.fireBullets.isLive == true) {
//            System.out.println("子弹绘制");
            g.draw3DRect(myTank.fireBullets.x, myTank.fireBullets.y, 2, 2, false);
        }
    }

    /**
     * @param x         x坐标
     * @param y         y坐标
     * @param g         画笔
     * @param direction 方向
     * @param type      类型
     */
    private void paintTank(int x, int y, Graphics g, int direction, int type) {
        switch (type) {
            case 0://自己坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人坦克
                g.setColor(Color.yellow);
                break;
            default:
        }
        switch (direction) {
            case 0://向上
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1://右
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2://向下
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3://右
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
        }
    }


    //有字符输出就触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当某一个键按下就触发
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char) e.getKeyCode()+"被按下");
        if (e.getKeyCode() == KeyEvent.VK_W) {
            myTank.setDirection(0);
            myTank.moveUP();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            myTank.setDirection(2);
            myTank.down();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            myTank.setDirection(3);
            myTank.lift();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            myTank.setDirection(1);
            myTank.right();
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
            myTank.shootingBullet();
        }
        this.repaint();
    }

    //当某一个键松开就触发
    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.repaint();
        }
    }
}
