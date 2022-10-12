package com.dz.第7章;

import java.util.Scanner;

public class lei1680302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<=2;i++) {
            System.out.println("请输入用户名：");
            String sr = scanner.next();
            System.out.println("请输入登录密码:");
            String sr1 = scanner.next();
            lei1680301 dl = new lei1680301();
            dl.mm = sr;
            dl.zh = sr1;
//            dl.denglu();
            if (dl.mm.equals("peter")&&dl.zh.equals("123")){
                System.out.println("登录成功！");
                break;
            }else if (!sr.equals("dl.mm")||!"123".equals( dl.zh)){
                System.out.println("登录失败，请重新输入用户名和密码！"+"您还有"+(2-i)+"次机会");
            }
            if (i==2){
                System.out.println("您已3次输入有误，将退出系统！");
            }
        }
    }
}
