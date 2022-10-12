package com.dz.tankGame01;

import java.util.Vector;

public class EnemyTank extends Tank {

    Vector<FireBullets> enemy = new Vector();

    public EnemyTank(int x, int y) {
        super(x, y);
    }
}
