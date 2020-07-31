package com.zjh.jdbctemplate.dao.impl;

import com.zjh.domain.Student;
import com.zjh.jdbctemplate.dao.IStudentDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentDaoImpl implements IStudentDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Student findStudentById(String id) {
        List<Student> result =  jdbcTemplate.query("select * from Student where id=?", new BeanPropertyRowMapper<>(Student.class),id);
        if (result!=null && result.size()>0){
           return result.get(0);
        }
        return null;
    }

    @Override
    public Student findStudentByName(String name) {
        List<Student> result =  jdbcTemplate.query("select * from Student where name=?",new BeanPropertyRowMapper<>(Student.class),name);
        if (result!=null && result.size()>0){
           return result.get(0);
        }
        return null;
    }
}
