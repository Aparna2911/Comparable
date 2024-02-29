package com.effigo.learning.portal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.effigo.learning.portal.entity.FavoriteEntity;

@Repository
public interface FavoriteRepository extends JpaRepository<FavoriteEntity, Long> {

	List<FavoriteEntity> findByDeletedFalse();

	@Override
	default void delete(FavoriteEntity favoriteEntity) {
		favoriteEntity.setDeleted(true);
		save(favoriteEntity);
	}

	@Override
	default void deleteById(Long id) {
		findById(id).ifPresent(favoriteEntity -> {
			favoriteEntity.setDeleted(true);
			save(favoriteEntity);
		});
	}

	List<FavoriteEntity> findByDeletedTrue();

	@Query(value = "SELECT * FROM favorite WHERE user_id = ?1", nativeQuery = true)
	List<FavoriteEntity> findByUserId(long userId);
}
