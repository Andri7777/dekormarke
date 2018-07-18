package com.example.dekormarket.service.serviceImpl;

import com.example.dekormarket.dto.CategoryDekorRequest;
import com.example.dekormarket.dto.CategoryDekorResponce;
import com.example.dekormarket.entity.CategoryDekor;
import com.example.dekormarket.repository.CategoryDekorRepository;
import com.example.dekormarket.service.CategoryDekorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryDekorServiceImpl implements CategoryDekorService {

    @Autowired
    private CategoryDekorRepository categoryDekorRepository;

    @Override
    public CategoryDekorResponce save(CategoryDekorRequest categoryDekorRequest) {
        CategoryDekor categoryDekor = new CategoryDekor();
        categoryDekor.setName(categoryDekorRequest.getName());
        categoryDekor = categoryDekorRepository.save(categoryDekor);
        return new CategoryDekorResponce(categoryDekorRepository.save(categoryDekor));
    }
}
