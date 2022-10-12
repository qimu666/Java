package com.dz.file.io.fileOutputStream;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    @Test
    public void writeFile01() {

        String file = "D:\\JAVA\\io\\fileOutputStream.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //new FileOutputStream(file,);默认是覆盖
            //new FileOutputStream(file,true);true是追加到末尾
            fileOutputStream = new FileOutputStream(file, true);
            //写入一个字节
//            fileOutputStream.write('c');
            //写入多个字符串
            String str = "1qimujs浅浅2";
//            fileOutputStream.write(str.getBytes());//str.getBytes() 可以把字符串转为字节数组
            //
            String str2 = "qimujs浅浅";
            //write(byte[] b, int off, int len )将len字节从off->len输出 是闭合区间[off,len)
            fileOutputStream.write(str2.getBytes(), 0, 3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
