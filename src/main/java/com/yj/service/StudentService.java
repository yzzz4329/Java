package com.yj.service;

import com.yj.mapper.StudentMapper;
import com.yj.pojo.Student;
import com.yj.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentService {

    public Student selectById(Integer id){
        SqlSession sqlSession = MyBatisUtils.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.selectById(id);
        return student;
    }

    public List<Student> selectAll() {
        SqlSession sqlSession = MyBatisUtils.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list = mapper.selectAll();
        return list;
    }
}
