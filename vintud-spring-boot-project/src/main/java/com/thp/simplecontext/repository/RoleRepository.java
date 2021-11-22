package com.thp.simplecontext.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thp.simplecontext.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
