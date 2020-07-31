package com.zjh.jdbctemplate;

import com.zjh.domain.Student;
import com.zjh.domain.StudentActivity;
import com.zjh.jdbctemplate.dao.IStudentActivitiesDao;
import com.zjh.jdbctemplate.dao.IStudentDao;
import com.zjh.jdbctemplate.dao.impl.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcTempleateDemo4 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        IStudentDao studentDao = (StudentDaoImpl) applicationContext.getBean("studentDao");

       Student result = studentDao.findStudentById("1");
        System.out.println(result);

        Student rs = studentDao.findStudentByName("zhuojianhai");
        System.out.println(rs);


        IStudentActivitiesDao studentActivitiesDao = (IStudentActivitiesDao) applicationContext.getBean("studentActivityDao");
        StudentActivity re = studentActivitiesDao.findStudentActivitiesById("1");
        System.out.println("查询到的活动：  "+re);
    }

}

