package com.thp.simplecontext.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.simplecontext.dto.RoleDTO;
import com.thp.simplecontext.entity.Role;
import com.thp.simplecontext.repository.RoleRepository;
import com.thp.simplecontext.service.RoleService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class RoleServiceImpl implements RoleService{

	
	@Autowired
	RoleRepository roleRepository  ;
	
	 	private ModelMapper modelMapper = new ModelMapper();

	
	
	@Override
	public RoleDTO insertRole(RoleDTO roleDTO) {
		
		return modelMapper.map(roleRepository.save(modelMapper.map(roleDTO,Role.class)),RoleDTO.class);
		
	}
	
	
	@Override
	public RoleDTO updateRole(RoleDTO roleDTO, Long roleId) {
     
		
		roleDTO.setRoleId(roleId);
		
		return insertRole(roleDTO);
	}
	
	
	@Override
	public RoleDTO findRoleById(Long roleId) {
		
		Optional<Role> roleRendred = roleRepository.findById(roleId);
      	RoleDTO roleDTORendred =modelMapper.map(roleRendred.get(), RoleDTO.class);	

		return roleDTORendred ;
	}
	
	@Override
	public RoleDTO deleteRole( Long roleId) {
		RoleDTO roleDTO = this.findRoleById(roleId);
		roleRepository.deleteById(roleId); 
        
		 return roleDTO ;
	}


	

	
	

	@Override
	public List<RoleDTO> findAll() {

		return null;
	}



	



	


	












	
	
	

}
