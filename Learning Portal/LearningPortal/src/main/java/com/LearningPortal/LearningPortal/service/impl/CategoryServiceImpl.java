package com.LearningPortal.LearningPortal.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.LearningPortal.LearningPortal.entity.CategoryEntity;
import com.LearningPortal.LearningPortal.repository.CategoryRepository;
import com.LearningPortal.LearningPortal.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	private final CategoryRepository categoryRepository ;
	
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<CategoryEntity> findAllCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Optional<CategoryEntity> findCategoryById(Long id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id);
	}

	@Override
	public CategoryEntity saveCategory(CategoryEntity categoryEntity) {
		// TODO Auto-generated method stub
		return categoryRepository.save(categoryEntity);
	}

	@Override
	public CategoryEntity updateCategory(CategoryEntity categoryEntity) {
		// TODO Auto-generated method stub
		return categoryRepository.save(categoryEntity);

	}

	@Override
	public void deleteCategory(Long id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
	}
}
