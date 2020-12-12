package com.lc.play;

import com.lc.dao.StudentMapper;
import com.lc.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author lichao
 * @description TODO
 * @date 2020/12/6 16:56
 * @params
 * @return
 **/
public class play {


    @Test
    public void myPlay() throws IOException {
        InputStream is = Resources.getResourceAsStream("application.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sqlSessionFactory.openSession();  //SqlSession提供select/insert/update/delete方法
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudentList("0001");
        System.out.println(studentList);
    }

    public void method1(int a){
        System.out.println(a);
    }
    public void method(String a){
        System.out.println(a);
    }

}

