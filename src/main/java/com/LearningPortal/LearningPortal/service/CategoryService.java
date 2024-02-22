package com.LearningPortal.LearningPortal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearningPortal.LearningPortal.dto.Categorydto;
import com.LearningPortal.LearningPortal.entity.CategoryEntity;
import com.LearningPortal.LearningPortal.mapper.CategoryMapper;
import com.LearningPortal.LearningPortal.repository.CategoryRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	CategoryMapper categorymapper;

	public List<Categorydto> findAllCategories() {
		List<CategoryEntity> user = categoryRepository.findAll();
		return categorymapper.toDto(user);
	}

	public Categorydto findCategoryById(Long id) {
		Optional<CategoryEntity> user = categoryRepository.findById(id);
		return categorymapper.toDto(user);
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
