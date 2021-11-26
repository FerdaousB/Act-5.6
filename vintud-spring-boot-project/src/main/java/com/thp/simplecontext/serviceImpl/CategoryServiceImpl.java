package com.thp.simplecontext.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thp.simplecontext.dto.CategoryDTO;
import com.thp.simplecontext.entity.Category;
import com.thp.simplecontext.repository.CategoryRepository;
import com.thp.simplecontext.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository  ;
	
	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public CategoryDTO findCategoryById(Long categoryId) {
		
		Optional<Category> categoryRendred = categoryRepository.findById(categoryId);
		if(categoryRendred.isPresent()) {
			return modelMapper.map(categoryRendred.get(), CategoryDTO.class);	
		}

		return null ;
	}

	@Override
	public List<CategoryDTO> findAll() {

		List<Category> categories = categoryRepository.findAll();
		List<CategoryDTO> categoriesDTO = new ArrayList<>();
		
		for(int i=0 ; i< categories.size(); i++)
		{
			categoriesDTO.add(modelMapper.map(categories.get(i), CategoryDTO.class));
		}
		categoryRepository.findAll();
		
				
				return categoriesDTO ;
	}

	@Override
	public CategoryDTO updateCategory(CategoryDTO categoryDTO) {
		return insertCategory(categoryDTO);		}

	@Override
	public CategoryDTO insertCategory(CategoryDTO categoryDTO) {
		return modelMapper.map(categoryRepository.save(modelMapper.map(categoryDTO,Category.class)),CategoryDTO.class);
	}

	@Override
	public CategoryDTO deleteCategory(Long categoryId) {


		CategoryDTO categoryDTO = this.findCategoryById(categoryId);
		categoryRepository.deleteById(categoryId); 
        
		 return categoryDTO ;
	}

	
	
	

}
