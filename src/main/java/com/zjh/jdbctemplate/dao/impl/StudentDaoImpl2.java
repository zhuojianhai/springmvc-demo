package com.zjh.jdbctemplate.dao.impl;

import com.zjh.domain.Student;
import com.zjh.jdbctemplate.dao.IStudentDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * 继承 jdbcdaosupport 能够去除设置 JdbcTemplate 对象的模板代码
 * 这种方式适合使用xml配置方式开发
 */
public class StudentDaoImpl2 extends JdbcDaoSupport implements IStudentDao {

    @Override
    public Student findStudentById(String id) {
        List<Student> result =  super.getJdbcTemplate().query("select * from Student where id=?", new BeanPropertyRowMapper<>(Student.class),id);
        if (result!=null && result.size()>0){
           return result.get(0);
        }
        return null;
    }

    @Override
    public Student findStudentByName(String name) {
        List<Student> result =  super.getJdbcTemplate().query("select * from Student where name=?",new BeanPropertyRowMapper<>(Student.class),name);
        if (result!=null && result.size()>0){
           return result.get(0);
        }
        return null;
    }
}
