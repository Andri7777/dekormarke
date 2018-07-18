package com.example.dekormarket.controller;


import com.example.dekormarket.dto.PersonAccountRequest;
import com.example.dekormarket.dto.PersonAccountResponce;
import com.example.dekormarket.entity.PersonAccount;
import com.example.dekormarket.service.PersonAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account1")
@CrossOrigin
public class PersonAccountController {

    @Autowired
    private PersonAccountService personAccountService;

    @PostMapping
    public PersonAccountResponce save(@RequestBody PersonAccountRequest personAccountRequest) {
        return personAccountService.save(personAccountRequest);
    }
    @GetMapping
    public List<PersonAccount> findAll(){
        return personAccountService.findAll();
    }
}
