package com.dz.第11章;

import java.util.Scanner;

public class d2590401 {
    Scanner scanner=new Scanner(System.in);
    String name,xingbie,xuexiao;
    String age;
    public void xjk(){
        System.out.println("\n将该学生信息成功写入到数据库");
//        System.out.println(name+" "+age+" "+xingbie+" "+xuexiao);
        String[] a={name,age,xingbie,xuexiao};
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n请输入修改的姓名：");
        a[0]=scanner.next();
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n修改成功！");
    }
}
