package com.example.dekormarket.service;

import com.example.dekormarket.dto.ProductRequest;
import com.example.dekormarket.dto.ProductResponce;
import com.example.dekormarket.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();
    ProductResponce save(ProductRequest productRequest);
    Product findOne(Long id);
    void delete(Long id);
}
