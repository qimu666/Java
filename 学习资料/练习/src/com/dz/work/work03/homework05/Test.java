package com.dz.work.work03.homework05;

public class Test {
    public static void main(String[] args) {
        /*有-个Car类，有属性temperature(温度)，车内有Air(空调)类，有吹风的功能fIow,
          Ai会监视车内的温度，如果温度超过40度则吹冷气。如果温度低于0度则吹暖气，如果在这之
          间则关掉空调。实例化具有不同温度的Car对象，调用空调的flow方法，测试空调吹的风是香正确.
         */
        Car car = new Car(40);
        car.getAir().flow();
        Car car1 = new Car(50);
        car1.getAir().flow();
        Car car2 = new Car(-1);
        car2.getAir().flow();
    }
}
