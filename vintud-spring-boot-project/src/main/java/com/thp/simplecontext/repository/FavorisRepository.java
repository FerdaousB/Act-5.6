package com.thp.simplecontext.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thp.simplecontext.entity.Favoris;

@Repository
public interface FavorisRepository extends JpaRepository<Favoris, Long> {

}
