package com.project.user.management.service;

import java.util.List;

import com.project.user.management.dto.UsersRequestDto;
import com.project.user.management.dto.UsersResponseDto;
import com.project.user.management.entity.Users;
import com.project.user.management.repository.UsersRepository;

public class UsersServiceImplementation implements UsersService {
	
	UsersRepository repo;

	public UsersServiceImplementation(UsersRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String register(UsersRequestDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsersResponseDto searchUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsersResponseDto> viewAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
