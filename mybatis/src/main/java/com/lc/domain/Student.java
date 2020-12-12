package com.lc.domain;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import java.util.Date;

/**
 * @author lichao
 * @description TODO
 * @date 2020/12/6 16:31
 * @params
 * @return
 **/
public class Student {

    private String stuId;

    private String name;

    private Date date;

    private String sex;

    public String getStuId() {
        return stuId;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getSex() {
        return sex;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", sex='" + sex + '\'' +
                '}';
    }
}
