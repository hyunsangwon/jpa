package com.dw.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.jpa.model.Users;

public interface UserRepo extends JpaRepository<Users, Long>{

    // SELECT * FROM dw_user WHERE user_id = 'dw';
    Users findByuserId(String userId);

    // SELECT * FROM dw_user WHERE user_id = 'dw' AND user_password = '123';
    Users findByuserIdAndUserPassword(String userId, String password);

    // SELECT * FROM dw_user WHERE name = '홍길동';
    Users findByname(String name);
}
