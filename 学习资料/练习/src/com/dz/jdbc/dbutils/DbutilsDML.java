package com.dz.jdbc.dbutils;

import com.dz.jdbc.utilis.JDBCDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import java.sql.Connection;

public class DbutilsDML {
    @Test
    public void testDML() throws Exception {
        Connection connection = JDBCDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        // (1) 增加
//        String sql = "insert into admin value (null,?,?)";
        // (2) 修改
//        String sql = "update admin set username=? where username=?";
        // (3) 删除
        String sql = "delete from admin where username=?";

        // (1) 增加
//        int affectedRow = queryRunner.update(connection, sql, "李四", "456");
        // (2) 修改
//        int affectedRow = queryRunner.update(connection, sql, "麻子", "李四");
        // (3) 删除
        int affectedRow = queryRunner.update(connection, sql, "麻子");
        System.out.println(affectedRow > 0 ? "执行成功" : "执行没有影响数据库");
        JDBCDruid.close(null, null, connection);
    }
}
