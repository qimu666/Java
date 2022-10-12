package com.dz.tankGame01;

class Tank {
    private int x;
    private int y;
    private int direction;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void moveUP() {
        y -= speed;
    }

    public void down() {
        y += speed;
    }

    public void lift() {
        x -= speed;
    }

    public void right() {
        x += speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
