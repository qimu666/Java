package com.dz.inherit.transition;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animal1 = new Cat();
        animal.eat();
        animal.run();
        animal.cry();
        Dog dog = (Dog) animal;
        dog.QW();
        Cat cat=(Cat) animal1;
        animal1.eat();
        animal1.run();
        animal1.cry();
        cat.QW();
    }
}
