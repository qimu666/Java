package com.dz.aggregate.set.linkedHashSet;


import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class LinkedHashSetTest01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
      /*  Car类（属性：name,price),如果name和price一样，
           则认为是相同元素，就不能添动加。
       */
        Set set = new LinkedHashSet();
        set.add(new Car("奥迪", 10000));
        set.add(new Car("法拉利", 20000));
        set.add(new Car("奥迪", 40000));
        set.add(new Car("保时捷", 30000));
        set.add(new Car("保时捷", 10000));
        set.add(new Car("奥迪", 10000));
        set.add(new Car("保时捷", 30000));
        for (Object o : set) {
            System.out.println(o);
        }
    }
}

class Car {
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}