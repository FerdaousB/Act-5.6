package com.thp.simplecontext.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thp.simplecontext.entity.Recherche;

@Repository
public interface RechercheRepository extends JpaRepository<Recherche, Long>{

}
