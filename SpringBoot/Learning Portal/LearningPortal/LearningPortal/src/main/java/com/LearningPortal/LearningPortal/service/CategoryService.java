package com.LearningPortal.LearningPortal.service;

import java.util.List;
import java.util.Optional;

import com.LearningPortal.LearningPortal.entity.CategoryEntity;

public interface CategoryService {
	
	List<CategoryEntity> findAllCategories();
	Optional<CategoryEntity> findCategoryById(Long id);
	CategoryEntity saveCategory(CategoryEntity categoryEntity);
	CategoryEntity updateCategory(CategoryEntity categoryEntity);
	 void deleteCategory(Long id);

}
