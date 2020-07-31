package com.zjh.jdbctemplate;

import com.zjh.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcTempleateDemo3 {
    public static void main(String[] args) {
        /**
         * 1、获取容器
         * 2、获取对象
         * 3、执行sql语句
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        JdbcTemplate jt = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");

        /**
         * 针对单表操作
         * 保存
         * 更新
         * 删除
         * 查询所有
         * 查询一个
         * 查询返回一行一列
         */

        jt.update("update student set name =?,age=? where id=?","updateName",35,14);

        //查询所有(student 表中，所有年龄大于10
        // )
//       List<Student> result =  jt.query("select * from student where age>?",new StudentRowMapper(),10);

        //spring提供的BeanPropertyRowMapper
       List<Student> result =  jt.query("select * from student where age>?",new BeanPropertyRowMapper<>(Student.class),10);
        for (Student s: result) {
            System.out.println(s);
        }


    }

}

/**
 * 定义查询实体
 */
class StudentRowMapper implements RowMapper<Student>{

    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();

        student.setId(resultSet.getInt("id"));
        student.setAge(resultSet.getInt("age"));
        student.setName(resultSet.getString("name"));
        student.setSex(resultSet.getString("sex"));
        student.setClassId(resultSet.getInt("class_id"));
        return student;
    }
}
