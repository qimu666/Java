package com.dz.work.work05.HomeWork04;

public class Test {
    public static void main(String[] args) {
        //输入字符串，判断里面有多少个大写字母，多少个小写字母，多少个数字
        String name = "sAAAduwqiu17414948@.";
        statistics(name);
    }

    public static void statistics(String str) {
        int capital = 0;//大写
        int lowerCase = 0;//小写
        int num = 0;
        int other = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCase++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                capital++;
            } else {
                other++;
            }
        }
        System.out.println("大写" + capital);
        System.out.println("小写" + lowerCase);
        System.out.println("数字" + num);
        System.out.println("其他" + other);
    }
}
