package com.example.dekormarket.controller;

import com.example.dekormarket.dto.MyPageRequest;
import com.example.dekormarket.dto.PersonRequest;
import com.example.dekormarket.dto.PersonResponce;
import com.example.dekormarket.dto.PersonSpecRequest;
import com.example.dekormarket.entity.Person;
import com.example.dekormarket.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/person1",method = RequestMethod.GET)
@CrossOrigin
public class PersonController {

    @Autowired
    private PersonService personService;


    @PostMapping()
    public PersonResponce save(@RequestBody PersonRequest personRequest){
        return  personService.save(personRequest) ;
    }

    @GetMapping("/")
    public List<Person > list(){
        return personService.findAll();
    }
    @PostMapping("/filter")
    public List<Person> filter(@RequestBody PersonSpecRequest personSpecRequest){
        return personService.filter(personSpecRequest);
    }

    @PostMapping("/page")
    public Page<Person> getAll(@RequestBody MyPageRequest myPageRequest){
        return personService.findAll(myPageRequest);
    }

    @DeleteMapping("/delete")
    public void delete(Long id){
        personService.delete(id);
    }

    @GetMapping("/firstName")
    public List<PersonResponce> findByName(@RequestParam String firstName){
        return personService.findAllByName(firstName);
    }


}
