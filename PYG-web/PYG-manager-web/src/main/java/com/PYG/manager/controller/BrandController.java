package com.PYG.manager.controller;

import com.PYG.pojo.Brand;
import com.PYG.service.BrandService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference(timeout = 10000)
    private BrandService brandService;

    @GetMapping("/findByPage")
    public List<Brand>  findByPage(){
        List<Brand> brands = brandService.findByPage();
        return  brands;
    }
}
