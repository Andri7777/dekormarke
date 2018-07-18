package com.example.dekormarket.entity;

import javax.persistence.*;

@Entity
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private int productPrice;

    private int quantity;

    @OneToOne
    private PersonAccount personAccount;

    public Basket() {}

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

    public PersonAccount getPersonAccount() {
        return personAccount;
    }

    public void setPersonAccount(PersonAccount personAccount) {
        this.personAccount = personAccount;
    }
}
