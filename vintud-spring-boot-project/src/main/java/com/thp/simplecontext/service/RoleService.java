package com.thp.simplecontext.service;

import java.util.List;


import com.thp.simplecontext.dto.RoleDTO;

public interface RoleService {
	
	 public RoleDTO findRoleById(Long roleId);
	 
	 public List<RoleDTO> findAll();
	 
	 public RoleDTO updateRole( RoleDTO roleDTO, Long roleId );
	 
     public RoleDTO insertRole(RoleDTO role);
     
	 public RoleDTO deleteRole( Long roleId);

}
