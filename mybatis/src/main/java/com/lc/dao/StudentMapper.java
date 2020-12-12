package com.lc.dao;

import com.lc.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lichao
 * @description TODO
 * @date 2020/12/6 16:46
 * @params
 * @return
 **/
public interface StudentMapper {

    List<Student> getStudentList(String stuId);

}
