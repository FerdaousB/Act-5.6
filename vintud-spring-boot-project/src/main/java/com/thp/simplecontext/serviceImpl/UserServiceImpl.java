package com.thp.simplecontext.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thp.simplecontext.entity.User;
import com.thp.simplecontext.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAnnonce(Long id, User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertAnnonce(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAnnonce(Long id) {
		// TODO Auto-generated method stub
		
	}

}