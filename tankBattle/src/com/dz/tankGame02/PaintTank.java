package com.dz.tankGame02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class PaintTank extends JPanel implements KeyListener, Runnable {
    MyTank myTank = null;
    //定义敌人坦克放入到Vector
    Vector<EnemyTank> enemy = new Vector();
    //定义一个Vector，用于存放炸弹
    Vector<Bomb> bombs = new Vector<>();
    int numTank = ((int) (Math.random() * 10) + 3);
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public PaintTank() {
        myTank = new MyTank(100, 100);//初始化自己的坦克
        myTank.setSpeed(5);
        //        初始化图片
        image1 = Toolkit.getDefaultToolkit().getImage("D:\\JAVA\\tankBattle\\src\\1.png");
        image2 = Toolkit.getDefaultToolkit().getImage("D:\\JAVA\\tankBattle\\src\\2.png");
        image3 = Toolkit.getDefaultToolkit().getImage("D:\\JAVA\\tankBattle\\src\\3.png");
        for (int i = 0; i < numTank; i++) {//初始化敌人坦克
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            new Thread(enemyTank).start();
            enemyTank.setDirection(2);
            enemy.add(enemyTank);
            Bullet bullet = new Bullet(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirection());
            enemyTank.enemy.add(bullet);
            enemy.add(enemyTank);
            new Thread(bullet).start();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fill3DRect(0, 0, 1000, 750, false);//绘制地图
        paintTank(myTank.getX(), myTank.getY(), g, myTank.getDirection(), 0);//绘制自己的坦克
        for (int i = 0; i < myTank.bullets.size(); i++) {
            Bullet bullet = myTank.bullets.get(i);
            if (bullet != null && bullet.isLike) {//给自己绘制子弹
                g.draw3DRect(bullet.x, bullet.y, 2, 2, false);
            } else {
                myTank.bullets.remove(bullet);
            }
        }

        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            Bomb bomb = bombs.get(i);
            if (bomb.life > 6) {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            }
            bomb.lifeDown();
            if (bomb.life == 0) {
                bombs.remove(bomb);
                break;
            }
        }
        for (int i = 0; i < enemy.size(); i++) {//绘制敌人坦克
            EnemyTank enemyTank = enemy.get(i);
            if (enemyTank.isLive) {
                paintTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 1);
                for (int j = 0; j < enemyTank.enemy.size(); j++) {
                    Bullet bullet = enemyTank.enemy.get(j);
                    if (bullet.isLike) {
                        g.draw3DRect(bullet.x, bullet.y, 2, 2, false);
                    } else {
                        enemyTank.enemy.remove(bullet);
                    }
                }
            }
        }
    }

    public void paintTank(int x, int y, Graphics g, int direction, int type) {
        switch (type) {
            case 0:
                g.setColor(Color.cyan);//自己坦克
                break;
            case 1:
                g.setColor(Color.yellow);//敌人坦克
                break;
        }
        switch (direction) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
        }
    }

    public void hitTank(Bullet b, EnemyTank enemyTank) {
        switch (enemyTank.getDirection()) {
            case 0:
            case 3:
                if (b.x > enemyTank.getX() && b.x < enemyTank.getX() + 40 &&
                        b.y > enemyTank.getY() && b.y < enemyTank.getY() + 60) {
                    b.isLike = false;
                    enemyTank.isLive = false;
                    //击中敌方坦克就将其删除
                    enemy.remove(enemyTank);
                    //创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 2:
            case 4:
                if (b.x > enemyTank.getX() && b.x < enemyTank.getX() + 60 &&
                        b.y > enemyTank.getY() && b.y < enemyTank.getY() + 40) {
                    b.isLike = false;
                    enemyTank.isLive = false;
                    //击中敌方坦克就将其删除
                    enemy.remove(enemyTank);
                    //创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
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
                myTank.lift();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
            myTank.launch();
        }
        this.repaint();
    }

    public void hitTanks() {
        for (int j = 0; j < myTank.bullets.size(); j++) {
            Bullet bullet = myTank.bullets.get(j);
            if (bullet != null && bullet.isLike) {
                for (int i = 0; i < enemy.size(); i++) {
                    EnemyTank enemyTank = enemy.get(i);
                    hitTank(bullet, enemyTank);
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            hitTanks();
            this.repaint();
        }
    }
}
