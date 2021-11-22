package com.thp.simplecontext.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.simplecontext.dto.RoleDTO;
import com.thp.simplecontext.entity.Role;
import com.thp.simplecontext.mapper.EntityDtoMapper;
import com.thp.simplecontext.repository.RoleRepository;
import com.thp.simplecontext.service.RoleService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class RoleServiceImpl implements RoleService{

	
	@Autowired
	RoleRepository roleRepository  ;
	@Autowired
	private EntityDtoMapper entityDtoMapper;
	
	
	@Override
	public RoleDTO insertRole(RoleDTO roleDto) {
		
		Role role =entityDtoMapper.roleDtoToEntity(roleDto);
		Role roleRendred = roleRepository.save(role);
		RoleDTO RoleDtoRendred = entityDtoMapper.roleEntityToDTO(roleRendred);
		return RoleDtoRendred;
		
	}
	@Override
	public RoleDTO updateRole(RoleDTO role) {	
		
		return null;
	}

	
	

	@Override
	public List<RoleDTO> findAll() {

		return null;
	}



	@Override
	public RoleDTO findRoleById(Long id) {

		return null;
	}



	


	@Override
	public RoleDTO deleteRole(Long id) {

		return null;
	}

	
	

}
