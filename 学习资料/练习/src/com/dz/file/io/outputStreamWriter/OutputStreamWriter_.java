package com.dz.file.io.outputStreamWriter;

import java.io.*;

/**
 * 字节流转换为字符流
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String file = "D:\\JAVA\\io\\outputStreamWriter.txt";
        OutputStreamWriter osw =
                new OutputStreamWriter(new FileOutputStream(file), "utf-8");
        osw.write("编码格式为utf-8");
        System.out.println("写入成功");
        osw.close();
    }
}
