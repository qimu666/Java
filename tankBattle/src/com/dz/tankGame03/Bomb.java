package com.dz.tankGame03;

public class Bomb {
    int x, y;
    int life = 9;
    boolean isLive = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void life() {
        if (life > 0) {
            life--;
        } else {
            isLive = false;
        }
    }
}
