package com.LearningPortal.LearningPortal.service;

import java.util.List;
import java.util.Optional;

import com.LearningPortal.LearningPortal.entity.CourseEntity;
import com.LearningPortal.LearningPortal.entity.FavoriteEntity;

public interface FavoriteService {
	List<FavoriteEntity> findAllFavorites();
	Optional<FavoriteEntity> findFavoriteById(Long id);
	FavoriteEntity saveFavorite(FavoriteEntity favoriteEntity);
	void restoreSoftDeletedFavorites();
	List<CourseEntity> getFavoriteCoursesByUserId(Long userId);

}
