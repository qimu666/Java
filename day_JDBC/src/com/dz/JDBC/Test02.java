package com.dz.JDBC;

import java.sql.*;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
//        2.连接数据库
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/qm?characterEncoding=utf8","root","1234");
//        3.获得SQL对象
        Statement statement = conn.createStatement();
//        定义sql
        String sql="SELECT * FROM qimu;";
//        4.获取sql语句，并执行SQL语句  DQL语句: 查询, 返回ResultSet
        ResultSet resultSet = statement.executeQuery(sql);
//        5.处理返回结果，
//        next()查找下一行，resultSet.next()循环找每一行结果
        while (resultSet.next()){
//            1代表获取数据库中第一行的数据
//            int anInt = resultSet.getInt(1);
//            String string = resultSet.getString(2);
//            double aDouble = resultSet.getDouble(3);
//            System.out.println(anInt+"\t"+string+"\t"+aDouble);
            int sid = resultSet.getInt("sid");
            String sname = resultSet.getString("sname");
            String sex = resultSet.getString("sex");
            int age = resultSet.getInt("age");
            System.out.println(sid+"\t"+sname+"\t"+sex+"\t"+age);
        }

//        6.释放资源
        resultSet.close();
        conn.close();
        statement.close();
    }
}
