package com.thp.simplecontext.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thp.simplecontext.dto.RoleDTO;
import com.thp.simplecontext.mapper.EntityDtoMapper;
import com.thp.simplecontext.service.RoleService;


@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/roleManagement")
@Component
public class RoleController {
	
	@Autowired
	private RoleService roleService; 
	
	@Autowired
	EntityDtoMapper entityDtoMapper;
	
	@PostMapping(value = "/addRole")
	public RoleDTO insertRole(@RequestBody RoleDTO role) {
		return roleService.insertRole(role);
		
	}
	
	@PostMapping(value = "/updateRole")
	public RoleDTO updateRole(@RequestBody RoleDTO role) {
		return roleService.updateRole(role);
		
	}
	

}