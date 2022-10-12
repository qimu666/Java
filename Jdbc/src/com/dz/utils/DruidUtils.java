package com.dz.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.dz.druid.DruidTest;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DruidUtils {
    //    定义一个DataSource成员变量
    private static DataSource ds;

    static {
        try {
//        3.创建Properties对象，加载配置文件
            Properties properties = new Properties();
//            通过输入流加载配置文件
            InputStream is = DruidTest.class.getClassLoader().getResourceAsStream("druid.properties");
//        从输入流中读取属性
            properties.load(is);
//        4.通过DruidDataSourceFactory获取数据库连接池对象
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    获取连接
    public static Connection getConnection() throws Exception {
        return ds.getConnection();
    }

    //    释放资源
    public static void closeAll(Statement statement, Connection connection, ResultSet resultSet) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    //    获取连接池的方法
    public static DataSource getDataSource() {
        return ds;
    }
}
