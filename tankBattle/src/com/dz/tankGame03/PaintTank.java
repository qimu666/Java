package com.dz.tankGame03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.IllegalFormatCodePointException;
import java.util.Vector;

public class PaintTank extends JPanel implements KeyListener, Runnable {
    MyTank myTank = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    Vector<Bomb> bombs = new Vector<>();
    int a = ((int) (Math.random() * 6) + 1);
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;


    public PaintTank() {
        myTank = new MyTank(200, 300);//初始化自己坦克

        for (int i = 0; i < a; i++) {
            EnemyTank enemyTank = new EnemyTank(100 * (1 + i), 0);
            new Thread(enemyTank).start();
            enemyTank.setDirection(2);
            Bullet bullet = new Bullet(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirection());
            enemyTank.bullets.add(bullet);
            new Thread(bullet).start();
            enemyTanks.add(enemyTank);
        }
        image1 = Toolkit.getDefaultToolkit().getImage(PaintTank.class.getResource("/1.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(PaintTank.class.getResource("/2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(PaintTank.class.getResource("/3.png"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fill3DRect(0, 0, 1000, 750, false);//绘制地图
        if (myTank != null && myTank.isLive) {
            paTank(myTank.getX(), myTank.getY(), g, myTank.getDirection(), 0);//绘制自己坦克
        }
        for (int i = 0; i < myTank.bullets.size(); i++) {
            Bullet bullet = myTank.bullets.get(i);
            if (bullet != null && bullet.isLive) {//给自己绘制子弹
                g.draw3DRect(bullet.getX(), bullet.getY(), 2, 2, false);
            } else {
                myTank.bullets.remove(bullet);
            }
        }

        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Bomb bomb = bombs.get(i);
            if (bomb.life > 6) {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            }
            bomb.life();
            if (bomb.life == 0) {
                bombs.remove(bomb);
                break;
            }
        }

        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank.isLive) {
                paTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 1);
                for (int j = 0; j < enemyTank.bullets.size(); j++) {
                    Bullet bullet = enemyTank.bullets.get(j);
                    if (bullet.isLive) {
                        g.fill3DRect(bullet.getX(), bullet.getY(), 2, 2, false);
                    } else {
                        enemyTank.bullets.remove(bullet);
                    }
                }
            }
        }
    }

    public void hitTank(Bullet b, Tank Tank) {
        switch (Tank.getDirection()) {
            case 0:
            case 2:
                if (b.getX() > Tank.getX() && b.getX() < Tank.getX() + 40 &&
                        b.getY() > Tank.getY() && b.getY() < Tank.getY() + 60) {
                    b.isLive = false;
                    Tank.isLive = false;
                    //击中敌方坦克就将其删除
                    enemyTanks.remove(Tank);
                    //创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(Tank.getX(), Tank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1:
            case 3:
                if (b.getX() > Tank.getX() && b.getX() < Tank.getX() + 60 &&
                        b.getY() > Tank.getY() && b.getY() < Tank.getY() + 40) {
                    b.isLive = false;
                    Tank.isLive = false;
                    //击中敌方坦克就将其删除
                    enemyTanks.remove(Tank);
                    //创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(Tank.getX(), Tank.getY());
                    bombs.add(bomb);
                }
        }
    }

    public void hitEnemy() {
        for (int j = 0; j < myTank.bullets.size(); j++) {
            Bullet bullet = myTank.bullets.get(j);
            if (bullet != null && bullet.isLive) {
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(bullet, enemyTank);
                }
            }
        }
    }

    public void hitMyTank() {
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j = 0; j < enemyTank.bullets.size(); j++) {
                Bullet bullet = enemyTank.bullets.get(j);
                if (myTank.isLive && bullet.isLive) {
                    hitTank(bullet, myTank);
                }
            }
        }
    }

    public void paTank(int x, int y, Graphics g, int direction, int type) {
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
        switch (direction) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y, x + 20, y + 20);
                break;
            case 1:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 20, y + 20, x + 60, y + 20);
                break;
            case 2:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 20, x + 20, y + 60);
                break;
            case 3:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x, y + 20, x + 20, y + 20);

                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            myTank.setDirection(0);
            if (myTank.getY() > 0) {
                myTank.up();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            myTank.setDirection(1);
            if (myTank.getX() + 60 < 1000) {
                myTank.right();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            myTank.setDirection(2);
            if (myTank.getY() + 60 < 750) {
                myTank.down();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            myTank.setDirection(3);
            if (myTank.getX() > 0) {
                myTank.left();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
            myTank.shooting();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            hitEnemy();
            hitMyTank();
            this.repaint();
        }
    }
}
