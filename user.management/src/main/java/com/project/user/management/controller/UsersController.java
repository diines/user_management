package com.project.user.management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.user.management.dto.UsersRequestDto;
import com.project.user.management.dto.UsersResponseDto;
import com.project.user.management.entity.Users;
import com.project.user.management.service.UsersService;

@RestController
public class UsersController {
	
	UsersService service;

	public UsersController(UsersService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/register")
	public String register(@RequestBody UsersRequestDto user) {
		return service.register(user);
	}
	@GetMapping("/searchUser/{id}")
	public UsersResponseDto searchUser(@PathVariable Long id) {
		return service.searchUser(id);
	}
	@GetMapping("/viewAllUsers")
	public List<UsersResponseDto> viewAllUsers() {
		return service.viewAllUsers();
	}
	@PutMapping("/updateUser")
	public String updateUser(@RequestBody Users user) {
		return service.updateUser(user);
	}
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable Long id) {
		return service.deleteUser(id);
	}
	
}
