package com.yj.service;

import com.yj.mapper.BrandMapper;
import com.yj.pojo.Brand;
import com.yj.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class BrandService {
    /*
    *@author 15699
    *@Description selectAll
    *@Date 22:51 2021/11/27
    *@Param
    *@Return
    **/
    public List<Brand> selectAll() throws Exception {
        SqlSession sqlSession = MyBatisUtils.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectAll();
        sqlSession.close();
        return brands;

    }
    /*
    *@author 15699
    *@Description selectById
    *@Date 22:51 2021/11/27
    *@Param
    *@Return
    **/
    public Brand selectById(Integer id) throws IOException {
        SqlSession sqlSession = MyBatisUtils.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = mapper.selectById(id);
        sqlSession.close();
        return brand;
    }
    /*
    *@author 15699
    *@Description update
    *@Date 22:51 2021/11/27
    *@Param
    *@Return
    **/
    public void update(Brand brand) throws IOException {
        SqlSession sqlSession = MyBatisUtils.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.update(brand);
        sqlSession.commit();
        sqlSession.close();
    }
    /*
    *@author 15699
    *@Description delete
    *@Date 22:51 2021/11/27
    *@Param
    *@Return
    **/
    public void delete(Integer id) throws IOException {
        SqlSession sqlSession = MyBatisUtils.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.delete(id);
        sqlSession.commit();
        sqlSession.close();
    }
    /*
    *@author 15699
    *@Description add
    *@Date 22:51 2021/11/27
    *@Param
    *@Return
    **/
    public void add(Brand brand) throws IOException {
        SqlSession sqlSession = MyBatisUtils.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.add(brand);
        sqlSession.commit();
        sqlSession.close();
    }
}
