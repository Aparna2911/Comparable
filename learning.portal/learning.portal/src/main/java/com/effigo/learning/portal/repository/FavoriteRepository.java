package com.effigo.learning.portal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.effigo.learning.portal.entity.FavoriteEntity;

@Repository
public interface FavoriteRepository extends JpaRepository<FavoriteEntity, Long> {

	// Method to retrieve only active (not soft-deleted) favorites
	List<FavoriteEntity> findByDeletedFalse();

	// Override delete method to perform soft delete
	@Override
	default void delete(FavoriteEntity favoriteEntity) {
		favoriteEntity.setDeleted(true);
		save(favoriteEntity);
	}

	// Override deleteById method to perform soft delete
	@Override
	default void deleteById(Long id) {
		findById(id).ifPresent(favoriteEntity -> {
			favoriteEntity.setDeleted(true);
			save(favoriteEntity);
		});
	}

	List<FavoriteEntity> findByDeletedTrue();

	//native query for getting the list of favorites for a specific user
	@Query(value = "SELECT * FROM favorite WHERE user_id = ?1", nativeQuery = true)
	List<FavoriteEntity> findByUserId(long userId);
}
