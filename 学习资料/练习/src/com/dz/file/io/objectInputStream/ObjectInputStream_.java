package com.dz.file.io.objectInputStream;


import com.dz.file.io.objecOutputStream.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String storageFile = "D:\\JAVA\\io\\objectOutputStream.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(storageFile));
        //反序列化必须和序列化顺序一致，否则会出现异常
        System.out.println(ois.readInt());
        System.out.println(ois.readUTF());
        System.out.println(ois.readDouble());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        Object o = ois.readObject();
        System.out.println(o);
        //1.如果我们希望调用Dog类的方法，需要向下转型
        //2.需要我们将Dog类的定义，放到我们可以引用的位置，或者做为公共类public类型
        Dog dog = (Dog) o;
        System.out.println(dog.getAge());
        ois.close();
    }
}
