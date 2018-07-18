package com.example.dekormarket.controller;

import com.example.dekormarket.sequrity.tokenUtils.TokenTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class TestController {

    @Autowired
    private TokenTool tokenTool;

//    @PostMapping
//    public String getToken(@RequestParam String email,String role){
//        return tokenTool.createToken(email,role);
//    }

    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public String getToken(){
        return "SUCCESS";
    }

}
