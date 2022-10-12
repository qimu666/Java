package com.dz.file.io.bufferedCopy;

import org.junit.Test;

import java.io.*;

public class BufferedCopy {
    /**
     * bufferedReader，bufferedWriter只能拷贝文本文件，不能拷贝二进制文件否则文件会损坏
     * bufferedWriter写入时要加newLine()方法，否则数据都会写在一行
     */
    @Test
    public void bufferedCopy01() {
        String readerData = "D:\\JAVA\\io\\fileReader.txt";
        String targetFile = "D:\\JAVA\\io\\bufferedCopy.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String line;
        try {
            bufferedReader = new BufferedReader(new FileReader(readerData));
            bufferedWriter = new BufferedWriter(new FileWriter(targetFile));
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();//换行符
            }
            System.out.println("拷贝成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * bufferedInputStream,bufferedOutputStream用来处理字节文件：视频，音乐，图片等，
     * 也可以处理文本文件
     */
    @Test
    public void bufferedCopy02() {
        String readerData = "D:\\JAVA\\io\\一直很安静.mp4";
        String targetFile = "D:\\JAVA\\io\\copy.mp4";
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(readerData));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(targetFile));
            byte[] data = new byte[1024];
            int dataLength = 0;
            while ((dataLength = bufferedInputStream.read(data)) != -1) {
                bufferedOutputStream.write(data, 0, dataLength);
            }
            System.out.println("拷贝成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
