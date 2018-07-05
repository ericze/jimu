package com.zero.jimu.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zero.jimu.entity.Product;
import com.zero.jimu.entity.PublicImage;

import java.util.List;

@Mapper
public interface ProductDao {
    int insertProduct(@Param("product")Product product);

    List<Product> selectAll();

    Product selectProductById(int id);
}
