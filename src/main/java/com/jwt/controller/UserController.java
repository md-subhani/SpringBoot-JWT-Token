package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.entity.User;
import com.jwt.service.UserService;

@RestController
@CrossOrigin()
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return service.save(user);

    }
}
