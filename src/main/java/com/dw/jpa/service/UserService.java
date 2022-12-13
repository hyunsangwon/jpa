package com.dw.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.jpa.model.Users;
import com.dw.jpa.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;	
	
	public List<Users> getAllUsrs(){
		return userRepo.findAll();
	}
	
	
}
