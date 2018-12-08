package com.demo.coursework.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("employee")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello User";
    }

    @RequestMapping(value = "users")//, produces = MediaType.APPLICATION_JSON_VALUE
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }


}
