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
//    Spring��ܶ�JDBC�����˷�װ���ṩ��һ��JdbcTemplate��������˵JDBC�Ĵ����ĺܼټ�
//    ʹ��JdbcTemplate�����ǰ�᣺��Ҫ����Spring��.jar��
//    JdbcTemplate�����ṩ��5�����õķ�����
//    1.update()��ִ��DML��䣬�������ɾ���Ĳ���
//    2.queryForMap()����ѯ����������������װΪMap����
//      ���صĳ���ֻ��Ϊ1
//    3.queryForList()����ѯ����������������װΪList����
//      ��ÿ�����ݷ�װΪMap���ϣ�Ȼ���ٽ�Map����װ��List������
//    4.query()����ѯ������������װΪJavaBean���󣨳��ã�
//      ʹ��BeanPropertyRowMapper��������JavaBean���Զ���װ
//    5.queryForObject()����ѯ������������װΪ����
//      һ��������ھۺϺ�����ʹ��

    //        ����JdbcTemplate����,����DruidUtils������,����Ϊȫ�ֱ����������Ļ�ÿ������������ʹ��
    JdbcTemplate jdbcTemplate = new JdbcTemplate(DruidUtils.getDataSource());


    //    ���
    @Test
    public void JdbcTemplateAdd() {
//        ����һ��sql���
        String sql = "INSERT INTO student(NAME,age,sex)VALUES('����','20','��');";
//        ִ��sql��䣬���ؽ�������ݿ��е�����
        int update = jdbcTemplate.update(sql);
//        �ж��Ƿ�ִ�гɹ�
        if (update >= 1) {
            System.out.println("��ӳɹ�");
        } else {
            System.out.println("���ʧ��");
        }
    }

    //    ɾ��student����idΪ2������
    @Test
    public void JdbcTemplateDelete() {
//        ����sql��䣬��ִ��sql�����ؽ�������ݿ��е�����
        int update = jdbcTemplate.update("DELETE FROM student WHERE id=2;");
        System.out.println(update);
    }

    //    ��student����idΪ3��ѧ�������޸�Ϊ111
    @Test
    public void JdbcTemplateUpdate() {
//        ����sql��䣬��ִ��sql�����ؽ�������ݿ��е�����
        int update = jdbcTemplate.update("UPDATE student SET NAME='111' WHERE id=3");
        System.out.println(update);
    }

    //    ��ѯStudnet����idΪ3������
    @Test
    public void JdbcTemplateFindById() {
//        ����sql��䣬��ִ��sql�����ؽ������װΪMap����
        Map<String, Object> map = jdbcTemplate.queryForMap("select * from student where id=3;");
        System.out.println(map);
    }

    //    ʹ��queryForList()��ѯStudnet�������е�����
    @Test
    public void JdbcTemplateFindList() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM student");
//        ʹ����ǿforѭ����������������е����ݣ���ÿ�����ݽ��л���
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }

    //    ʹ��query()��ѯStudent�������е�����
    @Test
    public void JdbcTemplateFindStudent() {
        List<Student> list = jdbcTemplate.query("SELECT * FROM student", new BeanPropertyRowMapper<Student>(Student.class));
//        ʹ����ǿforѭ����������������е����ݣ���ÿ�����ݽ��л���
        for (Student student : list) {
            System.out.println(student);
        }
    }

    //    ʹ��queryForObject()��ѯStudent����ѧ��������
    @Test
    public void JdbcTemplateCount() {
        Integer integer = jdbcTemplate.queryForObject("SELECT COUNT(id) FROM student", Integer.class);
        System.out.println(integer);
    }

}