package com.example.dekormarket.service.serviceImpl;

import com.example.dekormarket.dto.PersonAccountRequest;
import com.example.dekormarket.dto.PersonAccountResponce;
import com.example.dekormarket.entity.PersonAccount;
import com.example.dekormarket.repository.PersonAccountRepository;
import com.example.dekormarket.service.PersonAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonAccountServiceImpl implements PersonAccountService{

    @Autowired
    private PersonAccountRepository personAccountRepository;

    @Override
    public List<PersonAccount> findAll() {
        return personAccountRepository.findAll();
    }

    @Override
    public PersonAccount findOne(Long id) {
        return personAccountRepository.findOne(id);
    }

    @Override
    public PersonAccountResponce save(PersonAccountRequest personAccountRequest) {
        PersonAccount personAccount = new PersonAccount();
        personAccount.setEmail(personAccountRequest.getEmail());
        personAccount.setPassword(personAccountRequest.getPassword());
        personAccount.setName(personAccountRequest.getName());
        personAccount = personAccountRepository.save(personAccount);
        return new PersonAccountResponce(personAccount);

    }

    @Override
    public void delete(Long id) {
        personAccountRepository.delete(id);

    }

}
