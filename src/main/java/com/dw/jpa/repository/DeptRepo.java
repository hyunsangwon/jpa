package com.dw.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.jpa.model.Dept;

public interface DeptRepo extends JpaRepository<Dept, Long>{

}
