package com.LearningPortal.LearningPortal.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.LearningPortal.LearningPortal.entity.CourseEntity;
import com.LearningPortal.LearningPortal.entity.FavoriteEntity;
import com.LearningPortal.LearningPortal.repository.FavoriteRepository;
import com.LearningPortal.LearningPortal.service.FavoriteService;

@Service
public class FavoriteServiceImpl implements FavoriteService {
	
	private final FavoriteRepository favoriteRepository;
	
	public FavoriteServiceImpl(FavoriteRepository favoriteRepository) {
		this.favoriteRepository = favoriteRepository;
	}
    
	@Override
	public List<FavoriteEntity> findAllFavorites() {
		// TODO Auto-generated method stub
		return favoriteRepository.findAll();
	}

	@Override
	public Optional<FavoriteEntity> findFavoriteById(Long id) {
		// TODO Auto-generated method stub
		return favoriteRepository.findById(id);
	}

	@Override
	public FavoriteEntity saveFavorite(FavoriteEntity favoriteEntity) {
		// TODO Auto-generated method stub
		return favoriteRepository.save(favoriteEntity);
	}

	@Override
	public void deleteFavorite(Long favoriteId) {
		// TODO Auto-generated method stub
		favoriteRepository.deleteById(favoriteId);
		
	}

	
}
