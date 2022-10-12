package com.dz.jdbc.batch;


import com.dz.jdbc.utilis.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 * 批处理
 */
public class Batch {
    @Test
    public void batch() throws Exception {
        Connection connection = JDBCUtils.connection();
        String sql = "insert into admin2 value (null ,?,?)";
        PreparedStatement
                preparedStatement = connection.prepareStatement(sql);
        long stear = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "张三" + i);
            preparedStatement.setString(2, "123");
            preparedStatement.addBatch();
            if ((i + 1) % 1000 == 0) {
                preparedStatement.executeBatch();
                preparedStatement.clearBatch();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - stear);
        JDBCUtils.close(null, preparedStatement, connection);
    }
}
