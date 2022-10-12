package com.dz.tankGame03;

import java.util.Vector;

public class EnemyTank extends Tank implements Runnable {
    Vector<Bullet> bullets = new Vector<>();
    boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {

        while (true) {
            if (isLive && bullets.size() <= ((int) (Math.random() * 6))) {
                Bullet b = null;
                switch (getDirection()) {
                    case 0:
                        b = new Bullet(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        b = new Bullet(getX() + 60, getY() + 20, 1);
                        break;
                    case 2:
                        b = new Bullet(getX() + 20, getY() + 60, 2);
                        break;
                    case 3:
                        b = new Bullet(getX(), getY() + 20, 3);
                        break;
                }
                bullets.add(b);
                new Thread(b).start();
            }

            int a = ((int) (Math.random() * 40) + 6);
            switch (getDirection()) {
                case 0:
                    for (int i = 0; i < a; i++) {
                        if (getY() > 0) {
                            up();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < a; i++) {
                        if (getX() + 60 < 1000) {
                            right();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < a; i++) {
                        if (getY() + 60 < 750) {
                            down();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < a; i++) {
                        if (getX() > 0) {
                            left();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setDirection((int) (Math.random() * 4));
            if (!isLive) {
                break;
            }
        }

    }
}
