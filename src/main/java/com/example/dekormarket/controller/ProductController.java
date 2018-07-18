package com.example.dekormarket.controller;


import com.example.dekormarket.dto.ProductRequest;
import com.example.dekormarket.dto.ProductResponce;
import com.example.dekormarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/product1")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ProductResponce save(@RequestBody ProductRequest productRequest){
        return productService.save(productRequest);
    }
}
