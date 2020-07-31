package com.zjh.jdbctemplate.dao.impl;

import com.zjh.domain.StudentActivity;
import com.zjh.jdbctemplate.dao.IStudentActivitiesDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentActivityDaoImpl implements IStudentActivitiesDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public StudentActivity findStudentActivitiesById(String id) {
        List<StudentActivity> res = jdbcTemplate.query("select * from student_activities where id=?",new BeanPropertyRowMapper<>(StudentActivity.class),id);
        return res.isEmpty()?null:res.get(0);

    }

    @Override
    public StudentActivity findStudentActivitiesByName(String name) {
        List<StudentActivity> res = jdbcTemplate.query("select * from student_activities where name=?",new BeanPropertyRowMapper<>(StudentActivity.class),name);
        return res.isEmpty()?null:res.get(0);
    }
}
