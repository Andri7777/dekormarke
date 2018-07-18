package com.example.dekormarket.service;

import com.example.dekormarket.dto.MyPageRequest;
import com.example.dekormarket.dto.PersonRequest;
import com.example.dekormarket.dto.PersonResponce;
import com.example.dekormarket.dto.PersonSpecRequest;
import com.example.dekormarket.entity.Person;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PersonService {
//
    List<Person> findAll();
    Page<Person> findAll(MyPageRequest myPageRequest);
    List<Person> filter(PersonSpecRequest personSpecRequest);
    Person findOne(Long id);
    List<PersonResponce> findAllByName(String firstName);
    PersonResponce save(PersonRequest personRequest);
    void delete(Long id);

}
