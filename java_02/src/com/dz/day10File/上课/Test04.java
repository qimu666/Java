package com.dz.day10File.上课;

import java.io.*;

public class Test04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\学习\\java_02\\src\\com\\dz\\day10File\\上课\\输出流.txt");
        InputStreamReader itr=new InputStreamReader(fis,"utf-8");
        int count =0;
        while ((count=itr.read())!=-1){
            System.out.print((char)count);
        }
        fis.close();
    }
}
