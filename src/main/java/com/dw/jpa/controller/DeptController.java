package com.dw.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dw.jpa.repository.DeptRepo;

@Controller
public class DeptController {
	//서비스 없이 진행
	@Autowired
	private DeptRepo repo;
	
}
