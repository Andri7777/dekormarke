package com.example.dekormarket.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String phone;

    private String productName;

    private Long numberContract;

    private int productPrice;

    private int quantity;             //кількість

    private boolean delivery;        //доставка

    @OneToMany(mappedBy = "contract")
    private List<Product> productList = new ArrayList<Product>();

    @OneToMany
    private List<ProductInTheContract> productInTheContracts = new ArrayList<ProductInTheContract>();

    public Contract() {}

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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Long getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(Long numberContract) {
        this.numberContract = numberContract;
    }

    public List<ProductInTheContract> getProductInTheContracts() {
        return productInTheContracts;
    }

    public void setProductInTheContracts(List<ProductInTheContract> productInTheContracts) {
        this.productInTheContracts = productInTheContracts;
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
