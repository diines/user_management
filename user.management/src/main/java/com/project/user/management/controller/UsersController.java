package com.project.user.management.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.user.management.service.UsersService;

@RestController
public class UsersController {
	
	UsersService service;

	public UsersController(UsersService service) {
		super();
		this.service = service;
	}
	
	
}
