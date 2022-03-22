package com.yj.service;

import com.yj.mapper.ClazzMapper;
import com.yj.mapper.StudentMapper;
import com.yj.pojo.Clazz;
import com.yj.pojo.Student;
import com.yj.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ClazzService {
    public List<Clazz> selectAll(){
        SqlSession sqlSession = MyBatisUtils.openSession();
        ClazzMapper mapper = sqlSession.getMapper(ClazzMapper.class);
        List<Clazz> list = mapper.selectAll();
        return list;
    }
}
