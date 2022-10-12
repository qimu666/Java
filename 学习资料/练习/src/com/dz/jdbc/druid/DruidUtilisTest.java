package com.dz.jdbc.druid;


import com.dz.jdbc.utilis.JDBCDruid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DruidUtilisTest {
    public static void main(String[] args) throws Exception {
        Connection connection = null;
        String sql = "select * from admin";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Admin> admins = new ArrayList<>();
        try {
            connection = JDBCDruid.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                admins.add(new Admin(id,username, password));
                for (Admin admin : admins) {
                    System.out.println(admin);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCDruid.close(resultSet, preparedStatement, connection);
        }
    }
}
