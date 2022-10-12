package com.dz.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidTest {
    public static void main(String[] args) throws Exception {
//        1.导入jar包：druid.jar
//        2.定义配置文件：druid.properties（可以叫任意名称）
//        3.创建Properties对象，加载配置文件
        Properties properties = new Properties();
        InputStream is = DruidTest.class.getClassLoader().getResourceAsStream("druid.properties");
//        从输入流中读取属性
        properties.load(is);
//        4.通过DruidDataSourceFactory获取数据库连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(properties);
//        5.获取连接getConnection()
        Connection connection = ds.getConnection();
        System.out.println(connection);
    }
}
