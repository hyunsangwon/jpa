package com.dw.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.jpa.model.Users;
import com.dw.jpa.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("/api/v1/login")
	public boolean callLogin(@RequestBody Users user) {
		return true;
	}
	
    @GetMapping("/api/v1/users")
    public List<Users> callAllUser(){
        return service.getAllUser();
    }
    
    @GetMapping("/api/v1/users/{id}")
    public Optional<Users> callUserById(@PathVariable int id){
    	// .orElseThrow(() -> new IllegalArgumentException("no such data");
    	return service.getUserById(id);
    }
    
    @DeleteMapping("/api/v1/users/{id}")
    public boolean callDeleteUser(@PathVariable int id) {
    	return service.deleteUser(id);
    }
    
    @PostMapping("/api/v1/users")
    public Users callCreateUser(@RequestBody Users user) {
    	return service.createUser(user);
    }
    
    @PatchMapping("/api/v1/users")
    public Users callUpdateUser(@RequestBody Users user) {
    	return service.updateUser(user);
    }
    
}