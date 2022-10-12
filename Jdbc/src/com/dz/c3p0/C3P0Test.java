package com.dz.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Test {
    public static void main(String[] args) throws SQLException {
//        1.导入两个jar包：c3p0.jar和mchange-commons-java.jar
//        2.定义配置文件：c3p0.properties或者c3p0-config.xml
//        3.获取DataSource对象
        DataSource ds = new ComboPooledDataSource();
//        4.获取连接
        for (int i = 1; i <= 11; i++) {
            Connection connection = ds.getConnection();
            System.out.println(i+":"+connection);
            if (i==5){
//                归还连接到连接池中
                connection.close();
            }
        }
    }
}
