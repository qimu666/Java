package com.dz.tankGame02;

public class Bullet implements Runnable {
    int x;
    int y;
    private int direction = 0;
    private int speed = 10;
    boolean isLike = true;

    public Bullet(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
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
            System.out.println("x=" + x + "y=" + y);
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLike)) {
                isLike = false;
                break;
            }
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
