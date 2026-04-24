package com.project.user.management.service;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.user.management.dto.UsersRequestDto;
import com.project.user.management.dto.UsersResponseDto;
import com.project.user.management.entity.Users;
import com.project.user.management.repository.UsersRepository;

@Service
public class UsersServiceImplementation implements UsersService {

	UsersRepository repo;
	PasswordEncoder passwordEncoder;

	public UsersServiceImplementation(UsersRepository repo, PasswordEncoder passwordEncoder) {
		super();
		this.repo = repo;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public String register(UsersRequestDto userDto) {

		if (repo.existsByUsername(userDto.getUsername())) {
			return "Username already exists";
		}

		if (repo.existsByEmail(userDto.getEmail())) {
			return "Email already exists";
		}
		
		if (repo.existsByMobile(userDto.getMobile())) {
            return "Mobile number already exists";
        }


		Users user = new Users();
		user.setUsername(userDto.getUsername());
		user.setEmail(userDto.getEmail());
		user.setPassword(passwordEncoder.encode(userDto.getPassword()));
		user.setMobile(userDto.getMobile());
		user.setDob(userDto.getDob());
		user.setGender(userDto.getGender());
		user.setAddress(userDto.getAddress());
		user.setDpUrl(userDto.getDpUrl());

		repo.save(user);

		return "User registered successfully!";
	}

	@Override
	public UsersResponseDto searchUser(Long id) {
		Users user = repo.findById(id).get();
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
		if (!repo.existsById(id)) {
			return "User not found";
		}

		repo.deleteById(id);
		return "User deleted successfully";
	}

}
