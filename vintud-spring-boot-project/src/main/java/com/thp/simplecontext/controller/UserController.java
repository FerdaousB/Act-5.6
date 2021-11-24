package com.thp.simplecontext.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thp.simplecontext.dto.UserDTO;
import com.thp.simplecontext.serviceImpl.UserServiceImpl;

@RestController
@RequestMapping(value = "/userManagement")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;

	
	@PostMapping(value = "/addUser")
	public UserDTO insertRole(@RequestBody UserDTO userDto) {
		return userService.insertUser(userDto);
		
	}
	
	@PostMapping(value = "/updateUser")
	public UserDTO updateUser(@RequestBody UserDTO userDto) {
		
		return userService.updateUser(userDto);
		
		
	}
	@GetMapping(value = "/users")
	public List<UserDTO> findAll() {

		return userService.findAll();
	}
	
	@GetMapping(value = "/findUserById/{userId}")
	public UserDTO findUserById(@PathVariable Long userId) {
         
		return userService.findUserById(userId);
	}
	
	
	@DeleteMapping(value = "/deleteUser/{userId}")
    public UserDTO deleteUser(@PathVariable Long userId) {

		return userService.deleteUser(userId);
	}
	
}
