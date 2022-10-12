package com.dz.file.io.properties;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class properties_ {

    @Test
    public void read() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("练习/src/com/dz/file/io/properties/ceshi.properties"));
        properties.list(System.out);
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println("用户名" + user + "\n密码" + password);
    }

    @Test
    public void writer() throws IOException {
        Properties properties = new Properties();
        //如果该文件key不存在就创建一个，存在就覆盖值（可以理解为修改）
        properties.setProperty("user", "qimu");
        properties.setProperty("password", "1234");
        properties.setProperty("name", "柒木");
        properties.setProperty("name", "李四");
        properties.store(new FileOutputStream("练习/src/com/dz/file/io/properties/ceshi2.properties"),"配置文件");
        System.out.println("执行成功");
    }
}