package com.yj.mapper;

import com.yj.pojo.Clazz;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClazzMapper {

    @Select("SELECT * FROM my_class cl,student stu WHERE cl.cid = stu.class_own")
    @ResultMap("clazzMap")
    List<Clazz> selectAll();
}
