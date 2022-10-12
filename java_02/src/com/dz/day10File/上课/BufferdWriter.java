package com.dz.day10File.上课;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdWriter {

    public static void main(String[] args) throws IOException {
//        字符输出流
        FileWriter fw = new FileWriter("D:\\学习\\java_02\\src\\com\\dz\\day10File\\上课\\aa.txt");
//        将字符输出流转换为缓存输入流
        BufferedWriter bufferedWriter = new BufferedWriter(fw);
        for (int i = 1; i <= 5; i++) {
            bufferedWriter.write("qwrdf");
//            newLine换行
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
