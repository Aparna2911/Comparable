package com.LearningPortal.LearningPortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LearningPortal.LearningPortal.dto.Categorydto;
import com.LearningPortal.LearningPortal.service.CategoryService;

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
	public Categorydto findCategoryById(@PathVariable("categoryId") Long id) {
		log.info("category of is:");
		return categoryService.findCategoryById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteCategory(@PathVariable("id") Long id) {
		log.info("category is deleted");
		categoryService.deleteCategory(id);
	}

	@PostMapping
	public Categorydto saveCategory(@RequestBody Categorydto request) {
		log.info("category is created");
		return categoryService.saveCategory(request);
	}

	@PutMapping("/update/{id}")
	public Categorydto updateCategory(@RequestBody Categorydto dto, @PathVariable("id") Long id) {
		log.info("category of this" + id + "is udated");
		return categoryService.updateCategory(dto, id);
	}

}