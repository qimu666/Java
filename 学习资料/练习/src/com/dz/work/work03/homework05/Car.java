package com.dz.work.work03.homework05;

public class Car {
    //有-个Car类，有属性temperature(温度)
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    //    public void getAir() {
    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("温度大于40度,吹冷风");
            } else if (temperature < 0) {
                System.out.println("温度小于0度,吹暖风");
            } else {
                System.out.println("温度正常，空调关闭中");
            }
        }
    }
//        Air air = new Air();
//        air.flow();

//    }
    public Air getAir() {
        return new Air();
    }
}
