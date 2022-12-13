package com.dw.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.jpa.model.Users;
import com.dw.jpa.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;	
	
	//전체 조회
	public List<Users> getAllUser(){
		return userRepo.findAll();
	}
	//조회
	public Optional<Users> getUserById(long id) {
		return userRepo.findById(id);
	}
	//삭제
	public boolean deleteUser(long id) {
		try {
			userRepo.deleteById(id);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	//생성
	public Users createUser(Users user) {
		Users data = userRepo.save(user);
		return data;
	}
	//수정
	public Users updateUser(Users user) {
		Users data = userRepo.save(user);
		return data;
	}
	
	
}
