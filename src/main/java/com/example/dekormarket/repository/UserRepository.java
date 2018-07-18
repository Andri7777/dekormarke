package com.example.dekormarket.repository;

import com.example.dekormarket.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<MyUser,Long> {

    MyUser findOneByEmail(String email);

    MyUser findByEmail(String email);


}
