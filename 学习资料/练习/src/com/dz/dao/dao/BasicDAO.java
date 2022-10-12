package com.dz.dao.dao;

import com.dz.jdbc.utilis.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BasicDAO<T> {
    private QueryRunner queryRunner = new QueryRunner();

    public int update(String sql, Object... parameters) {
        Connection connection = null;
        try {
            connection = JDBCUtils.connection();
            int update = queryRunner.update(connection, sql, parameters);
            return update;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(null, null, connection);
        }
    }

    public List<T> QueryMulti(String sql, Class<T> clazz, Object... parameters) {
        Connection connection = null;
        try {
            connection = JDBCUtils.connection();
            return queryRunner.query(connection, sql, new BeanListHandler<>(clazz), parameters);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(null, null, connection);
        }
    }

    public T single(String sql, Class<T> clazz, Object... parameters) {
        Connection connection = null;
        try {
            connection = JDBCUtils.connection();
            return queryRunner.query(connection, sql, new BeanHandler<T>(clazz), parameters);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(null, null, connection);
        }
    }

    public Object Scalar(String sql, Object... parameters) {
        Connection connection = null;
        try {
            connection = JDBCUtils.connection();
            return queryRunner.query(connection,sql, new ScalarHandler<T>(), parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(null, null, connection);
        }
    }
}
