package com.thp.simplecontext.service;

import java.util.List;

import com.thp.simplecontext.entity.Recherche;

public interface RechercheService {

	 public Recherche findRechercheById(Long id);
	 public List<Recherche> findAll();
	 public void updateRecherche(Long id, Recherche recherche);
     public void insertRecherche(Recherche recherche);
	 public void deleteRecherche(Long id);
}
