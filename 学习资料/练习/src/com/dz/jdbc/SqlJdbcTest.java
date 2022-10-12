package com.dz.jdbc;

import com.dz.jdbc.utilis.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlJdbcTest {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        // (1)添加
        String sql = "insert into admin value (null ,?,?)";
        // (2)修改
//        String sql = "update admin set username=? where username=?";
        // (3)删除
//        String sql = "delete from admin where username=?";
        try {
            connection = JDBCUtils.connection();
            preparedStatement = connection.prepareStatement(sql);
            // (1)添加
            preparedStatement.setString(1, "张三");
            preparedStatement.setString(2, "1234");
            // (2)修改
//            preparedStatement.setString(1, "李四");
//            preparedStatement.setString(2, "张三");
            // (3)删除 username为李四的数据
//            preparedStatement.setString(1, "李四");
            int i = preparedStatement.executeUpdate();
            System.out.println(i > 0 ? "执行成功" : "执行失败");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
