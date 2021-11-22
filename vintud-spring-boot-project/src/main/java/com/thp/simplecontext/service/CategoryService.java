package com.thp.simplecontext.service;

import java.util.List;

import com.thp.simplecontext.entity.Category;

public interface CategoryService {
	
	 public Category findCategoryById(Long id);
	 public List<Category> findAll();
	 public void updateCategory(Long id, Category category);
     public void insertCategory(Category category);
	 public void deleteCategory(Long id);

}
