package com.example.dekormarket.controller;

import com.example.dekormarket.dto.LoginRequest;
import com.example.dekormarket.dto.UserRequest;
import com.example.dekormarket.entity.MyUser;
import com.example.dekormarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/public")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/login")
    public String login(@RequestBody @Valid LoginRequest loginRequest){ return userService.login(loginRequest); }


    @GetMapping("/get")
    public List<MyUser> myUsers(){
        return userService.findAll();
    }



    @PostMapping("/create")
    public void create(@RequestBody UserRequest userRequest){
        userService.create(userRequest);
    }

    @RequestMapping(value = "log",method = RequestMethod.GET)
    public ModelAndView modelAndView(){
        return new ModelAndView("admin");

    }

@RequestMapping(value = "/lll",method = RequestMethod.GET)
    public ModelAndView login(){
        return new ModelAndView("login1");
}

}