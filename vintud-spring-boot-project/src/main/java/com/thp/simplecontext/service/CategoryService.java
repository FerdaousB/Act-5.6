package com.thp.simplecontext.service;

import java.util.List;

import com.thp.simplecontext.dto.CategoryDTO;

public interface CategoryService {
	

	 public CategoryDTO findCategoryById(Long categoryId);
	 
	 public List<CategoryDTO> findAll();
	 
	 public CategoryDTO updateCategory(CategoryDTO categoryDTO);
	 
    public CategoryDTO insertCategory(CategoryDTO categoryDTO);
    
	 public CategoryDTO deleteCategory(Long categoryId);


}
