package com.dz.file.io.inputStreamReader;

import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.InputStreamReader;

/**
 * 字节流转换为字符流
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws Exception {
        String file = "D:\\JAVA\\io\\fileInputStream.txt";
        //解决乱码,转换类型
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "gbk");
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        //关闭外层流就行了
        br.close();
    }
}
