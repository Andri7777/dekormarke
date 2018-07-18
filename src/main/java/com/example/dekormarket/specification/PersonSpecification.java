package com.example.dekormarket.specification;

import com.example.dekormarket.dto.PersonSpecRequest;
import com.example.dekormarket.entity.Person;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class PersonSpecification implements Specification<Person>{

    private PersonSpecRequest personSpecRequest;

    public PersonSpecification(PersonSpecRequest personSpecRequest) {
        this.personSpecRequest = personSpecRequest;
    }

    @Override
    public Predicate toPredicate(Root<Person> root,
                                 CriteriaQuery<?> criteriaQuery,
                                 CriteriaBuilder criteriaBuilder) {

     Predicate predicateFirstName = criteriaBuilder.like(root.get("firstName"),"%"+personSpecRequest.getFirstName()+"%");
        return predicateFirstName;
    }

}
