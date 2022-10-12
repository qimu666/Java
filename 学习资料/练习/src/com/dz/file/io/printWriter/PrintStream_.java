package com.dz.file.io.printWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 字符打印流（输出流）
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        String file = "D:\\JAVA\\io\\printWriter.txt";
        PrintWriter printWriter = new PrintWriter(new FileWriter(file));
        printWriter.println("字符打印流");
        /** 必须关闭流，否则不会打印数据**/
        printWriter.close();
    }
}
