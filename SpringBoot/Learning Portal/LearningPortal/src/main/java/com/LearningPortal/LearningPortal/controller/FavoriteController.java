package com.LearningPortal.LearningPortal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LearningPortal.LearningPortal.entity.CourseEntity;
import com.LearningPortal.LearningPortal.entity.FavoriteEntity;
import com.LearningPortal.LearningPortal.service.FavoriteService;

@RestController
@RequestMapping("/favorites")
public class FavoriteController {

	private final FavoriteService favoriteService;

	public FavoriteController(FavoriteService favoriteService) {
		this.favoriteService = favoriteService;
	}

	@GetMapping
	public List<FavoriteEntity> findAllFavorites() {
		return favoriteService.findAllFavorites();
	}

	@GetMapping("/{id}")
	public Optional<FavoriteEntity> findFavoriteById(@PathVariable("id") Long id) {
		return favoriteService.findFavoriteById(id);
	}

	@PostMapping
	public FavoriteEntity saveFavorite(@RequestBody FavoriteEntity favoriteEntity) {
		return favoriteService.saveFavorite(favoriteEntity);
	}

	@PutMapping
	public FavoriteEntity updateFavorite(@RequestBody FavoriteEntity favoriteEntity) {
		Long id = favoriteEntity.getFavorite_id();
		Optional<FavoriteEntity> checkExistingFavorite = findFavoriteById(id);
		if (!checkExistingFavorite.isPresent())
			throw new RuntimeException("Favorite Id " + id + " Not Found!");
		return favoriteService.saveFavorite(favoriteEntity);
	}

	@DeleteMapping("/{id}")
	//for the soft delete
    public ResponseEntity<Void> deleteFavorite(@PathVariable("id") Long id) {
        Optional<FavoriteEntity> favoriteOptional = favoriteService.findFavoriteById(id);
        if (favoriteOptional.isPresent()) {
            FavoriteEntity favorite = favoriteOptional.get();
            // Set the deleted flag to true
            favorite.setDeleted(true);
            favoriteService.saveFavorite(favorite);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	@GetMapping("/users/{userId}/favorites")
	//for getting the list of favorites of a specific user
    public List<CourseEntity> getFavoriteCourses(@PathVariable Long userId) {
        return favoriteService.getFavoriteCoursesByUserId(userId);
    }
}
