package com.LearningPortal.LearningPortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LearningPortal.LearningPortal.dto.Favoritedto;
import com.LearningPortal.LearningPortal.service.FavoriteService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/favorites")
public class FavoriteController {

	@Autowired
	private FavoriteService favoriteService;

	@GetMapping
	public List<Favoritedto> findAllFavorite() {
		log.info("feching all the favourites");
		return favoriteService.findAllFavorite();
	}

	@GetMapping("/{favouriteId}")
	public Favoritedto findFavoriteById(@PathVariable("favouriteId") Long id) {
		log.info("feching all the favourites by id");
		return favoriteService.findFavoriteById(id);
	}

	@PostMapping
	public Favoritedto saveFavourite(@RequestBody Favoritedto request) {
		log.info("favourite is created");
		return favoriteService.saveFavorite(request);
	}

	@DeleteMapping("/{id}")
	public void deleteFavourite(@PathVariable("id") Long id) {
		log.info("favourite is deleted");
		favoriteService.deleteFavourite(id);
	}

}
