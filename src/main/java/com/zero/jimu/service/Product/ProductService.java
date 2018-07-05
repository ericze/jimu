package com.zero.jimu.service.Product;

import java.util.List;

import com.zero.jimu.entity.Product;

public interface ProductService {
    //添加新商品
    int insertProduct(Product product);
    //查询所有商品
    List<Product> selectAll();
    //根据id查询对应的商品详情
    Product selectProductById(int id);
}
