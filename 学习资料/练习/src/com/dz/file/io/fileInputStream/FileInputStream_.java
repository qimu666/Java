package com.dz.file.io.fileInputStream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ {
    /**
     * 字节输入流
     * ->文件输出到>>程序
     */
    @Test
    public void readFile01() {
        String file = "D:\\JAVA\\io\\fileInputStream.txt";
        FileInputStream fileInputStream = null;
        int readData = 0;
        try {
            //创建FileInputStream对象用于读取文件
            fileInputStream = new FileInputStream(file);
            //while循环读取一个字节的数据，存放到readData中，再转为char类型输出,文字内容会乱码
            //如果返回-1，说明已经读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);//转为char类型输出
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 字节输入流
     * ->文件输出到>>程序
     * 优化读取速度，用read(char[] b)方法优化
     */
    @Test
    public void readFile02() {
        String file = "D:\\JAVA\\io\\fileInputStream.txt";
        FileInputStream fileInputStream = null;
        byte[] data = new byte[8];//定义一个长度为8的字符类型的数组，字符会乱码
        try {
            //创建FileInputStream对象用于读取文件
            fileInputStream = new FileInputStream(file);
            //while循环读取一次读取byte[]数组长度大小的数据，即一次读取8个数据
            //如果返回-1，说明已经读取完毕
            //如果返回正常，返回实际读取的字节数
            int readLength = 0;
            while ((readLength = fileInputStream.read(data)) != -1) {
                System.out.print(new String(data, 0, readLength));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
