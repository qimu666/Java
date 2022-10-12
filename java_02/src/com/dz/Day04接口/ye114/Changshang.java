package com.dz.Day04接口.ye114;

public class Changshang implements CPU,Memory,HardDisk,GraphicsCard{
    @Override
    public void cpu() {
        System.out.println("CPU品牌：Intel\tCPU系列：酷睿I7\tCPU型号：I7-4790K\tCPU主频：4GHz");
    }

    @Override
    public void memory() {
        System.out.println("内存容量：4G");
    }

    @Override
    public void harddisk() {
        System.out.println("硬盘容量：1T\t硬盘转速：7200");
    }

    @Override
    public void graphicscard() {
        System.out.println("显卡品牌：七彩虹COLORFUL\t显卡型号：iGame750Ti 烈焰战神U-Twin-2GD5\t显存：2G");
    }
}
