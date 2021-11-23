package com.thp.simplecontext.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thp.simplecontext.dto.RoleDTO;
import com.thp.simplecontext.service.RoleService;


@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/roleManagement")
@Component
public class RoleController {
	
	@Autowired
	private RoleService roleService; 
	
	@DeleteMapping(value = "/Roles")
	public List<RoleDTO> findAllRole() {

		return roleService.findAll();
	}
	
	@PostMapping(value = "/addRole")
	public RoleDTO insertRole(@RequestBody RoleDTO role) {
		return roleService.insertRole(role);
		
	}
	
	@PutMapping(value = "/updateRole/{roleId}")
	public RoleDTO updateRole(@RequestBody RoleDTO roleDTO, @PathVariable Long roleId) {
		
		return roleService.updateRole(roleDTO, roleId);
		
		
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