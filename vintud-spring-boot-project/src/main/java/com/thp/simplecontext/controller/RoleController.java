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

import com.thp.simplecontext.dto.RoleDTO;
import com.thp.simplecontext.serviceImpl.RoleServiceImpl;


@RestController
@RequestMapping(value = "/roleManagement")
public class RoleController {
	
	@Autowired
	private RoleServiceImpl roleService; 
	
	
	@GetMapping(value = "/roles")
	public List<RoleDTO> findAllRole() {

		return roleService.findAll();
	}
	
	@PostMapping(value = "/addRole")
	public RoleDTO insertRole(@RequestBody RoleDTO role) {
		return roleService.insertRole(role);
		
	}
	
	@PostMapping(value = "/updateRole")
	public RoleDTO updateRole(@RequestBody RoleDTO roleDTO) {
		
		return roleService.updateRole(roleDTO);
		
		
	}
	
	@GetMapping(value = "/findRoleById/{roleId}")
	public RoleDTO findRoleById(@PathVariable Long roleId) {
         
		return roleService.findRoleById(roleId);
	}
	
	@DeleteMapping(value = "/deleteRole/{roleId}")
     public RoleDTO deleteRole(@PathVariable Long roleId) {

		return roleService.deleteRole(roleId);
	}
	

}