package com.dw.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dw.jpa.model.Users;
import com.dw.jpa.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
    @GetMapping("/api/v1/users")
    public List<Users> callHello(){
        return service.getAllUsrs();
    }
    
}