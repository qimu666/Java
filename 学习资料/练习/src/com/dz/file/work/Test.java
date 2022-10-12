package com.dz.file.work;


import java.io.*;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.load(new FileReader("练习/src/com/dz/file/work/dog.properties"));
        String name = properties.get("name") + "";
        int age = Integer.parseInt(properties.getProperty("age") + "");
        String color = properties.get("color") + "";
        Dog dog = new Dog(name, age, color);
        System.out.println(dog.toString());
        String readerData = "D:\\JAVA\\io\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(readerData));
        oos.writeObject(dog);
        oos.close();

    }

    @org.junit.Test
    public void read() throws IOException, ClassNotFoundException {
        String readerData = "D:\\JAVA\\io\\dog.dat";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(readerData));
        Dog dog = (Dog) objectInputStream.readObject();
        System.out.println(dog);
        objectInputStream.close();
    }
}
