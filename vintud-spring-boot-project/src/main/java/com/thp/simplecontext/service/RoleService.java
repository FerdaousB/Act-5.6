package com.thp.simplecontext.service;

import java.util.List;


import com.thp.simplecontext.dto.RoleDTO;

public interface RoleService {
	
	 public RoleDTO findRoleById(Long id);
	 public List<RoleDTO> findAll();
	 public RoleDTO updateRole(RoleDTO role);
     public RoleDTO insertRole(RoleDTO role);
	 public RoleDTO deleteRole(Long id);

}
