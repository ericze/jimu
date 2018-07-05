package com.zero.jimu.controller;
import com.zero.jimu.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

import com.zero.jimu.service.Product.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @ResponseBody
    @PostMapping("/add")
    public int addProduct(Product product){
        System.out.print(product);
        return productService.insertProduct(product);
    }

    @ResponseBody
    @GetMapping("/selectAll")
    public Map<String,Object> selectAll(){
        Map<String,Object> map = new HashMap<>();
        map.put("code","0");
        map.put("products",productService.selectAll());
        return map;
    }

    @ResponseBody
    @PostMapping("/selectSpaceById")
    public Map<String,Object> selectSpaceById(int id){
        Map<String,Object> map = new HashMap<>();
        map.put("code","0");
        map.put("product",productService.selectProductById(id));
        return map;
    }
}
