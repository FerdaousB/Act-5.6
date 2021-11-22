package com.thp.simplecontext.service;

import java.util.List;

import com.thp.simplecontext.entity.Role;

public interface RoleService {
	
	 public Role findRoleById(Long id);
	 public List<Role> findAll();
	 public void updateRole(Long id, Role role);
     public void insertRole(Role role);
	 public void deleteRole(Long id);

}
