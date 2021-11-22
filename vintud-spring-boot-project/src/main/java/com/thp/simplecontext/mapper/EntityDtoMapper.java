package com.thp.simplecontext.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thp.simplecontext.dto.RoleDTO;
import com.thp.simplecontext.entity.Role;

@Configuration
public class EntityDtoMapper {
	
	@Bean
	public ModelMapper EntityDtoMapper() {
		return new ModelMapper();
		
	}
	
	@Autowired
	private ModelMapper modelMapper;
	
	public Role roleDtoToEntity(RoleDTO roleDTO) {
		return modelMapper.map(roleDTO, Role.class);
		
	}

	public RoleDTO roleEntityToDTO(Role role) {
		return modelMapper.map(role, RoleDTO.class);
		
	}
}
