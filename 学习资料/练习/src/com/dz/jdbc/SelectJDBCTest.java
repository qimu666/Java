package com.dz.jdbc;

import com.dz.jdbc.utilis.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectJDBCTest {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        String sql = "select * from admin";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            JDBCUtils.connection();
            preparedStatement = JDBCUtils.connection().prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                System.out.println(id + "\t" + username + "\t" + password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, preparedStatement, connection);
        }
    }
}
