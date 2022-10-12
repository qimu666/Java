package com.dz.day10File.上课;


import java.io.FileReader;
import java.io.IOException;

public class BufferedReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\学习\\java_02\\src\\com\\dz\\day10File\\上课\\aa.txt");
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
        String aa=null;
        while ((aa=bufferedReader.readLine())!=null){
            System.out.println(aa);
        }
        fileReader.close();
    }
}
