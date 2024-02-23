package com.effigo.learning.portal.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.effigo.learning.portal.dto.Categorydto;
import com.effigo.learning.portal.entity.CategoryEntity;
import com.effigo.learning.portal.mapper.CategoryMapper;
import com.effigo.learning.portal.repository.CategoryRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CategoryService {

	private final CategoryRepository categoryRepository;

	private final CategoryMapper categorymapper;

	public CategoryService(CategoryRepository categoryRepository, CategoryMapper categorymapper) {
		super();
		this.categoryRepository = categoryRepository;
		this.categorymapper = categorymapper;
	}

	public List<Categorydto> findAllCategories() {
		List<CategoryEntity> user = categoryRepository.findAll();
		return categorymapper.toDto(user);
	}

	public Categorydto findCategoryById(Long id) {
		Optional<CategoryEntity> user = categoryRepository.findById(id);
		if (user.isPresent()) {
			CategoryEntity categoryEntity = user.get();
			return categorymapper.toDto(categoryEntity);
		} else {

			throw new NoSuchElementException("Category with ID " + id + " not found");
		}
	}

	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}

	public Categorydto saveCategory(Categorydto userrequest) {
		CategoryEntity userEntity = categorymapper.toEntity(userrequest);
		categoryRepository.save(userEntity);
		return categorymapper.toDto(userEntity);
	}

	public Categorydto updateCategory(Categorydto userrequest, Long uid) {
		Optional<CategoryEntity> checkExistinguser = categoryRepository.findById(uid);
		if (!checkExistinguser.isPresent())
			log.error("Category Id " + uid + " Not Found!");
		CategoryEntity userEntity = categorymapper.toEntity(userrequest);
		categoryRepository.save(userEntity);
		return categorymapper.toDto(userEntity);

	}

}
