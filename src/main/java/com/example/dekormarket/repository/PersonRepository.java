package com.example.dekormarket.repository;


import com.example.dekormarket.entity.Person;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PersonRepository  extends JpaRepository<Person,Long>, JpaSpecificationExecutor<Person>{

//    @Query("select p from Person p where p.firstName=:firstName")
//    List<Person> findUserByName(@Param("firstName") String firstName);

    List<Person> findAllByFirstName(String firstName);

    @Override
    Page<Person> findAll(Pageable pageable);

//    List<Person> filterByFirstName (Specification specification);


}

