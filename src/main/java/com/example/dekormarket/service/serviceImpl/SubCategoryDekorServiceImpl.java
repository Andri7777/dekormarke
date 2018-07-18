package com.example.dekormarket.service.serviceImpl;

import com.example.dekormarket.dto.SubCategoryDekorRequest;
import com.example.dekormarket.dto.SubCategoryDekorResponce;
import com.example.dekormarket.entity.SubCategoryDekor;
import com.example.dekormarket.repository.CategoryDekorRepository;
import com.example.dekormarket.repository.SubCategoryDekorRepository;
import com.example.dekormarket.service.SubCategoryDekorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCategoryDekorServiceImpl implements SubCategoryDekorService{

    @Autowired
    private CategoryDekorRepository categoryDekorRepository;

    @Autowired
    private SubCategoryDekorRepository subCategoryDekorRepository;

    @Override
    public SubCategoryDekorResponce save(SubCategoryDekorRequest subCategoryDekorRequest) {
        SubCategoryDekor subCategoryDekor = new SubCategoryDekor();
        subCategoryDekor.setName(subCategoryDekorRequest.getName());
        subCategoryDekor.setCategoryDekor(categoryDekorRepository.findOne(subCategoryDekorRequest.getIdCategory()));
        return new SubCategoryDekorResponce(subCategoryDekorRepository.save(subCategoryDekor));
    }
}
