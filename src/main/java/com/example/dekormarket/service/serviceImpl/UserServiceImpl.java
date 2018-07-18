package com.example.dekormarket.service.serviceImpl;

import com.example.dekormarket.dto.LoginRequest;
import com.example.dekormarket.dto.UserRequest;
import com.example.dekormarket.entity.MyUser;
import com.example.dekormarket.entity.Role;
import com.example.dekormarket.repository.UserRepository;
import com.example.dekormarket.sequrity.tokenUtils.TokenTool;
import com.example.dekormarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    private final TokenTool tokenTool;


    @Autowired
    public UserServiceImpl(TokenTool tokenTool, UserRepository userRepository) {
        this.tokenTool = tokenTool;
        this.userRepository = userRepository;

    }


    public String login(LoginRequest loginRequest) {
        MyUser user = userRepository.findOneByEmail(loginRequest.getLogin());
        if (user != null) {
            if (user.getPassword().equals(loginRequest.getPassword())) {
                return tokenTool.createToken(user.getEmail(), user.getRole().name());
            } else {
                throw new IllegalArgumentException("Wrong input data");
            }
        } else {
            throw new IllegalArgumentException("Wrong input data");
        }
    }

    @Override
    public MyUser findUserByEmail(String email) {
        return userRepository.findOneByEmail(email);
    }

    @Override
    public List<MyUser> findAll() {
        return userRepository.findAll();
    }


    public void create(UserRequest userRequest) {
        MyUser user = new MyUser();
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setRole(userRequest.getRole());
        userRepository.save(user);
    }
}
