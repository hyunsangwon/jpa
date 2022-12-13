package com.dw.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.jpa.model.Users;

public interface UserRepo extends JpaRepository<Users, Long>{

}
