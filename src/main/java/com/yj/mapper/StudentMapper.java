package com.yj.mapper;

import com.yj.pojo.Student;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    @Select("select * from student stu,my_class cl where stu.class_own = cl.cid and stu.id = #{id}")
    @ResultMap("studentMap")
    Student selectById(Integer id);

    @Select("select * from student stu,my_class cl where stu.class_own = cl.cid")
    @ResultMap("studentMap")
    List<Student> selectAll();
}
