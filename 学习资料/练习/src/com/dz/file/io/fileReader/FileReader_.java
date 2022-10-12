package com.dz.file.io.fileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {
        String reader = "D:\\JAVA\\io\\fileReader.txt";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(reader);
            char[] data = new char[8];
            int dataLength = 0;
            while ((dataLength = fileReader.read(data)) != -1) {
                System.out.print(new String(data, 0, dataLength));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
