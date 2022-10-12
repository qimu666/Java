package com.dz.Day04接口.ye114;

public class ComputerTest {
    public static void main(String[] args) {
        Changshang changshang = new Changshang();
        Computer computer = new Computer();
        computer.print();
        changshang.cpu();
        changshang.memory();
        changshang.harddisk();
        changshang.graphicscard();
    }
}
