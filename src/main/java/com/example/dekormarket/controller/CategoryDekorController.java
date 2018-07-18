package com.example.dekormarket.controller;

import com.example.dekormarket.dto.CategoryDekorRequest;
import com.example.dekormarket.dto.CategoryDekorResponce;
import com.example.dekormarket.service.CategoryDekorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/category1")
public class CategoryDekorController {

    @Autowired
    private CategoryDekorService categoryDekorService;

    @PostMapping
    public CategoryDekorResponce save(@RequestBody CategoryDekorRequest categoryDekorRequest){
        return categoryDekorService.save(categoryDekorRequest);
    }
}
