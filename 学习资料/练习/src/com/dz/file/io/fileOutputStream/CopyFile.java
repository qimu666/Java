package com.dz.file.io.fileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        //文件拷贝
        String read = "D:\\JAVA\\io\\fileInputStream.txt";
        String write = "D:\\JAVA\\io\\fileOutputStream.txt";
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try {
            fileOutputStream = new FileOutputStream(write, true);
            fileInputStream = new FileInputStream(read);
            byte[] data = new byte[5];
            int dataLength = 0;
            while ((dataLength = fileInputStream.read(data)) != -1) {
                //一边读一边写
                fileOutputStream.write(data, 0, dataLength);
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
