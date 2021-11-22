package com.thp.simplecontext.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thp.simplecontext.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
