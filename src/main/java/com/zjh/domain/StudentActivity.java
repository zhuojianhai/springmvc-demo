package com.zjh.domain;

import java.io.Serializable;

/**
 * 学生活动表
 */
public class StudentActivity implements Serializable {
    private String id;
    private String name;
    private String stuId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    @Override
    public String toString() {
        return "StudentActivity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", stuId='" + stuId + '\'' +
                '}';
    }
}
