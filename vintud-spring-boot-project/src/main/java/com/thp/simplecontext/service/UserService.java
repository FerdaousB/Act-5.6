package com.thp.simplecontext.service;

import java.util.List;

import com.thp.simplecontext.entity.User;

public interface UserService {
	
	 public User findById(Long id);
	 public List<User> findAll();
	 public void updateAnnonce(Long id, User user);
     public void insertAnnonce(User user);
	 public void deleteAnnonce(Long id);
	

}
