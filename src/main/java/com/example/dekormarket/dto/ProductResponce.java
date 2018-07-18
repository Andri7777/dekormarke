package com.example.dekormarket.dto;

import com.example.dekormarket.entity.Product;

public class ProductResponce {

    private Long id;

    private String name;

    private int price;

    private String specification;

    private boolean presence;

    private ContractResponce contractResponce;

    public ProductResponce(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.specification = product.getSpecification();
        this.presence = product.isPresence();
        this.contractResponce = new ContractResponce(product.getContract());
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public ContractResponce getContractResponce() {
        return contractResponce;
    }

    public void setContractResponce(ContractResponce contractResponce) {
        this.contractResponce = contractResponce;
    }
}
