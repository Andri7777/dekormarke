package com.example.dekormarket.controller;

import com.example.dekormarket.dto.SubCategoryDekorRequest;
import com.example.dekormarket.dto.SubCategoryDekorResponce;
import com.example.dekormarket.service.SubCategoryDekorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/subCategory1")
public class SubCategoryDekorController {

    @Autowired
    private SubCategoryDekorService subCategoryDekorService;

    @PostMapping
    public SubCategoryDekorResponce save(@RequestBody SubCategoryDekorRequest subCategoryDekorRequest){
        return subCategoryDekorService.save(subCategoryDekorRequest);
    }
}
