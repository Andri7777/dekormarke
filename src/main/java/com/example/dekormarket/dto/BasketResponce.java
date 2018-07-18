package com.example.dekormarket.dto;

import com.example.dekormarket.entity.Basket;

public class BasketResponce {

    private Long id;

    private String productName;

    private int productPrice;

    private int quantity;

    public BasketResponce(Basket basket) {
        this.id = basket.getId();
        this.productName = basket.getProductName();
        this.productPrice = basket.getProductPrice();
        this.quantity = basket.getQuantity();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
