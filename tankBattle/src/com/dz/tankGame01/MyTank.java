package com.dz.tankGame01;


public class MyTank extends Tank {
    private boolean loop = true;
    private int num = 0;
    FireBullets fireBullets = null;

    public MyTank(int x, int y) {
        super(x, y);
    }

    public void shootingBullet() {
        switch (getDirection()) {
            case 0:
                fireBullets = new FireBullets(getX() + 20, getY(), 0);
                break;
            case 1:
                fireBullets = new FireBullets(getX() + 60, getY() + 20, 1);
                break;
            case 2:
                fireBullets = new FireBullets(getX() + 20, getY() + 60, 2);
                break;
            case 3:
                fireBullets = new FireBullets(getX(), getY() + 20, 3);
                break;
        }
        new Thread(fireBullets).start();
    }
}
