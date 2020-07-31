package com.zjh.jdbctemplate.dao;

import com.zjh.domain.Student;

public interface IStudentDao {
    Student findStudentById(String id);
    Student findStudentByName(String name);
}
