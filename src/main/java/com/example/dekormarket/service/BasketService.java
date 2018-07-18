package com.example.dekormarket.service;

import com.example.dekormarket.dto.BasketRequest;
import com.example.dekormarket.dto.BasketResponce;
import com.example.dekormarket.entity.Basket;

import java.util.List;

public interface BasketService {

    BasketResponce save(BasketRequest basketRequest);
    List<Basket> findAll();
    void delete(Long id);

}
