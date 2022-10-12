package com.dz.tankGame03;

import java.util.Vector;

public class MyTank extends Tank {
    Bullet bullet = null;
    Vector<Bullet> bullets = new Vector<>();

    public MyTank(int x, int y) {
        super(x, y);
    }

    public void shooting() {
        if (bullets.size() == 5) {
            return;
        }
        switch (getDirection()) {
            case 0:
                bullet = new Bullet(getX() + 20, getY(), getDirection());
                break;
            case 1:
                bullet = new Bullet(getX() + 60, getY() + 20, getDirection());
                break;
            case 2:
                bullet = new Bullet(getX() + 20, getY() + 60, getDirection());
                break;
            case 3:
                bullet = new Bullet(getX(), getY() + 20, getDirection());
                break;
        }
        bullets.add(bullet);
        new Thread(bullet).start();
    }
}
