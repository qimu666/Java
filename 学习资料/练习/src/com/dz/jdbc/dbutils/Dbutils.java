package com.dz.jdbc.dbutils;


import com.dz.jdbc.druid.Admin;
import com.dz.jdbc.utilis.JDBCDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

public class Dbutils {
    @Test
    //返回结果是多行的情况
    public void testQueryMany() throws Exception {
        Connection connection = JDBCDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from admin";
        //返回一个集合
        List<Admin> list = queryRunner.query(connection, sql, new BeanListHandler<>(Admin.class));
        for (Admin admin : list) {
            System.out.println(admin);
        }
        JDBCDruid.close(null, null, connection);
    }

    @Test
    //返回结果是单行记录（单个对象）
    public void testQuerySingle() throws Exception {
        Connection connection = JDBCDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from admin where id =?";
        Admin admin = queryRunner.query(connection, sql, new BeanHandler<>(Admin.class), 1);
        if (admin != null) {
            System.out.println("查询成功\n" + admin);
        } else {
            System.out.println("不存在");
        }
        JDBCDruid.close(null, null, connection);
    }

    @Test
    //查询单行单列
    public void testScalar() throws Exception {
        Connection connection = JDBCDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select username from admin where id =?";
        Object obj = queryRunner.query(connection, sql, new ScalarHandler<>(), 1);
        if (obj != null) {
            System.out.println("查询成功\n" + obj);
        } else {
            System.out.println("不存在");
        }
        JDBCDruid.close(null, null, connection);
    }
}
