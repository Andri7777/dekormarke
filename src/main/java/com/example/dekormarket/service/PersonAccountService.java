package com.example.dekormarket.service;

import com.example.dekormarket.dto.PersonAccountRequest;
import com.example.dekormarket.dto.PersonAccountResponce;
import com.example.dekormarket.entity.PersonAccount;

import java.util.List;

public interface PersonAccountService {

    List<PersonAccount> findAll();
    PersonAccount findOne(Long id);
    PersonAccountResponce save(PersonAccountRequest personAccountRequest);
    void delete(Long id);


}
