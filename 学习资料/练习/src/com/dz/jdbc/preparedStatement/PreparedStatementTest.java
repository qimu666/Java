package com.dz.jdbc.preparedStatement;

import java.sql.*;

public class PreparedStatementTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/study?characterEncoding=utf8", "root", "1234");
//        String sql = "insert into admin value (null ,?,?)";
//        String sql = "update admin set username=? where username=?";
//        String sql="delete from admin where username=?";
        String sql ="select * from admin";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString(1, "王了哈哈哈");
//        preparedStatement.setString(2, "12344");
//        preparedStatement.setString(3, "789");
//        int i = preparedStatement.executeUpdate();
//        System.out.println(i > 0 ? "添加成功" : "添加失败");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            System.out.println(id+"\t"+username+"\t"+password);
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
