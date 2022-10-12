package com.dz.day10File.上课;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(
//                                                                                 添加true之后不会覆盖原有的数据
                "D:\\学习\\java_02\\src\\com\\dz\\day10File\\上课\\输入流.txt");
        fos.write('a');
        fos.write('是');
        String string = "adsaaaaaaaaaaaaaaaaddddddddddddd123ssjj数据集";
        fos.write(string.getBytes());
        fos.close();
        System.out.println("存储成功");

    }
}
