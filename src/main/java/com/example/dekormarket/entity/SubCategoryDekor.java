package com.example.dekormarket.entity;

import javax.persistence.*;

@Entity
public class SubCategoryDekor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private CategoryDekor categoryDekor;

    public SubCategoryDekor() {}

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

    public CategoryDekor getCategoryDekor() {
        return categoryDekor;
    }

    public void setCategoryDekor(CategoryDekor categoryDekor) {
        this.categoryDekor = categoryDekor;
    }
}
