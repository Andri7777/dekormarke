package com.example.dekormarket.service;

import com.example.dekormarket.dto.LoginRequest;
import com.example.dekormarket.dto.UserRequest;
import com.example.dekormarket.entity.MyUser;

import java.util.List;

public interface UserService {

    String login(LoginRequest loginRequest);

    public MyUser findUserByEmail(String email);


    List<MyUser> findAll();

    void create(UserRequest userRequest);

}
