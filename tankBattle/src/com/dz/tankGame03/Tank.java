package com.dz.tankGame03;

public class Tank {
    private int x;
    private int y;
    private int direction = 0;
    public int speed = 3;
    boolean isLive=true;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void up() {
        y -= speed;
    }

    public void down() {
        y += speed;
    }

    public void right() {
        x += speed;
    }

    public void left() {
        x -= speed;
    }
}
