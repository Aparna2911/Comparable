package com.effigo.learning.portal.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.effigo.learning.portal.dto.Categorydto;
import com.effigo.learning.portal.service.CategoryService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public List<Categorydto> findAllCategory() {
		log.info("List of Categories:");
		return categoryService.findAllCategories();
	}

	@GetMapping("/{categoryId}")
	public ResponseEntity<Categorydto> findCategoryById(@PathVariable("categoryId") Long id) {
		try {
			Categorydto categoryDto = categoryService.findCategoryById(id);
			return ResponseEntity.ok(categoryDto);
		} catch (NoSuchElementException e) {
			log.info("category not found");
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public void deleteCategory(@PathVariable("id") Long id) {
		log.info("category is deleted");
		categoryService.deleteCategory(id);
	}

	@PostMapping("/save/{userId}/{categoryId}")
	public ResponseEntity<Categorydto> saveCategory(@PathVariable Long userId, @PathVariable Long categoryId,
			@RequestBody Categorydto categorydto) {

		if (!categoryService.isUserAuthorizedToSaveCategory(userId, categoryId)) {

			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		}

		Categorydto saveCategory = categoryService.saveCategory(categorydto);
		return ResponseEntity.ok(saveCategory);
	}

	@PutMapping("/update/{userId}/{categoryId}")
	public ResponseEntity<Categorydto> updateCategory(@PathVariable Long userId, @PathVariable Long categoryId,
			@RequestBody Categorydto categorydto) {

		if (!categoryService.isUserAuthorizedToUpdateCategory(userId, categoryId)) {

			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		}

		Categorydto updatedCategory = categoryService.updateCategory(categorydto, categoryId);
		return ResponseEntity.ok(updatedCategory);
	}
}
