package com.dz.day10File.上课.ye271;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\学习\\java_02\\src\\com\\dz\\day10File\\上课\\aa.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fw);
        FileReader fileReader = new FileReader("D:\\学习\\java_02\\src\\com\\dz\\day10File\\上课\\bb.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuffer sb = new StringBuffer();
    }
}
