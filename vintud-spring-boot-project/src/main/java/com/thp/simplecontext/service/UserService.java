package com.thp.simplecontext.service;

import java.util.List;

import com.thp.simplecontext.dto.UserDTO;

public interface UserService {
	
	 public UserDTO findUserById(Long userId);
	 
	 public List<UserDTO> findAll();
	 
	 public UserDTO updateUser(UserDTO userDto);
	 
     public UserDTO insertUser(UserDTO userDto);
     
	 public UserDTO deleteUser(Long userId);
	

}
