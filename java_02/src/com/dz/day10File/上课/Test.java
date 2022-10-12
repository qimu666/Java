package com.dz.day10File.上课;

import java.io.File;
import java.io.IOException;


public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("aa.txt");
        if(file.exists()){
            System.out.println("目录已存在");
        }else{
//       file.createNewFile();
            System.out.println("创建成功");
        }
        file.delete();
    }
}
















