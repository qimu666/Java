package com.dz.jdbc.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class C3p0Test {
    @Test
    public void c3p0() throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("qimu");
//        String sql = "insert into admin2 value (null ,?,?)";
        long steat = System.currentTimeMillis();
        for (int i = 0; i < 50000000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - steat);
    }
}
