package com.dz.JDBC;

import java.sql.*;
import java.util.Scanner;

public class user {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
//      定义输入的用户名和密码
        System.out.println("请输入用户名:");
        String name = scanner.next();
        System.out.println("请输入密码：");
        String pws = scanner.next();
//        String name = "dsgsd";
//        String pws = "'or' 1 '=' 1";

//        1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
//        2.JDBC链接数据库
        Connection root = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?characterEncoding=utf8", "root", "1234");
//        3.创建Statement sql对象
        Statement statement = root.createStatement();
//        4.获取Sql语句，并执行sql、调用sql
        ResultSet resultSet = statement.executeQuery("SELECT USER,PASSWORD FROM USER WHERE USER='"+name+"' AND PASSWORD='"+pws+"';");
//        5.验证结果，next()下一行的意思，判断数据库中的用户名和密码，是否跟输入的用户名和密码相等
        if (resultSet.next()){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
//        6.释放资源
        resultSet.close();
        statement.close();
        root.close();
    }
}
