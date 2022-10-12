package com.dz.tankGame01;

public class FireBullets implements Runnable {
    int x;
    int y;
    private int direction = 0;
    private int speed = 5;
    private boolean loop = true;
    boolean isLive = true;//子弹是否存活

    public FireBullets(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            switch (direction) {
                case 0:
                    y -= speed;
                    break;
                case 1:
                    x += speed;
                    break;
                case 2:
                    y += speed;
                    break;
                case 3:
                    x -= speed;
                    break;
            }
//            System.out.println("x=" + x + "\ty=" + y);
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750)) {
                loop = false;
                isLive = false;
                break;
            }
        }
    }
}
