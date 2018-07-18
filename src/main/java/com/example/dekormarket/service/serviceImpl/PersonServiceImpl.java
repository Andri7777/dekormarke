package com.example.dekormarket.service.serviceImpl;

import com.example.dekormarket.dto.MyPageRequest;
import com.example.dekormarket.dto.PersonRequest;
import com.example.dekormarket.dto.PersonResponce;
import com.example.dekormarket.dto.PersonSpecRequest;
import com.example.dekormarket.entity.Person;
import com.example.dekormarket.repository.PersonRepository;
import com.example.dekormarket.service.PersonService;
import com.example.dekormarket.specification.PersonSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;


    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    //    @Override
//    public List<Person> findAll() {
//        return personRepository.findAll();
//    }
//    @Override
//    public Page<Person> findAll(MyPageRequest myPageRequest) {
//        Page<Person> personPage = personRepository.findAll(new PageRequest(myPageRequest.getNumberPage(),myPageRequest.getSizePage()));
//        return personRepository.findAll();
//    }
//    @Override
//    public Page<Person> findAll(MyPageRequest myPageRequest) {
//        PageRequest pageRequest =
//                new PageRequest(myPageRequest.getNumberPage(),myPageRequest.getSizePage());
//        Page<Person> personPage =
//                personRepository.findAll(pageRequest);
//        return personPage;
//}
    @Override
    public Page<Person> findAll(MyPageRequest myPageRequest) {

        Sort sort = new Sort(myPageRequest.getSortRequest().getDirection(),myPageRequest.getSortRequest().getSortFrom());
        PageRequest pageRequest =
                new PageRequest(myPageRequest.getNumberPage(),myPageRequest.getSizePage(),sort);
        Page<Person> personPage =
                personRepository.findAll(pageRequest);
        return personPage;
    }

    @Override
    public List<Person> filter(PersonSpecRequest personSpecRequest) {
        PersonSpecification personSpecification = new PersonSpecification(personSpecRequest);
        return personRepository.findAll(personSpecification);
    }

    @Override
    public Person findOne(Long id) {
        return personRepository.findOne(id);
    }

    @Override
    public List<PersonResponce> findAllByName(String firstName) {
        return personRepository.findAllByFirstName(firstName).
                stream().map(PersonResponce::new).collect(Collectors.toList());
    }

    @Override
    public PersonResponce save(PersonRequest personRequest) {
        Person person = new Person();
        person.setFirstName(personRequest.getFirstName());
        person.setLastName(personRequest.getLastName());
        person.setPhone(personRequest.getPhone());
        person.setAddress(personRequest.getAddress());
        person.setCityAndRegion(personRequest.getCityAndRegion());
        person = personRepository.save(person);
        return new PersonResponce(person);
    }

    @Override
    public void delete(Long id) {
        personRepository.delete(id);

    }
}
