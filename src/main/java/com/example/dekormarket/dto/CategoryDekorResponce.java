package com.example.dekormarket.dto;

import com.example.dekormarket.entity.CategoryDekor;

public class CategoryDekorResponce {

    private Long id;

    private String name;

    public CategoryDekorResponce(CategoryDekor categoryDekor) {
        this.id = categoryDekor.getId();
        this.name = categoryDekor.getName();
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
}
