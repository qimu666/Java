package com.dz.day10File.上课.ye270;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\学习\\java_02\\src\\com\\dz\\day10File\\上课\\输入流.txt");
        FileReader fr = new FileReader("D:\\学习\\java_02\\src\\com\\dz\\day10File\\上课\\输出流.txt");
        char[] chars = new char[2];
        int count = 0;
        while ((count = fr.read(chars)) != -1) {
            fw.write(chars, 0, count);
        }
        fw.close();
        fr.close();
        System.out.println("复制成功");
    }
}
