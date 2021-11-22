package com.thp.simplecontext.service;

import java.util.List;

import com.thp.simplecontext.entity.Favoris;

public interface FavorisService {
	
	 public Favoris findFavorisById(Long id);
	 public List<Favoris> findAll();
	 public void updateFavoris(Long id, Favoris favoris);
     public void insertFavoris(Favoris favoris);
	 public void deleteFavoris(Long id);

}
