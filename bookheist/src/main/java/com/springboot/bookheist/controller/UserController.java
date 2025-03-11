package com.springboot.bookheist.controller;

import com.springboot.bookheist.model.User;
import com.springboot.bookheist.repository.UserRepo;
import com.springboot.bookheist.service.JwtService;
import com.springboot.bookheist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepo repo;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @PostMapping(value = "register")
    public User saveUser(@RequestBody User user ){
        repo.save(user);
        return userService.saveUser(user);
    }

    @PostMapping(value = "login")
    public String login(@RequestBody User user){

        return userService.verify(user);
    }
}
