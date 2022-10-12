package com.dz.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test01 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
//        ?characterEncoding=utf8
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/qm?characterEncoding=utf8","root","1234");
        Statement statement = conn.createStatement();
//        增删改
        int z = statement.executeUpdate("INSERT INTO qimu (sname,sex,age) VALUES ('张三','男','13');");
//        int  s= statement.executeUpdate("DELETE FROM student WHERE sid=6;");
        int  g= statement.executeUpdate("UPDATE qimu SET sname='李四',age=18 WHERE sid=7;");
//
        if (z>0){
            System.out.println("添加成功");
        }else
            {
                System.out.println("添加失败");
            }
//
//        if (s > 0) {
//            System.out.println("删除成功");
//        } else {
//            System.out.println("删除失败");
//        }
        if (g>0){
            System.out.println("修改成功");
        }else
        {
            System.out.println("修改失败");
        }
        statement.close();
        conn.close();
    }

}
