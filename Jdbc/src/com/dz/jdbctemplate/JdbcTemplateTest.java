package com.dz.jdbctemplate;

import com.dz.entity.Student;
import com.dz.utils.DruidUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class JdbcTemplateTest {
//    Spring框架对JDBC进行了封装，提供了一个JdbcTemplate对象，所以说JDBC的代码变的很假简单
//    使用JdbcTemplate对象的前提：需要导入Spring的.jar包
//    JdbcTemplate对象提供了5个常用的方法：
//    1.update()：执行DML语句，完成增、删、改操作
//    2.queryForMap()：查询结果集，将结果集封装为Map集合
//      返回的长度只能为1
//    3.queryForList()：查询结果集，将结果集封装为List集合
//      将每条数据封装为Map集合，然后再将Map集合装到List集合中
//    4.query()：查询结果，将结果封装为JavaBean对象（常用）
//      使用BeanPropertyRowMapper类可以完成JavaBean的自动封装
//    5.queryForObject()：查询结果，将结果封装为对象
//      一般情况下在聚合函数中使用

    //        创建JdbcTemplate对象,调用DruidUtils工具类,定义为全局变量，这样的话每个方法都可以使用
    JdbcTemplate jdbcTemplate = new JdbcTemplate(DruidUtils.getDataSource());


    //    添加
    @Test
    public void JdbcTemplateAdd() {
//        定义一个sql语句
        String sql = "INSERT INTO student(NAME,age,sex)VALUES('张三','20','男');";
//        执行sql语句，返回结果是数据库中的行数
        int update = jdbcTemplate.update(sql);
//        判断是否执行成功
        if (update >= 1) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    //    删除student表中id为2的数据
    @Test
    public void JdbcTemplateDelete() {
//        定义sql语句，并执行sql，返回结果是数据库中的行数
        int update = jdbcTemplate.update("DELETE FROM student WHERE id=2;");
        System.out.println(update);
    }

    //    把student表中id为3的学生姓名修改为111
    @Test
    public void JdbcTemplateUpdate() {
//        定义sql语句，并执行sql，返回结果是数据库中的行数
        int update = jdbcTemplate.update("UPDATE student SET NAME='111' WHERE id=3");
        System.out.println(update);
    }

    //    查询Studnet表中id为3的数据
    @Test
    public void JdbcTemplateFindById() {
//        定义sql语句，并执行sql，返回结果集封装为Map集合
        Map<String, Object> map = jdbcTemplate.queryForMap("select * from student where id=3;");
        System.out.println(map);
    }

    //    使用queryForList()查询Studnet表中所有的数据
    @Test
    public void JdbcTemplateFindList() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM student");
//        使用增强for循环，遍历输出集合中的数据，让每条数据进行换行
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }

    //    使用query()查询Student表中所有的数据
    @Test
    public void JdbcTemplateFindStudent() {
        List<Student> list = jdbcTemplate.query("SELECT * FROM student", new BeanPropertyRowMapper<Student>(Student.class));
//        使用增强for循环，遍历输出集合中的数据，让每条数据进行换行
        for (Student student : list) {
            System.out.println(student);
        }
    }

    //    使用queryForObject()查询Student表中学生的数量
    @Test
    public void JdbcTemplateCount() {
        Integer integer = jdbcTemplate.queryForObject("SELECT COUNT(id) FROM student", Integer.class);
        System.out.println(integer);
    }

}