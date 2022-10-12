package com.dz.string;

import com.sun.jdi.Value;

public class Test {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = new String("abc");
        System.out.println(str.equals(str1));
        System.out.println(str == str1);
        System.out.println(str==str1.intern());
    }
}
