package com.zero.jimu.service.Product.impl;

import com.zero.jimu.service.Product.ProductService;
import com.zero.jimu.entity.Product;
import com.zero.jimu.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "productService")
public class ProductServiceImpl {

    @Autowired ProductDao productDao;

    //添加新商品
    int insertProduct(Product product){
        if(1==productDao.insertProduct(product)){
            return product.id;
        }else {
            return 0;
        }
    }
    //查询所有商品
    List<Product> selectAll(){
        return productDao.selectAll();
    }
    //根据id查询对应的空间详情
    Product selectProductById(int id){
        return productDao.selectProductById(id);
    }
}
