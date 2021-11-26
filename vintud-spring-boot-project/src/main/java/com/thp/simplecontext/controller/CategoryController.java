package com.thp.simplecontext.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thp.simplecontext.dto.CategoryDTO;
import com.thp.simplecontext.serviceImpl.CategoryServiceImpl;

@RestController
@RequestMapping(value = "/categoryManagement")
public class CategoryController {
	
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;

	
	@PostMapping(value = "/addCategory")
	public CategoryDTO insertCategory(@RequestBody CategoryDTO categoryDTO) {
		return categoryServiceImpl.insertCategory(categoryDTO);
		
	}
	
	@PostMapping(value = "/updateCategory")
	public CategoryDTO updateCategory(@RequestBody CategoryDTO categoryDTO) {
		
		return categoryServiceImpl.updateCategory(categoryDTO);
		
		
	}
	@GetMapping(value = "/categories")
	public List<CategoryDTO> findAll() {

		return categoryServiceImpl.findAll();
	}
	
	@GetMapping(value = "/findCategoryById/{categoryId}")
	public CategoryDTO findCategoryById(@PathVariable Long categoryId) {
         
		return categoryServiceImpl.findCategoryById(categoryId);
	}
	
	
	@DeleteMapping(value = "/deleteCategory/{categoryId}")
    public CategoryDTO deleteCategory(@PathVariable Long categoryId) {

		return categoryServiceImpl.deleteCategory(categoryId);
	}

}