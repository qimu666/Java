package com.dz.习题.oo1;

import java.io.*;
import java.util.ArrayList;

public class Test extends Car{
    public static void main(String[] args) throws IOException {
        Car car = new Car("A001", "宝马", 10000000);
        Car car1 = new Car("A002", "奔驰", 900000);
        Car car2= new Car("A003", "凯迪拉克", 800000);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        FileWriter fw = new FileWriter("D:\\学习\\java_02\\src\\com\\dz\\day10File\\上课\\car.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fw);
        for (Car car3 : cars) {
            bufferedWriter.write(String.valueOf(car3));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
