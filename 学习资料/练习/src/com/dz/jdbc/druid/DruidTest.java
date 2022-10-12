package com.dz.jdbc.druid;


import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidTest {
    @Test
    public void druid() throws Exception {
        //创建Properties，读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("练习/src/druid.properties"));
        DataSource dataSource =
                DruidDataSourceFactory.createDataSource(properties);
        long steat = System.currentTimeMillis();
        for (int i = 0; i < 50000000; i++) {
            Connection connection = dataSource.getConnection();
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - steat);
    }
}
