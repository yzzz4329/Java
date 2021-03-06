package com.yj.mapper;

import com.yj.pojo.User;
import org.apache.ibatis.annotations.*;

import java.lang.reflect.Array;
import java.util.List;

public interface UserMapper {


    @Select("select * from user")
    List<User> selectAll();

    //@Param注解的作用:用于传递参数,使方法的参数可以与SQL中的字段名相对应。
    @Select("select * from user where username = #{username} and password = #{password}")
    User selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Select("select * from user where id = #{id}")
    User selectById(Integer id);

    @Insert("insert into user values(null,#{username},#{password},#{age})")
    void add(User user);


    void deleteByArr(int[] arr);

    @Delete("delete from `user` where id = #{id}")
    void deleteById(Integer id);

    void updateByUser(User user);
}
