package com.PYG.mapper;

import com.PYG.pojo.Brand;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
//接口映射
public interface BrandMapper extends Mapper<Brand>{

    @Select("select * from tb_brand order by id asc")
    List<Brand> findByPage();
}
