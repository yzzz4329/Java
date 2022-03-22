package com.yj.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {

    private static SqlSessionFactory factory = null;

    static {

        try (
                InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
                ){
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static SqlSession openSession() {
        if (factory != null){
            return factory.openSession();
        }
        throw new RuntimeException("创建sqlSession时没有成功");
    }


    public static void closeSqlSession(SqlSession sqlSession){
        if (sqlSession != null){
            sqlSession.close();
        }
    }
}
