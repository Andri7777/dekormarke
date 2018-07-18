package com.example.dekormarket.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CategoryDekor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "categoryDekor")
     private List<SubCategoryDekor> subCategoryDekorList = new ArrayList<SubCategoryDekor>();

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

    public List<SubCategoryDekor> getSubCategoryDekorList() {
        return subCategoryDekorList;
    }

    public void setSubCategoryDekorList(List<SubCategoryDekor> subCategoryDekorList) {
        this.subCategoryDekorList = subCategoryDekorList;
    }
}
