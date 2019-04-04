package com.PYG.sellergoods.service.impl;

import com.PYG.mapper.BrandMapper;
import com.PYG.pojo.Brand;
import com.PYG.service.BrandService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(interfaceName = "com.PYG.service.BrandService")
@Transactional
public class BrandServiceImpl implements BrandService {

    @Autowired
   private BrandMapper brandMapper;

    @Override
    public List<Brand> findByPage() {
        List<Brand> brands = brandMapper.findByPage();
        return brands;
    }
}
