package com.example.dekormarket.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int price;

    private String specification;

    private boolean presence;         //нявність

    @ManyToOne
    private Contract contract;

    @OneToMany
    private List<ProductInTheContract> productInTheContracts = new ArrayList<ProductInTheContract>();

    public Product() {}

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public boolean isPresence() {
        return presence;
    }

    public void setPresence(boolean presence) {
        this.presence = presence;
    }

    public List<ProductInTheContract> getProductInTheContracts() {
        return productInTheContracts;
    }

    public void setProductInTheContracts(List<ProductInTheContract> productInTheContracts) {
        this.productInTheContracts = productInTheContracts;
    }
}

