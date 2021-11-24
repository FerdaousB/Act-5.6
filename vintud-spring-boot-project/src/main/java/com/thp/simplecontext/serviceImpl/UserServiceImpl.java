package com.thp.simplecontext.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thp.simplecontext.dto.UserDTO;
import com.thp.simplecontext.entity.User;
import com.thp.simplecontext.repository.UserRepository;
import com.thp.simplecontext.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserRepository userRepository  ;
	
	private ModelMapper modelMapper = new ModelMapper();


	@Override
	public UserDTO findUserById(Long userId) {

		Optional<User> userRendred = userRepository.findById(userId);
		if(userRendred.isPresent()) {
			return modelMapper.map(userRendred.get(), UserDTO.class);	
		}

		return null ;
	}

	

	@Override
	public UserDTO updateUser(UserDTO userDto) {

		return insertUser(userDto);	
		
	}

	@Override
	public UserDTO insertUser(UserDTO userDto) {
		
		return modelMapper.map(userRepository.save(modelMapper.map(userDto,User.class)),UserDTO.class);
	}

	@Override
	public UserDTO deleteUser(Long userId) {

		UserDTO userDTO = this.findUserById(userId);
		userRepository.deleteById(userId); 
        
		 return userDTO ;
	}

	
	@Override
	public List<UserDTO> findAll() {
		
		List<User> users = userRepository.findAll();
		List<UserDTO> usersDTO = new ArrayList<>();
		
		for(int i=0 ; i< users.size(); i++)
		{
			usersDTO.add(modelMapper.map(users.get(i), UserDTO.class));
		}
		userRepository.findAll();
		
				
				return usersDTO ;
	}
	

}
