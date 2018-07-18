package com.example.dekormarket.dto;

import com.example.dekormarket.entity.Contract;

public class ContractResponce {

    private Long id;

    private String name;

    private String phone;

    private String productName;

    private Long numberContract;

    private int productPrice;

    private int quantity;

    private boolean delivery;

    public ContractResponce(Contract contract) {
        this.id = contract.getId();
        this.name = contract.getName();
        this.phone = contract.getPhone();
        this.productName = contract.getProductName();
        this.numberContract = contract.getNumberContract();
        this.productPrice = contract.getProductPrice();
        this.quantity = contract.getQuantity();
        this.delivery = contract.isDelivery();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public Long getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(Long numberContract) {
        this.numberContract = numberContract;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
