package com.dz.file.io.printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 字节打印流(输出流)
 */
public class PrintStream_ {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = System.out;
        out.println("柒木");
        out.println("字节打印流");
        out.close();
        String file = "D:\\JAVA\\io\\printStream.txt";
        System.setOut(new PrintStream(file));
        System.out.println("柒木");
        System.out.println("666");
        System.out.println("字节打印流");
    }
}
