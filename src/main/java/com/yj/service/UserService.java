package com.yj.service;

import com.yj.mapper.UserMapper;
import com.yj.pojo.User;
import com.yj.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class UserService {

    public void updateByUser(User user){
        SqlSession sqlSession = MyBatisUtils.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateByUser(user);
        sqlSession.commit();
        MyBatisUtils.closeSqlSession(sqlSession);
    }

    public void deleteById(Integer id){
        SqlSession sqlSession = MyBatisUtils.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteById(id);
        sqlSession.commit();
        MyBatisUtils.closeSqlSession(sqlSession);
    }

    public void deleteByArr(){
        SqlSession sqlSession = MyBatisUtils.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int[] ids = new int[]{11,12,13};
        mapper.deleteByArr(ids);
        sqlSession.commit();
        MyBatisUtils.closeSqlSession(sqlSession);
    }

    public List<User> selectAll(){
        SqlSession sqlSession = MyBatisUtils.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.selectAll();

        MyBatisUtils.closeSqlSession(sqlSession);
        return list;
    }

    public User selectById(Integer id){
        //1.获取sqlSession 对象
        SqlSession sqlSession = MyBatisUtils.openSession();
        //2.获取mapper对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //3.调用mapper中的方法 selectUser
        User user = mapper.selectById(id);
        //4.关闭sqlSession对象
        sqlSession.close();

        return user;
    }

    public User selectByUsernameAndPassword(String username, String password){

        //1.获取sqlSession 对象
        SqlSession sqlSession = MyBatisUtils.openSession();
        //2.获取mapper对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //3.调用mapper中的方法 selectUser
        User user = mapper.selectByUsernameAndPassword(username, password);
        //4.关闭sqlSession对象
        sqlSession.close();

        return user;
    }

    public void add(User user){
        //1.获取sqlSession 对象
        SqlSession sqlSession = MyBatisUtils.openSession();
        //2.获取mapper对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //3.调用mapper中的方法 selectUser

        mapper.add(user);
        //4.事务提交
        sqlSession.commit();
        //5.关闭sqlSession对象
        sqlSession.close();
    }
}
