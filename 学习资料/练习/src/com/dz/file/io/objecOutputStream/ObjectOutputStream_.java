package com.dz.file.io.objecOutputStream;

import java.io.*;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        String storageFile = "D:\\JAVA\\io\\objectOutputStream.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(storageFile));
        oos.writeInt(100);
        oos.writeUTF("柒木");
        oos.writeDouble(12.3);
        oos.writeBoolean(true);
        oos.writeChar('柒');
        oos.writeObject(new Dog("小黑", 10));
        oos.close();
        System.out.println("序列化完毕");
    }
}

