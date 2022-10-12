package com.dz.work.work05.HomeWork03;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        /*(1)编写java程序，输入形式为：Han Shun Ping的人名，以Ping,Han.S的形式打印出来。
           其中.S是中间单词的首字母。
           (2)例如输入“Willian Jefferson Clinton”,输出形式为：Clinton,Villian .J
         */
        String name = "Han Shun Ping";
        printNAme(name);
    }

    public static void printNAme(String str) {
        if (str == null) {
            System.out.println("不能为空");
            return;
        }
        String[] s = str.split(" ");
        if (s.length != 3) {
            System.out.println("格式输入不正确");
            return;
        }
        //占位符                                              // 先把所有字符转为大写  取第一个字符
        String format = String.format("%s,%s .%c", s[2], s[0], s[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
