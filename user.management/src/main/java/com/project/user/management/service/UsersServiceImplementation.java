package com.project.user.management.service;

import com.project.user.management.repository.UsersRepository;

public class UsersServiceImplementation implements UsersService {
	
	UsersRepository repo;

	public UsersServiceImplementation(UsersRepository repo) {
		super();
		this.repo = repo;
	}
	
	
}
