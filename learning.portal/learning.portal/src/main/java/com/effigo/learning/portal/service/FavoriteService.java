package com.effigo.learning.portal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.effigo.learning.portal.dto.Favoritedto;
import com.effigo.learning.portal.entity.FavoriteEntity;
import com.effigo.learning.portal.mapper.FavoriteMapper;
import com.effigo.learning.portal.repository.FavoriteRepository;

@Service
public class FavoriteService {

	@Autowired
	FavoriteRepository favoriteRepository;

	@Autowired
	FavoriteMapper favoriteMapper;

	public List<Favoritedto> findAllFavorite() {
		List<FavoriteEntity> user = favoriteRepository.findAll();
		return favoriteMapper.toDto(user);
	}

	public Favoritedto findFavoriteById(Long id) {
		Optional<FavoriteEntity> user = favoriteRepository.findById(id);
		if (user.isPresent()) {
			FavoriteEntity entity = user.get();
			return favoriteMapper.toDto(entity);
		}
		return null;
	}

	public Favoritedto saveFavorite(Favoritedto userrequest) {
		FavoriteEntity favoriteEntity = favoriteMapper.toEntity(userrequest);
		favoriteRepository.save(favoriteEntity);
		return favoriteMapper.toDto(favoriteEntity);
	}

	public void restoreSoftDeletedFavorites() {
		List<FavoriteEntity> softDeletedFavorites = favoriteRepository.findByDeletedTrue();
		softDeletedFavorites.forEach(favorite -> {
			favorite.setDeleted(false);
			favoriteRepository.save(favorite);
		});
	}

	public void deleteFavourite(Long id) {
		favoriteRepository.deleteById(id);
	}

	public List<FavoriteEntity> findByUserId(long userId) {

		return favoriteRepository.findByUserId(userId);
	}

}
