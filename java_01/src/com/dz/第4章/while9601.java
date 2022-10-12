package com.dz.第4章;

import java.util.Scanner;

public class while9601 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String cj;
        System.out.println("合格了吗？（y/n）");
        cj = sr.next();
           while (!"y".equals(cj)) {
               System.out.println("上午阅读素材！");
               System.out.println("下午上机练习！");
               System.out.println("合格了吗？（y/n）");
               cj = sr.next();
               System.out.println("完成学习任务！！！");
           }
     }
}
