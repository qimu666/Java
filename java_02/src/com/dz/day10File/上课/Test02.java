package com.dz.day10File.上课;

import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\学习\\java.log");
            byte[] bytes = new byte[10200];
            int count = 0;
            while ((count = fis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, count));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
