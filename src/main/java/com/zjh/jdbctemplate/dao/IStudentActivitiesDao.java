package com.zjh.jdbctemplate.dao;

import com.zjh.domain.StudentActivity;

public interface IStudentActivitiesDao {
    StudentActivity findStudentActivitiesById(String id);
    StudentActivity findStudentActivitiesByName(String name);
}
