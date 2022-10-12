package com.dz.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {


    }

    @Test
    public void newFile() {
        //1.
//        File file = new File("D:\\JAVA\\学习资料\\练习\\src\\com\\dz\\file\\test.txt");
        //2.
//        String fileParent = "D:\\JAVA\\学习资料\\练习\\src\\com\\dz\\file";
//        File file = new File(fileParent);
//        String child = "test02.txt";
        //3.
        String fileParent = "D:\\JAVA\\学习资料\\练习\\src\\com\\dz\\file";
        String child = "test03.txt";
        File file1 = new File(fileParent, child);
//        try {
//            //1.第一种方式
////            file.createNewFile();
//            // 第二，三种方式
//            file1.createNewFile();
//        System.out.println("创建成功");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(file1.getName());
        System.out.println("文件绝对路径=" + file1.getAbsolutePath());
        System.out.println("文件父级目录=" + file1.getParent());
        System.out.println("文件大小（字节）=" + file1.length());
        System.out.println("文件是否存在=" + file1.exists());//T
        System.out.println("是不是一个文件=" + file1.isFile());//T
        System.out.println("是不是一个目录=" + file1.isDirectory());//F
    }

    @Test
    public void delete01() {
        File file = new File("D:\\JAVA\\学习资料\\练习\\src\\com\\dz\\file\\test.txt");
        if (file.exists()) {
            if (file.delete())
                System.out.println(file.getName() + "删除成功");
            else
                System.out.println(file.getName() + "删除失败");
        } else {
            System.out.println(file.getName() + "不存在");
        }
    }

    @Test
    //file目录下是否有qimu文件夹，存在就删除,目录也被当成一种文件处理
    public void delete02() {
        File file = new File("D:\\JAVA\\学习资料\\练习\\src\\com\\dz\\file\\qimu");
        if (file.exists()) {
            if (file.delete())
                System.out.println(file.getName() + "删除成功");
            else
                System.out.println(file.getName() + "删除失败");
        } else {
            System.out.println(file.getName() + "不存在");
        }
    }

    @Test
    //    判断file目录下是否存在 qimu\\q\\m  文件夹，存在提示存在，不存在就创建
    public void create() {
        File file = new File("D:\\JAVA\\学习资料\\练习\\src\\com\\dz\\file\\qimu\\q\\m");
        if (file.exists()) {
            System.out.println(file.getName() + "已存在");
        } else {
            //创建一级目录用mkdir()，创建多级目录用mkdirs()
            if (file.mkdirs())
                System.out.println(file.getName() + "创建成功");
            else
                System.out.println(file.getName() + "创建失败");
        }
    }
}
