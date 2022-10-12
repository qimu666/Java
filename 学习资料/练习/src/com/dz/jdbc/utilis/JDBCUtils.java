package com.dz.jdbc.utilis;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String user;
    private static String password;
    private static String url;
    private static String driver;


    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("练习/src/mysql.properites"));
             user = properties.getProperty("user");
             password = properties.getProperty("password");
             url = properties.getProperty("url");
            driver = properties.getProperty("driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //连接数据库
    public static Connection connection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            //将编译异常转为运行异常
            //调用者，可以选择捕获该异常，也可以默认处理该异常，比较方便
            throw new RuntimeException(e);
        }
    }

    //关闭资源
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
