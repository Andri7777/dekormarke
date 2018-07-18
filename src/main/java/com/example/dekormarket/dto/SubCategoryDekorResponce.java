package com.example.dekormarket.dto;

import com.example.dekormarket.entity.SubCategoryDekor;

public class SubCategoryDekorResponce {

    private Long id;

    private String name;

    private CategoryDekorResponce categoryDekorResponce;

    public SubCategoryDekorResponce(SubCategoryDekor subCategoryDekor) {
        this.id = subCategoryDekor.getId();
        this.name = subCategoryDekor.getName();
        this.categoryDekorResponce = new  CategoryDekorResponce(subCategoryDekor.getCategoryDekor());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryDekorResponce getCategoryDekorResponce() {
        return categoryDekorResponce;
    }

    public void setCategoryDekorResponce(CategoryDekorResponce categoryDekorResponce) {
        this.categoryDekorResponce = categoryDekorResponce;
    }
}
