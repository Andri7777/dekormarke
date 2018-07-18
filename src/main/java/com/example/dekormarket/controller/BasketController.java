package com.example.dekormarket.controller;

import com.example.dekormarket.dto.BasketRequest;
import com.example.dekormarket.dto.BasketResponce;
import com.example.dekormarket.entity.Basket;
import com.example.dekormarket.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/basket1")
public class BasketController {

    @Autowired
    private BasketService basketService;

    @PostMapping("/")
    public BasketResponce save(@RequestBody BasketRequest basketRequest){
        return basketService.save(basketRequest);
    }

    @GetMapping("/get")
    public List<Basket> basketList(){
        return basketService.findAll();
    }

    @DeleteMapping
    void delete(Long id){
        basketService.delete(id);
    }

}
