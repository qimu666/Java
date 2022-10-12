package com.dz.utilis;


import java.sql.*;

public class JDBCUtils {
    private static String user = "root";
    private static String password = "1234";
    private static String url="jdbc:mysql://localhost:3306/study?characterEncoding=utf8";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //连接数据库
    public static Connection getconnection() {
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
