package com.yj.mapper;

import com.yj.pojo.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BrandMapper {
    /*
    *@author 15699
    *@Description 查询所有
    *@Date 19:18 2021/11/27
    *@Param
    *@Return
    **/
    //一般来说，如果数据库中表中的字段名与实体中的属性名不同时，在查询过程中以及update过程中都需要用resultMap
    @Select("select * from tb_brand")
    @ResultMap("brandMap")
    List<Brand> selectAll();

    @Insert("insert into tb_brand values(null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    @ResultMap("brandMap")
    void add(Brand brand);

    @Delete("delete from tb_brand where id = #{id}")
    void delete(Integer id);

    @Select("select * from tb_brand where id = #{id}")
    @ResultMap("brandMap")
    Brand selectById(Integer id);


    @Update("update tb_brand set brand_name = #{brandName},company_name = #{companyName},ordered = #{ordered},description = #{description},status = #{status} where id = #{id}")
    void update(Brand brand);
}
